/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FSQRT {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            out.println((int) Math.sqrt(Integer.parseInt(br.readLine())));
            out.flush();
        }
        out.close();
    }
}
