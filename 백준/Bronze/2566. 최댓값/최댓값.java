import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];
        int max = 0;
        int iLoc = 0;
        int jLoc = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.valueOf(st.nextToken());
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    iLoc = i + 1;
                    jLoc = j + 1;
                }
            }
        }

        bw.write(max +"\n");
        bw.write(iLoc + " " + jLoc);

        br.close();
        bw.flush();
        bw.close();

    }
}