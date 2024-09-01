class Majoritynumber {
    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};


        majorityElement solution = new majorityElement();


        int majorityElement = solution.majorityElement(nums);


        System.out.println("The majority element is: " + majorityElement);
    }
}
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
