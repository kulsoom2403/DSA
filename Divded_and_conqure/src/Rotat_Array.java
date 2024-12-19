public class Rotat_Array {

    // Method to rotate the array by k steps
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // To handle cases where k is greater than the array length
        reverse(nums, 0, n - 1);  // Reverse the entire array
        reverse(nums, 0, k - 1);  // Reverse the first k elements
        reverse(nums, k, n - 1);  // Reverse the remaining elements
    }

    // Helper method to reverse the array between indices i and j
    public static void reverse(int[] nums, int i, int j) {
        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};  // Initial array
        Rotat_Array obj = new Rotat_Array();
        obj.rotate(nums, 3);  // Rotate the array by 3 positions

        // Print the rotated array
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
