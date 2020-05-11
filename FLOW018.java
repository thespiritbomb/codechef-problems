import java.io.PrintWriter;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
class FLOW018 {
    static BigInteger[] facts = new BigInteger[21];

    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        facts[0] = new BigInteger("0");
        facts[1] = new BigInteger("1");
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int input = Integer.parseInt(br.readLine());
            out.println(fact(input));
            out.flush();
        }
        out.close();
    }

    public static BigInteger fact(int n) {
        if (n == 0) {
            return (new BigInteger("1"));
        }
        if (facts[n] != null && !facts[n].equals(BigInteger.ZERO)) {
            return facts[n];
        }
        BigInteger ans = BigInteger.valueOf(n);
        ans = ans.multiply(fact(ans.subtract(new BigInteger("1")).intValue()));
        facts[n] = ans;
        return ans;
    }
}