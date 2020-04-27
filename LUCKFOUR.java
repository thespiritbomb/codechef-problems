/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class LUCKFOUR {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String input = br.readLine();
            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == '4') {
                    count++;
                }
            }
            out.println(count);
            out.flush();
        }
        out.close();
    }
}
