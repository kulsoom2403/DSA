import java.util.*;

public class SumOfTree {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        if (nums == null || nums.length < 3){
            return new ArrayList<> ();
        }

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];

                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        SumOfTree sft = new SumOfTree();
        List res = sft.threeSum(nums);
        System.out.println(res);
    }
}
