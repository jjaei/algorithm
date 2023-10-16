import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(Integer.valueOf(st.nextToken()));
        }
        Collections.sort(list);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : list) {
            bw.write(num + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}