import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.valueOf(st.nextToken()); // 바구니의 수
        int m = Integer.valueOf(st.nextToken()); // 공을 바꿀 횟수

        int[] basket = new int[n];

        for (int i = 0; i < n; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < m; j++) {
            StringTokenizer input = new StringTokenizer(br.readLine());
            int start = Integer.valueOf(input.nextToken());
            int end = Integer.valueOf(input.nextToken());
            int tmp = basket[start - 1];
            basket[start - 1] = basket[end - 1];
            basket[end - 1] = tmp;
            }
        for (int k = 0; k < n; k++) {
            bw.write(basket[k] + " ");
        }

        br.close();
        bw.flush(); // 버퍼에 남아있는 데이터 모두 출력
        bw.close();
    }
}