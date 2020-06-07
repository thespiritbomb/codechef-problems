import java.io.*;
import java.util.*;

public class RECNDNOS {
    public static void main(String[] args) throws Exception {
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
            int max = Arrays.stream(arr).max().getAsInt();
            boolean[] counted = new boolean[max + 1];
            int[] dishes = new int[max + 1];
            for (int i = 0; i < n; i++) {
                if (!counted[arr[i]]) {
                    for (int j = i + 2; i < n; i++) {
                        if (arr[j] == arr[i]) {
                            dishes[arr[j]]++;
                        }
                    }
                }
            }
        }
    }
}