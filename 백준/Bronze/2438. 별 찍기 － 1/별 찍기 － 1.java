import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());
        String star = "";

        for (int i = 0; i < n; i++) {
            star += "*";
            bw.write(star + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}