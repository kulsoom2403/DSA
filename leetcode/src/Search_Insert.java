public class Search_Insert {

        public int searchInsert(int[] nums, int target) {
            for(int i = 0; i < nums.length;i++) {
                if(nums[i] == target) {
                    return i;
                }
                if(nums[i] > target) {
                    return i;
                }

            }
            return nums.length;
        }

    public static void main(String[] args) {
        int[] nums = {2,4,6,8};
        int target = 3;
        Search_Insert search = new Search_Insert();
        int result = search.searchInsert(nums,target);
        System.out.println(result);
    }

}
