import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(br.readLine());
        double[] score = new double[n];
        double avg = 0.0;
        double max = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < score.length; i++) {
            score[i] = Double.valueOf(st.nextToken());
            if (score[i] > max) {
                max = score[i];
            }
        }

        for (int i = 0; i < score.length; i++) {
            sum += score[i] / max * 100;
            avg = sum / score.length;
        }

        System.out.println(avg);
        br.close();
    }
}