class Majoritynumber {  // Class name matches the file name
    public static void main(String[] args) {
        // Example input array
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // Create an instance of the Solution class
        majorityElement solution = new majorityElement();

        // Call the majorityElement method
        int majorityElement = solution.majorityElement(nums);

        // Print the result
        System.out.println("The majority element is: " + majorityElement);
    }
}

// Solution class containing the majorityElement method
class majorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cand = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                cand = nums[i];
            }
            if (cand == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return cand;
    }
}
