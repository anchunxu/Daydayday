package Day16HomeWork;

import java.util.Arrays;

public class Home04Test {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Arrays.toString(suShu(66)));
    }

    public static int[] suShu(int n){
        int[] arr = new int[n];

        int index=0;
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if(i%j==0) {
                    flag=false;
                    break;
                }
            }
            if(flag) {
                arr[index++] = i;
            }
        }
        return Arrays.copyOf(arr, index);
    }
}
