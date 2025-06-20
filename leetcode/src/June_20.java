public class June_20 {

        public int maxDistance(String s, int k) {
            int size = s.length();
            int n =0;
            int so =0;
            int e =0;
            int w =0;
            int ans = 0;
            for(int  i = 0; i < size;i++){
                if(s.charAt(i) == 'N') n++;
                else if(s.charAt(i) == 'S') so++;
                else if(s.charAt(i) == 'E') e++;
                else  w++;
                ans = Math.max(ans,Math.min(Math.abs(n-so)+Math.abs(w-e) + 2*k,i+1));



            }
            return ans;

        }

    public static void main(String[] args) {
        String s = "NEWS";
        int k =1;
        June_20 obj = new June_20();
        int result = obj.maxDistance(s,k);
        System.out.println(result);
    }
}
