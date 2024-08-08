public class Selection_sort {
    public void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;

                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
}
