package arrays;

public class PrintingPairs {
    public static void printingPairs(int[] arr){
        for(int i=0; i<arr.length; i++){
            int x = arr[i];
            for(int j= i+1; j<arr.length; j++){
                int y = arr[j];
                System.out.println(x + "," + y);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        printingPairs(arr);

    }
}
