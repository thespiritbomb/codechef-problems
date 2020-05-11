/* package codechef; // don't place package name! */

import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class CORUS {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] input;
            input = br.readLine().split(" ");
            int num = Integer.parseInt(input[0]);
            int queries = Integer.parseInt(input[1]);
            char[] people = br.readLine().toCharArray();
            int[] allCases = new int[26];
            for (int i = 0; i < num; i++) {
                char currentCase = people[i];
                int index = (int) currentCase - 97;
                allCases[index]++;
            }
            Arrays.sort(allCases);
            while (queries-- > 0) {
                int centers = Integer.parseInt(br.readLine());
                int waiting = 0;
                int i = 25;
                while (i >= 0 && allCases[i] > centers) {
                    waiting += allCases[i] - centers;
                    i--;
                }
                out.println(waiting);
                out.flush();
            }
        }
        out.close();
    }
}
