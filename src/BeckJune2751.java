import java.util.Scanner;
public class BeckJune2751 {
 private static void buildMinHeap(int [] array){
     int arrayLength=array.length;
     for(int i=arrayLength;i>=0;i--){
         //힙정렬 구성
     }
 }

 private static void minheapidy(int[] array, int i){
     //자식과 비교해서 바꿈

     int leftchild=i*2+1;
     int rightchild=i*2+2;
     int arrayLength=array.length;
     int temp;
     //자식이 없을때
     if(leftchild>arrayLength||rightchild>arrayLength){
         return;
     }
     //자식과 i번째 노드와 비교해서 제일 작은거와 바꿈
     if(array[leftchild]<array[rightchild]){
         
     }

 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //배열을 힙정렬로 만들기
        int num = sc.nextInt();
        int[] array= new int[num];

        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
        }



    }

}