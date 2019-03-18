import java.util.Scanner;
public class BeckJune1193{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int line=0;
        int cnt=0;
        //몇번째 라인인지 찾아냄
        while(true) {
            for(int i=0;i<line+1;i++) {
                cnt++;
            }
            line++;
            if(cnt >=n) break;
        }

        //그 라인에서 몇번째 숫자인지 찾아냄
        int sum=0;
        for(int i=0;i<line;i++) {
            sum +=i;
        }

        int ordinal=n-sum;
        if(line%2==0) {
            System.out.print(ordinal);
            System.out.print("/");
            System.out.print(line+1-ordinal);
        }else {
            System.out.print(line+1-ordinal);
            System.out.print("/");
            System.out.println(ordinal);
        }


    }

}