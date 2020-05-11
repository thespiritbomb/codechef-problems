/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FLOW017 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            int max1, max2;
            if (arr[1] > arr[0]) {
                max1 = arr[1];
                max2 = arr[0];
            } else {
                max1 = arr[0];
                max2 = arr[1];
            }
            if (arr[2] > max1) {
                max2 = max1;
                max1 = arr[2];
            } else if (arr[2] > max2) {
                max2 = arr[2];
            }
            out.println(max2);
            out.flush();
        }
        out.close();
    }
}
