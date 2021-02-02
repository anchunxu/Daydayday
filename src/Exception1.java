public class Exception1 {
        public static void main (String[]args){
            int[] arr = {1, 24, 525};
            try{
                System.out.println(arr[3]);

            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e.getMessage());
            }
        System.out.println(arr[3]);
    }

}
