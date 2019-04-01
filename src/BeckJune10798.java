import java.util.Scanner;

public class BeckJune10798 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//2차원 배열 선언
        int length;
        int maxLength=0;
        String word;
        char wordArray[][] = new char[5][15];
        //입력한 5줄을 배열에 담는다.
        for (int i = 0; i < 5; i++) {
            word=sc.next();
            length=word.length();
            if(length>maxLength&&length<=15) maxLength=length;
            for(int j=0;j<length;j++){
                wordArray[i][j]=word.charAt(j);//string을 한글자씩 끊어 배열에 담는다.
            }


        }

//세로로 출력하기
        char temp;
        for(int i =0;i<maxLength;i++){
            for(int j=0;j<5;j++){
                temp=wordArray[j][i];
                if(temp!='\0')
                System.out.print(temp);
            }
        }


    }

}