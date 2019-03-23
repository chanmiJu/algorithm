import java.util.Scanner;
public class BeckJune2775 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        int[][] numOfPeople= new int[15][15];

        for(int j=0;j<15;j++){
            numOfPeople[j][0]=1;
            for(int k=0;k<15;k++){
                numOfPeople[0][k]=k+1;
                if(j>=1&&k>=1)
                    numOfPeople[j][k]=numOfPeople[j-1][k]+numOfPeople[j][k-1];
            }
        }


        while(testcase>0) {
            int floor=sc.nextInt();//층
            int unit=sc.nextInt();//호

            System.out.println(numOfPeople[floor][unit-1]);
            testcase--;
        }





    }



}