import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        String star = "";

        for (int i = 0; i < n; i++) {
            star += "*";
            System.out.println(star);
        }
        br.close();
    }
}