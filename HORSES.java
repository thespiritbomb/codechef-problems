import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Remember that the class name should be "Main" and should be "public".
class HORSES {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] input = new int[n];
            for (int i = 0; i < n; i++) {
                input[i] = Integer.parseInt(line[i]);
            }
            Arrays.sort(input);
            int min = Integer.MAX_VALUE;
            for (int i = n - 1; i > 0; i--) {
                if (input[i] - input[i - 1] < min) {
                    min = input[i] - input[i - 1];
                }
            }
            out.println(min);
            out.flush();
        }
        out.close();
    }
}