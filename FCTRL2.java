/* package codechef; // don't place package name! */

import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
public class FCTRL2 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int num = Integer.parseInt(br.readLine());
            BigInteger fact = new BigInteger("1");
            while (num > 0) {
                fact = fact.multiply(BigInteger.valueOf(num));
                num--;
            }
            out.println(fact);
            out.flush();
        }
        out.close();
    }
}
