public class LinearSearch {
    public static int ls(int[] a,int element){

        for(int i=0;i<a.length;i++){
            if(a[i]==element)
            {
                return i;
            }

        }
        return -1;

    }


}

