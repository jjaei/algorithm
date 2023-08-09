import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (;;) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }
        }

        br.close();
    }
}