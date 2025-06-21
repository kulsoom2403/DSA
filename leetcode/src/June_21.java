import java.util.*;

public class June_21 {



        public int minimumDeletions(String s, int k) {
            Map<Character, Integer> freq = new HashMap<>();

            // Step 1: Count frequency of each character
            for (char c : s.toCharArray()) {
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }

            // Step 2: Store all frequencies in a list
            List<Integer> freqList = new ArrayList<>(freq.values());
            Collections.sort(freqList); // Sort ascending

            int minDeletions = Integer.MAX_VALUE;

            for (int i = 0; i < freqList.size(); i++) {
                int deletions = 0;
                int targetFreq = freqList.get(i); // try to make all freqs in range [targetFreq, targetFreq + k]

                for (int f : freqList) {
                    if (f < targetFreq) {
                        deletions += f; // delete all of this char
                    } else if (f > targetFreq + k) {
                        deletions += f - (targetFreq + k); // reduce it
                    }
                }
                minDeletions = Math.min(minDeletions, deletions);
            }

            return minDeletions;
        }

    public static void main(String[] args) {
        String s = "aabcaac";
        int k  = 2;
        June_21 obj = new June_21();
        int result = obj.minimumDeletions(s,k);
        System.out.println(result);
    }

}
