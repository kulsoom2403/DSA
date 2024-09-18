import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("choice oprtation");

        String operation = sr.nextLine();
        System.out.println("user input");
        int a = sr.nextInt();
        int b = sr.nextInt();
        Calculater c = new Calculater();
        c.a =a;
        c.b= b;

        String s = "add";

        if(operation.equals("add")){

            c.add();
        }
        else if(operation.equals("sub") ){
            c.sub();
        }
        else if(operation.equals("multi")){
            c.multi();
        }
        else if(operation.equals("div")){
            c.div();
        }

        System.out.println(c.result);

       // System.out.println("first number " + a + " second number " + b);


    }
}
