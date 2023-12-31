import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());

            if (a == 0 && b == 0) {
                break;
            } else {
                bw.write(a + b + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}