public class DuplicateRemove {

        public int removeDuplicates(int[] nums) {
            int count = 0;
            for(int i = 0; i < nums.length; i++) {
                if(i < nums.length-1 && nums[i] == nums[i+1]){
                    continue;
                }
                else {

                    nums[count] = nums[i];
                    count++;
                }



            }
            return count;

        }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3};
        DuplicateRemove obj = new DuplicateRemove();
        obj.removeDuplicates(nums);
        for ( int num : nums) {
            System.out.println(num+" ");
        }
    }

}
