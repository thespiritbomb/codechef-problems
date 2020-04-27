/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class FLOW004 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input = br.readLine();
            int sum = Character.getNumericValue(input.charAt(0))
                    + Character.getNumericValue(input.charAt(input.length() - 1));
            out.println(sum);
            out.flush();
        }
        out.close();
    }
}
