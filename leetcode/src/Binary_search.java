import java.util.Scanner;

public class Binary_search {


    class Solution {
        public int search(int[] nums, int target) {
            int i = 0;
            int j = nums.length - 1;

            while (i <= j) {
                int mid = i + (j - i) / 2;

                if (nums[mid] == target) {
                    return mid;
                } else if (nums[mid] > target) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            }

            return -1;
        }
    }


    public static void main(String[] args) {
        Binary_search binarySearch = new Binary_search();
        Solution solution = binarySearch.new Solution();

        Scanner scanner = new Scanner(System.in);

        int[] nums = {1, 2, 4, 6, 7, 9, 12, 14};

        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        int result = solution.search(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }


    }
}
