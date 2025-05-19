public class May_19 {

        public String triangleType(int[] nums) {
            if(nums.length != 3){
                return"Invalid Triangle";
            }
            int a = nums[0];
            int b = nums[1];
            int c = nums[2];

            if (a + b <= c || a + c <= b || b + c <= a) {
                return"none";
            }
            if(a==b && b== c) {
                return"equilateral";
            }
            else if(a == b || b == c || c==a) {
                return"isosceles";
            }
            else {
                return"scalene";
            }


        }

    public static void main(String[] args) {
        int[] nums ={1,1,1};
        May_19 obj = new May_19();
        String result = obj.triangleType(nums);
        System.out.println(result);
    }
}
