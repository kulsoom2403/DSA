import java.util.Scanner;

public class Getline {
    // Write your code here

        public static String Getline(String s){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i <s.length();i++){
                if(s.charAt(i) == '\\'){
                    break;
                }
                sb.append(s.charAt(i));
            }
            return sb.toString();
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String result = Getline(s);
            System.out.println(result);
        }

}
