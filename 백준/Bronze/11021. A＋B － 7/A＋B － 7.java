import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.valueOf(br.readLine());

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st.nextToken());
            int b = Integer.valueOf(st.nextToken());
            bw.write("Case #" + i +": "+ (a + b) + "\n");
        }
        br.close();
        bw.close();
    }
}