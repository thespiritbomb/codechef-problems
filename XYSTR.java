import java.io.*;

class XYSTR {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String inpuString = br.readLine();
            char[] array = inpuString.toCharArray();
            int count = 0;
            for (int i = 0; i < array.length - 1; i++) {
                int j = i + 1;
                if (array[i] != array[j]) {
                    count++;
                    i++;
                }
            }
            out.println(count);
            out.flush();
        }
        out.close();
    }
}