import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
class CIELAB {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        String[] line = br.readLine().split(" ");
        int[] input = new int[line.length];
        for (int i = 0; i < 2; i++) {
            input[i] = Integer.parseInt(line[i]);
        }
        int diff = input[0] - input[1];
        if (diff % 10 == 9) {
            out.println(diff - 1);
        } else {
            out.println(diff + 1);
        }
        out.flush();
        out.close();
    }
}