public class May_13 {

        public int lengthAfterTransformations(String s, int t)
        {
            int M = 1_000_000_007;
            int[] map = new int[26];

            // Step 1: Count character frequencies
            for(char c : s.toCharArray())
            {
                map[c - 'a']++;
            }

            // Step 2: Perform t transformation steps
            for(int count = 1; count <= t; count++)
            {
                int[] temp = new int[26];

                for(int i = 0; i < 26; i++)
                {
                    char c = (char) (i + 'a');
                    int f = map[i];

                    if(c != 'z')
                    {
                        // Step 2.1: Normal character shifts to next one
                        temp[(c + 1) - 'a'] = (temp[(c + 1) - 'a'] + f) % M;
                    }
                    else
                    {
                        // Step 2.2: 'z' splits into 'a' and 'b'
                        temp['a' - 'a'] = (temp['a' - 'a'] + f) % M;
                        temp['b' - 'a'] = (temp['b' - 'a'] + f) % M;
                    }
                }

                // Step 2.3: Update the map for next iteration
                map = temp;
            }

            // Step 3: Sum final character counts
            int result = 0;
            for(int i = 0; i < 26; i++)
            {
                result = (result + map[i]) % M;
            }

            return result;
        }

    public static void main(String[] args) {
        String s ="abcyy";
        int t = 2;

        May_13 obj  = new May_13();
        int result = obj.lengthAfterTransformations(s,t);
        System.out.println(result);
    }
}
