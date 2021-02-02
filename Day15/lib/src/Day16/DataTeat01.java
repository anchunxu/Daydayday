package Day16;

import java.util.Date;

public class DataTeat01 {

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("date1.toString() = " + date1.toString());
        java.sql.Date date2 = new java.sql.Date(3252525135L);
        System.out.println(date2);
        System.out.println(date2.getTime());
        date2.setTime(3252525135L);
    }


}
