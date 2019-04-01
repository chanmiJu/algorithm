import java.util.Scanner;
public class BeckJune10988 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        word=sc.next();
        int wordLength=word.length();
        char array[]= new char[wordLength];
        //word를 배열에 담기
        for(int i=0;i<wordLength;i++){
            array[i]=word.charAt(i);
        }

        int last_index=wordLength-1;
        int pd=1;
        for(int i=0;i<wordLength;i++){
            if(array[i]!=array[last_index]){
                pd=0;
            }
            last_index--;
        }
    System.out.println(pd);

    }
}
