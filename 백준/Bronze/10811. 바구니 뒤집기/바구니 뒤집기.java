import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken());  // 바구니의 수
        int m = Integer.valueOf(st.nextToken());  // m번 바구니의 순서부터 역순으로

        int[] basket = new int[n];

        for (int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int start = Integer.valueOf(st2.nextToken());
            int end = Integer.valueOf(st2.nextToken());

            for (int j = 0; start+j < end-j; j++) {
                int tmp = basket[start + j - 1];
                basket[start + j - 1] = basket[end - j - 1];
                basket[end - j - 1] = tmp;
            }
        }

        for (int i = 0; i < basket.length; i++) {
            bw.write(basket[i] + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}