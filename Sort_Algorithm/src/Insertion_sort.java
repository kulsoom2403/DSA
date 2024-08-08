public class Insertion_sort {
    public void inserction(int[] arr){
        for(int i=1;i<arr.length;i++){
            int sorted=arr[i];
            int j=i-1;
            while (j>=0 && sorted < arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=sorted;

        }
    }
}
