package arrays;

public class PrefixSum {
    public static void printingSubarrays(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        int largest = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                int subarraySum = i > 0 ? prefix[j] - prefix[i - 1] : prefix[j];
                System.out.println("sum of each subarray: "+subarraySum);
                if(subarraySum > largest){
                    largest = subarraySum;
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
