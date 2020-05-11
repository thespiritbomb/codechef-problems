/* package codechef; // don't place package name! */

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class COVID19 {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int arr[] = new int[n];
            int start, end;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            start = 0;
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            while (start < n) {
                end = start;
                int currLen;
                if (end != n - 1) {
                    while (end < n - 1 && Math.abs(arr[end] - arr[end + 1]) <= 2) {
                        end++;
                    }
                    currLen = end - start + 1;
                } else {
                    currLen = 1;
                }
                if (currLen < min) {
                    min = currLen;
                }
                if (currLen > max) {
                    max = currLen;
                }
                start = end + 1;
            }
            out.println(min + " " + max);
            out.flush();
        }
        out.close();
    }
}
