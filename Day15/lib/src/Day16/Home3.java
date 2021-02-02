package Day16;

import org.junit.Test;

public class Home3 {
    @Test
    public static void main(String[] args) {
    String [] arr = {"a","b","c","d","e","f","g","h"};
        int index = two(arr,"d");
        if (index !=-1){
            System.out.println(index);
        }else
            System.out.println("查无此元素");
    }
    public static int two (String arr[],String ele) {
        int statr = 0;
        int end = arr.length-1;

        while (statr <= end){
            int min = (statr+end)/2;
            String result = arr[min];

                if (ele.compareTo(result)>0){
                statr = min +1;
            }else if (ele.compareTo(result)<0){
                end = min - 1;
            }else return min;
        }
       return -1;
    }
}

