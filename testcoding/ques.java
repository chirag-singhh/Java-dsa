// 

public class ques {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 8, 16};
        int[] arr2 = {1, 3, 4};
        System.out.println(Solution(arr1)); // Output: 1 (special)
        System.out.println(Solution(arr2)); // Output: 0 (not special)
    }

    public static int Solution(int[] arr) {
        if (arr.length <= 1) return 1;  // A single element is trivially special

        int sum = arr[0];  // Start with first element

        for (int i = 1; i < arr.length; i++) {
            if (sum >= arr[i]) {
                return 0;  // Not strictly less
            }
            sum += arr[i];  // Update sum
        }

        return 1;  // All checks passed
    }
}
