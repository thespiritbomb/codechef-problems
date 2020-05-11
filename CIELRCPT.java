import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// Remember that the class name should be "Main" and should be "public".
class CIELRCPT {
    public static void main(String[] args) throws Exception {
        // System.in and System.out are input and output streams, respectively.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        // Read the number of test cases.
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int input = Integer.parseInt(br.readLine());
            int temp = input;
            int menus = 0;
            while (temp > 2048) {
                temp -= 2048;
                menus++;
            }
            while (temp != 0) {
                if (temp == 1) {
                    menus++;
                    break;
                }
                int section = (int) (Math.log((double) temp) / Math.log(2));
                menus++;
                temp -= Math.pow(2, section);
            }
            out.println(menus);
            out.flush();
        }
        out.close();
    }
}