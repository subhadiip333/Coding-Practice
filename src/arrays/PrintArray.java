package arrays;


public class PrintArray {
    public static int[] printArray(int[] arr){
        arr = new int[]{10, 30, 40};
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {20, 11, 13, 17, 19, 21};
        for (int i : printArray(arr)) {
            System.out.println(i);
        }

    }
}
