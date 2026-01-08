package searchingAlgorithms;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target){
            for(int i = 0; i<arr.length; i++){
                if(arr[i] == target){
                    return i;
                }
            }

            return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 18, 11, 23, 5, 9, 5, 22, 21};
        int target = 9;
        System.out.println(linearSearch(arr, target));
    }
}
