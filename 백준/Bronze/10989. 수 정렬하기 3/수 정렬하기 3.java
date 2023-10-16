import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.valueOf(br.readLine());
        int[] counting = new int[10001];
        for (int i = 0; i < n; i++) {
            counting[Integer.valueOf(br.readLine())]++;
        }
        for (int j = 1; j <= 10000; j++) {
            while (counting[j] > 0) {
                bw.write(j + "\n");
                counting[j]--;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}