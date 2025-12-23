import java.util.*;

public class minArray {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,2,5,9,2,3,2};
        int min = arr[0];
        int count = 0;

        for(int i = 1;i < arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                count++;
            }
        }

    }
}
