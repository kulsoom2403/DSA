import java.util.Arrays;

public class Merge_array {
    public static void main(String[] args) {
      int[] num1 = { 1,2,3,0,0,0};
      int[] num2 = {2,5,6};
      int n = 3;
      int m = 3;
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i  >= 0 && j >= 0) {
            if(num1[i] > num2[j]) {
                num1[k] = num1[i];

                i--;
            }
            else {
                num1[k] = num2[j];
                j--;

            }
            k--;
        }
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
        for(int x = 0;x < m+n;x++){
            System.out.println(num1[x]+" ");
        }



    }




}

