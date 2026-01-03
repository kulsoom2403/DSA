import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

public class jan_03 {


        // ---------- FAST INPUT ----------
        static class FastScanner {
            private final byte[] buffer = new byte[1 << 16];
            private int ptr = 0, len = 0;
            private final InputStream in = System.in;

            int read() throws IOException {
                if (ptr >= len) {
                    len = in.read(buffer);
                    ptr = 0;
                    if (len <= 0) return -1;
                }
                return buffer[ptr++];
            }

            int nextInt() throws IOException {
                int c, sign = 1, val = 0;
                do {
                    c = read();
                } while (c <= ' ');

                if (c == '-') {
                    sign = -1;
                    c = read();
                }

                while (c > ' ') {
                    val = val * 10 + (c - '0');
                    c = read();
                }
                return val * sign;
            }
        }

        // ---------- FRAME ----------
        static class Frame {
            int val;
            int state; // 0 = left, 1 = right, 2 = output
            Frame(int v) { val = v; }
        }

        public static void main(String[] args) throws Exception {
            FastScanner fs = new FastScanner();
            StringBuilder out = new StringBuilder();

            int T = fs.nextInt();
            while (T-- > 0) {
                int N = fs.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = fs.nextInt();
                }

                Stack<Frame> stack = new Stack<>();
                int idx = 0;

                // Start with root
                if (arr[idx] != -1) {
                    stack.push(new Frame(arr[idx]));
                }
                idx++;

                while (!stack.isEmpty()) {
                    Frame top = stack.peek();

                    if (top.state == 0) { // process left
                        top.state++;
                        if (idx < N && arr[idx] != -1) {
                            stack.push(new Frame(arr[idx]));
                        }
                        idx++;
                    }
                    else if (top.state == 1) { // process right
                        top.state++;
                        if (idx < N && arr[idx] != -1) {
                            stack.push(new Frame(arr[idx]));
                        }
                        idx++;
                    }
                    else { // output
                        out.append(top.val).append(" ");
                        stack.pop();
                    }
                }
                out.append("\n");
            }

            System.out.print(out.toString());
        }

}
