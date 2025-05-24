import java.util.Stack;

public class Que75_24 {

        public int[] asteroidCollision(int[] asteroids) {
            int n = asteroids.length;
            Stack<Integer> stack = new Stack<>();


            for(int arr:asteroids){
                boolean destory = false;
                while(!stack.isEmpty() && arr < 0 && stack.peek() > 0){
                    if(stack.peek() < -arr){
                        stack.pop();
                    }
                    else if (stack.peek() == -arr){
                        stack.pop();
                        destory = true;
                        break;
                    }
                    else {
                        destory = true;
                        break;
                    }
                }
                if(!destory){
                    stack.push(arr);
                }

            }
            int[] result = new int[stack.size()];
            for(int i = result.length -1; i >=0;i--){
                result[i] = stack.pop();
            }
            return result;

        }

    public static void main(String[] args) {
        int[] asteroids ={10,2,-5,-15,20,-20,5};
        Que75_24 obj = new Que75_24();
        int[] result = obj.asteroidCollision(asteroids);
        for(int num: result){
            System.out.print(num+" ");
        }
    }

}
