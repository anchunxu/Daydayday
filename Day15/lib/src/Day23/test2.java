package Day23;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入年");
        int year = in.nextInt();
        System.out.println("请输入月");
        int month = in.nextInt();
        System.out.println("请输入日");
        int day = in.nextInt();
        int days = day;

            for (int i = 1; i < month; i++) {
                if (i == 4 || i == 6 || i == 9 || i == 11) {
                    days += 30;
                } else if (i == 2) {
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        days += 29;
                    } else {
                        days += 28;
                    }
                } else {
                    days += 31;
                }
            }
            System.out.println(year + "年" + month + "月" + day + "是" + year + "年的" + "第" + days + "天");

    }
}
