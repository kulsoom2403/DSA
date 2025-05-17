public class May_17 {

        public int sortColors(int[] nums) {//[2,0,2,1,1,0]
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while(mid <= high) {
                if(nums[mid] == 0) {
                    swap(nums,low,mid);
                    low++;
                    mid++;
                }
                else if(nums[mid] == 1){
                    mid++;
                }
                else{
                    swap(nums,mid,high);
                    high--;
                }
            }
            return low;
        }
        private void swap(int[] nums,int i ,int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

        }

    public static void main(String[] args) {
        int[] nums ={2,0,2,1,1,0};
        May_17 obj = new May_17();
         obj.sortColors(nums);
         printnum(nums);


    }
    private static void printnum(int[] arr){
            for(int num:arr){
                System.out.print(num+" ");
            }
        System.out.println();
    }

}
