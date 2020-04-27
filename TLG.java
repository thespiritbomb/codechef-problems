
/* package codechef; // don't place package name! */
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class TLG {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int leader = -1;
        int maxLead = Integer.MIN_VALUE;
        int score1 = 0;
        int score2 = 0;
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            score1 += Integer.parseInt(input[0]);
            score2 += Integer.parseInt(input[1]);
            int currentLead = Math.abs(score1 - score2);
            int currentLeader = (score1 > score2) ? 1 : 2;
            if (currentLead > maxLead) {
                maxLead = currentLead;
                leader = currentLeader;
            }
        }
        out.print(leader + " " + maxLead);
        out.flush();
        out.close();
    }
}
