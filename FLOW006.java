
/* package codechef; // don't place package name! */
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class FLOW006 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int num = Integer.parseInt(br.readLine());
            int ans = 0;
            while (num > 0) {
                ans += num % 10;
                num /= 10;
            }
            out.println(ans);
            out.flush();
        }
        out.close();
    }
}
