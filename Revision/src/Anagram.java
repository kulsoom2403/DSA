import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean isAnagram(String s,String l){
        char[] s1=s.toCharArray();
        char[] l1=l.toCharArray();
        if(s1.length!=l1.length){
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(l1);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=l1[i]){
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String l=sc.next();
        System.out.println(isAnagram(s,l));
    }
}
