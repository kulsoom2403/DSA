public class Que75_10 {

        public int maxArea(int[] height) {

            int left =0;
            int right = height.length - 1;
            int max_water = 0;

            while(left < right) {
                int width = right - left;
                int min_height =  Math.min(height[left], height[right]);
                int area = width * min_height;
                max_water = Math.max(max_water,area);

                if(height[left] < height[right]) {
                    left++;
                }
                else {
                    right--;
                }

            }
            return max_water;
        }

    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        Que75_10 obj = new Que75_10();
        int res = obj.maxArea(nums);
        System.out.println(res);
    }
}
