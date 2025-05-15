import java.util.Scanner;

class Solution {
    public void reverseArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; 
        }
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        solution.reverseArray(arr);
        
        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
