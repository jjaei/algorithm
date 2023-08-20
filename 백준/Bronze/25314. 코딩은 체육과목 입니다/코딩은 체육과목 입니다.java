import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.valueOf(br.readLine());

        for (int i = 1; i <= n; i++) {
            if (i % 4 == 0) {
                bw.write("long ");
            }
            if(i==n){
                bw.write("int");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}