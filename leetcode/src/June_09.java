class June_09{
    public int countNumbers(long curr, long next, int n) {
        int countNum = 0;

        while (curr <= n) {
            countNum += Math.min(next, (long) n + 1) - curr;
            curr *= 10;
            next *= 10;
        }

        return countNum;
    }

    public int findKthNumber(int n, int k) {
        int curr = 1;
        k -= 1; // Since we start from the first number (1), we need k-1 more numbers

        while (k > 0) {
            int count = countNumbers(curr, curr + 1, n);
            if (count <= k) {
                curr++;
                k -= count; // Skipping the elements under the current prefix tree
            } else {
                curr *= 10;
                k -= 1;
            }
        }

        return curr;
    }

    public static void main(String[] args) {
        int n = 20;
        int k = 2;

        June_09 obj = new June_09();
        int result = obj.findKthNumber(n,k);
        System.out.println(result);
    }
}