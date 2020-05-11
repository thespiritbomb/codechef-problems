import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
class FLOW008 {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int input = Integer.parseInt(br.readLine());
            if (input < 10) {
                out.println("What an obedient servant you are!");
            } else {
                out.println("-1");
            }
            out.flush();
        }
        out.close();
    }
}