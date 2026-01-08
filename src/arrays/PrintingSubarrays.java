package arrays;

public class PrintingSubarrays {
    public static void printingSubarrays(int[] arr) {
        int largest = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                int sum = 0;
                for(int k = i; k<=j; k++){
                    sum += arr[k];
                    System.out.print(arr[k]+", ");
                }
                System.out.println("sum of each subarray: "+sum);
                if(sum > largest){
                    largest = sum;
                }
            }
        }
        System.out.println("largest sum: "+largest);
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60};
        printingSubarrays(arr);
    }
}
