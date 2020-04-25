import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
public class INTEST {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int[] first = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            first[i] = Integer.parseInt(line[i]);
        }
        int n = first[0];
        int k = first[1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x % k == 0) {
                ans++;
            }
        }

        out.println(ans);
        out.flush();
        out.close();
    }
}