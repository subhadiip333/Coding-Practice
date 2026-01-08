package arrays;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total subjects------------->>>");
        int n = sc.nextInt();
        System.out.println("Enter your marks---------->>");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int m : arr){
            System.out.println(m);
        }
    }
}
