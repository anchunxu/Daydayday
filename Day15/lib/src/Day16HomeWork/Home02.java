package Day16HomeWork;

import org.junit.Test;

public class Home02 {

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        int index = two(arr, 11);
        if (index != -1) {
            System.out.println(index);
        } else System.out.println("未找到此元素");
    }

    public static int two(int[] arr, int des) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int min = (start + end) / 2;
            int result = arr[min];
            if (des > result) {
                start = min + 1;
            } else if (des < result) {
                end = min - 1;
            } else return min;
        }
        return -1;
    };
}