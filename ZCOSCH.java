import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
class ZCOSCH {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        int rank = Integer.parseInt(br.readLine());
        if (rank <= 50) {
            out.print(100);
        } else if (rank <= 100) {
            out.print(50);
        } else {
            out.print(0);
        }
        out.flush();
        out.close();
    }
}