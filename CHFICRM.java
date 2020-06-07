import java.io.*;

class CHFICRM {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            int[] coins = new int[3];
            boolean possible = true;
            // index 0 for Rs.5 coins count
            // index 1 for Rs.10 coins count
            // index 2 for Rs.15 coins count
            for (int i = 0; i < n; i++) {
                int changeWanted = arr[i] - 5;
                if (changeWanted == 0) {
                    coins[0]++;
                } else if (changeWanted == 5) {
                    if (coins[0] > 0) {
                        coins[0]--;
                        coins[1]++;
                    } else {
                        possible = false;
                        break;
                    }
                } else if (changeWanted == 10) {
                    if (coins[1] > 0) {
                        coins[1]--;
                        coins[2]++;
                    } else if (coins[0] >= 2) {
                        coins[0] -= 2;
                        coins[2]++;
                    } else {
                        possible = false;
                        break;
                    }
                }
            }
            if (!possible) {
                out.println("NO");
            } else {
                out.println("YES");
            }
            out.flush();
        }
        out.close();
    }
}