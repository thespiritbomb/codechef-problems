import java.io.*;

class PRICECON {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] input = br.readLine().split(" ");
            int n = Integer.parseInt(input[0]);
            int k = Integer.parseInt(input[1]);
            int[] arr = new int[n];
            input = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }
            int moneyLost = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > k) {
                    moneyLost += arr[i] - k;
                }
            }
            out.println(moneyLost);
            out.flush();
        }
        out.close();
    }
}