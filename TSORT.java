/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class TSORT {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[1000001];
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            arr[x]++;
        }
        for (int i = 0; i <= 1000000; i++) {
            for (int j = 0; j < arr[i]; j++) {
                out.println(i);
                out.flush();
            }
        }
        out.close();
    }
}
