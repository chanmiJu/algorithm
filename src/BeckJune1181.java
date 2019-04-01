import java.util.Scanner;
import java.io.*;
import java.util.*;
public class BeckJune1181 {

    private static void arraysort(String[] array) {
        int len = array.length;
        String temp;
        int j=0;
        for(int i=1;i<len;i++) {
            temp=array[i];
            for(j=i-1;j>=0&&temp.length()<array[j].length();j--) {
                array[j+1]=array[j];
            }
            array[j+1]=temp;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());




        String[] word=new String[n];

        //배열에 하나씩 담음.

        for(int i =0;i<n;i++) {
            word[i]=br.readLine();
        }

        arraysort(word);

        //삽입정렬로 길이순으로 정렬


        //같은 길이인거는 알파벳 순으로 정렬
        int len;
        int len2; int j;
        for(int i=0;i<n;i++) {
            len=word[i].length();
            for(j=i+1;j<n;j++) {
                len2=word[j].length();
                if(len!=len2)break;
            }
            Arrays.sort(word, i,j);
            i=j-1;
        }


        System.out.println(word[0]);
        //중복된거는 출력하지 않는다.
        for(int i=1;i<n;i++) {
            if(word[i-1].equals(word[i]))continue;
            System.out.println(word[i]);
        }
    }
}