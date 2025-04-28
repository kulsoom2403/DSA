public class Qes75_8 {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < n) {
            nums[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 0, 3};
        Qes75_8 obj = new Qes75_8();
        obj.moveZeroes(nums); // koi return nahi hoga, direct array modify ho jayega

        for (int num : nums) {
            System.out.print(num + " "); // print each element with space
        }
    }
}
