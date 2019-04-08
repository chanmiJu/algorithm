import java.util.Scanner;


public class BeckJune1158 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //n,k를 받는다
        //1부터 n까지 배열생성
        int n = sc.nextInt();
        int k = sc.nextInt();

        int array[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            array[i] = i;
        }

        int js_array[] = new int[n + 1];


        //조세퍼트 배열을 만들기
        //3번째있는배열의 숫자를 js_array에 두고 원래있던 array에는 0을 넣는다.
        //pivot이 지워질 곳의 index, pivot+1

        int pivot = k;

        for (int j = 1; j <= n; j++) {
            js_array[j] = array[pivot];
            // System.out.println("array["+pivot+"]="+array[pivot]);
            array[pivot] = 0;
            int cnt = 0;
            int cnt2 = 0;
            while (true) {
                if (pivot >= n) {
                    pivot = pivot % n;
                }
                pivot++;
                //   System.out.println("pivot="+pivot);
                if (array[pivot] != 0) {
                    cnt++;
                    if (cnt == k) break;
                    // System.out.println("cnt="+cnt);

                }
                if (cnt2 >= n * k) break;
                cnt2++;
            }

        }

        System.out.print("<");
        for (int i = 1; i < n; i++) {
            System.out.print(js_array[i]);
            System.out.print(", ");
        }
        System.out.println(js_array[n] + ">");

    }
}
