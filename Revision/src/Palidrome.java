import java.util.Scanner;

public class Palidrome {
    public static boolean isPalidrome(String s){
        s=s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int i=0;
        int j=s.length()-1;
        while (i<j){
            if(s.charAt(i)!=s.charAt(j)){

                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner se=new Scanner(System.in);
        String s=se.next();
        System.out.println(isPalidrome(s));
    }
}
