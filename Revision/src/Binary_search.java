public class Binary_search {
    public static int binary(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        int mid=(i+j)/2;
        while (i<=j){
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else {
                i=mid+1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int target=30;
        System.out.println(binary(arr,target));
    }
}
