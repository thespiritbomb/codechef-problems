
/* package codechef; // don't place package name! */
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class HS08TEST {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        String[] temp = br.readLine().split(" ");
        double[] input = new double[temp.length];
        for (int i = 0; i < temp.length; i++) {
            input[i] = Double.parseDouble(temp[i]);
        }
        double withdraw = input[0];
        double balance = input[1];
        if ((withdraw % 5 == 0) && ((withdraw + 0.5) < balance))
            out.println(balance - withdraw - 0.5);
        else
            out.println(balance);
        out.flush();
        out.close();

    }
}
