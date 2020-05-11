/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FLOW007 {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringBuilder num = new StringBuilder(br.readLine());
            out.println(Integer.parseInt(num.reverse().toString()));
            out.flush();
        }
        out.close();
    }
}
