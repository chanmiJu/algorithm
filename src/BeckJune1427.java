import java.util.Scanner;

public class BeckJune1427 {

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);

        String N = sc.nextLine();

        int size = N.length();

        char[] arr = new char[size];

        for(int i=0;i<N.length();i++){
            arr[i]=N.charAt(i);

        }
        char b;

        for(int i = 0 ; i <  arr.length -1 ; i ++) {
            for(int j = i+1 ; j < arr.length ; j ++) {
                if(arr[i] < arr[j]) {
                    b = arr[j];
                    arr[j] = arr[i];
                    arr[i] = b;
                }
            }
        }

        for(int i = 0 ; i <  arr.length ; i ++) {
            System.out.print(arr[i]);
        }


    }


}
