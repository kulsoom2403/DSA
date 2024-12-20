public class DuplicateRemove2 {

    // Method to remove duplicates allowing each element at most twice
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 1;  // At least one element is always there
        for (int i = 1; i < nums.length; i++) {
            // If the current number is a duplicate, ensure it appears at most twice
            if (nums[i] == nums[i - 1]) {
                // Only allow the second occurrence
                if (count < 2 || nums[i] != nums[count - 2]) {
                    nums[count] = nums[i];
                    count++;
                }
            } else {
                // If it's not a duplicate, add it to the list
                nums[count] = nums[i];
                count++;
            }
        }
        return count;  // Return the length of the array after removing duplicates
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};  // Input array
        DuplicateRemove2 obj = new DuplicateRemove2();  // Create object of DuplicateRemove2
        int newLength = obj.removeDuplicates(nums);  // Get new length after removing duplicates

        // Print the array elements up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
