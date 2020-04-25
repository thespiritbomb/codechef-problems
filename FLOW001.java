import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
public class FLOW001 {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test casese.
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int[] input = new int[line.length];
            for (int i = 0; i < 2; i++) {
                input[i] = Integer.parseInt(line[i]);
            }
            out.println(input[0] + input[1]);
            out.flush();
        }
        out.close();
    }
}