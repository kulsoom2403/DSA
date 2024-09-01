class Main1 {
    public static void main(String[] args) {

        String s = "abccccdd";


        Longest_Palidrome solution = new Longest_Palidrome();


        int longestPalindromeLength = solution.longestPalindrome(s);


        System.out.println("The length of the longest palindrome that can be built is: " + longestPalindromeLength);
    }
}


class Longest_Palidrome {
    public int longestPalindrome(String s) {
        int[] arr = new int[128];

        for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        int result = 0;
        for (int i = 65; i < 128; i++) {
            int val = arr[i];
            result = result + (val / 2) * 2;

            if (result % 2 == 0 && val % 2 == 1) {
                result++;
            }
        }
        return result;
    }
}
