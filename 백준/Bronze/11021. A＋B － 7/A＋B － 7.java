import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.valueOf(st.nextToken());
        for (int i = 1; i <= t; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st2.nextToken());
            int b = Integer.valueOf(st2.nextToken());
            bw.write("Case #" + i + ": " + String.valueOf(a + b) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}