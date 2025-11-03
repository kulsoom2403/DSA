public class nov_03
{

        public int minCost(String colors, int[] neededTime) {

            int n = colors.length();
            int m = neededTime.length;
            int result = 0;
            int pre = neededTime[0];

            for(int i = 1; i < n;i++){
                if(colors.charAt(i) == colors.charAt(i-1)){
                    result =result + Math.min(pre,neededTime[i]);
                    pre = Math.max(pre, neededTime[i]);

                }
                else{
                    pre = neededTime[i];
                }
            }
            return result;



        }

    public static void main(String[] args) {
        String colors = "aabaa";
        int[] arr = {1,2,3,4,1};
        nov_03 obj = new nov_03();
        int result = obj.minCost(colors,arr);
        System.out.println(result);
    }
}
