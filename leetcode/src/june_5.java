public class june_5{

        int[] arr = new int[26];

        public String smallestEquivalentString(String s1, String s2, String baseStr) {
            for(int i = 0; i < 26;i++) {
                arr[i] = i;
            }
            for(int i = 0; i <s1.length();i++) {
                union(s1.charAt(i) - 'a',s2.charAt(i) - 'a');
            }


            StringBuilder sb = new StringBuilder();
            for(char c:baseStr.toCharArray()){
                char small = (char)(find(c -'a')+'a');
                sb.append(small);
            }
            return sb.toString();

        }
        public int find(int x){
            if(arr[x] != x){
                arr[x] = find(arr[x]);

            }
            return arr[x];
        }
        public void union(int x,int y){
            int px = find(x);
            int py = find(y);

            if(px == py){
                return;
            }
            if(px < py){
                arr[py ] = px;
            }
            else{
                arr[px] = py;
            }
        }

    public static void main(String[] args) {
        String s1 = "parker";
        String s2 = "morris";
        String baseStr = "parsed";

        june_5 obj = new june_5();
        String result = obj.smallestEquivalentString(s1,s2,baseStr);

        System.out.println(result);

    }
}
