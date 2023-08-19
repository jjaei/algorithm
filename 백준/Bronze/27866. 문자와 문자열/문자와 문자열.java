import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.BufferUnderflowException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.valueOf(st.nextToken());

        bw.write(str.charAt(num - 1));

        br.close();
        bw.flush();
        bw.close();
    }
}