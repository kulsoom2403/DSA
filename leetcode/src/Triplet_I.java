public class Triplet_I {

        public long maximumTripletValue(int[] nums) {
            long res = 0,nums1 = 0,nums2 = 0,nums3 = 0;
            int n = nums.length;

            for(int i = 0; i < n;i++) {
                nums1 = nums[i];
                for(int j = i +1; j < n;j++) {
                    nums2 = nums[j];
                    for(int k = j+1;k < n;k++) {
                        nums3 = nums[k];
                        long temp = (nums1-nums2)*nums3;
                        if( temp >res) {
                            res = temp;

                        }
                    }
                }

            }
            return res;



        }

    public static void main(String[] args) {
        int[] nums = {2,1,4,53,3};
        Triplet_I obj = new Triplet_I();
        long res = obj.maximumTripletValue(nums);
        System.out.println(res);

    }
}
