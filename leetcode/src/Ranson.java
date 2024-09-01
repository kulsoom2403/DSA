 class Ransonnote {
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";


        Ranson solution = new Ranson();


        boolean canConstruct = solution.canConstruct(ransomNote, magazine);


        System.out.println("Can the ransom note be constructed from the magazine? " + canConstruct);
    }
}

// Solution class containing the canConstruct method
class Ranson {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        for (char ch : ransomNote.toCharArray()) {
            count[ch - 'a']--;

            if (count[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
