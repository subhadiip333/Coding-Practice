package arrays;

public class ReverseArray {
    public static int[] reverseArr(int[] arr){
        int s = 0;
        int e = arr.length-1;

       while(s<e){
           int temp = arr[s];
           arr[s] = arr[e];
           arr[e] = temp;
           s++;
           e--;
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 8, 9, 20};
        for(int i : reverseArr(arr)){
            System.out.println(i);
        }
    }
}
