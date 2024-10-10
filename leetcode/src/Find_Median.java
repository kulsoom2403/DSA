import java.util.Arrays;

public class Find_Median {
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2};
        int[] merge = new int[nums1.length + nums2.length];
       for( int i = 0; i < nums1.length;i++) {
           merge[i] = nums1[i];
       }
           for(int j = 0; j < nums2.length;j++) {
               merge[nums1.length + j] = nums2[j];
           }

           for(int array : merge){
               Arrays.sort(merge);

           }
           int size = merge.length;
           int n;


           if(size%2==0){
                int mid1= size/2;
                int mid2 = mid1 -1;
               System.out.println((merge[mid1]+merge[mid2])/2.0);
           }
           else {
                int mid = size/2;
               System.out.println(merge[mid]);



           }



    }
}
