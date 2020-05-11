import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
class FCTRL {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int input = Integer.parseInt(br.readLine());
            int temp = input;
            int mul = 5;
            int zeros = 0;
            while (true) {
                int a = temp / mul;
                if (a == 0) {
                    break;
                }
                zeros += a;
                mul *= 5;
            }
            out.println(zeros);
            out.flush();
        }
        out.close();
    }
}