package Day16;
import java.time.LocalDateTime;
import java.util.Date;
public class Test01 {
    public static void main(String[] args) {
        int [] arr = {12,44,66,77,88,99};
        int index = two(arr,77);
        if (index!=-1){
            System.out.println(index);
        }else
            System.out.println("查无此元素");
    }
    public static  int two (int arr[],int ele){
       int statr = 0;
       int end = arr.length-1;

       while (statr <= end){
           int min = (statr+end)/2;
           int result = arr[min];
           if (ele>result){
               statr = min +1;
           }else if (ele < result){
               end = min - 1;
           }else return min;

       }
        return -1;
    }

}
