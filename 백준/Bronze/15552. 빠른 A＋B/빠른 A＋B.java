import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.valueOf(st.nextToken());

        for (int i = 0; i < num; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int a = Integer.valueOf(st2.nextToken());
            int b = Integer.valueOf(st2.nextToken());
            bw.write(String.valueOf(a + b ) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}