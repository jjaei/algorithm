import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] student = new int[30];
        int[] homework = new int[28];

        for (int i = 0; i < 28; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            homework[i] = Integer.valueOf(st.nextToken());
        }

        for (int j = 0; j < student.length; j++) {
            student[j] = j + 1;
        }

        for (int num : homework) {
            for (int k = 0; k < student.length; k++) {
                if (num == student[k]) {
                    student[k] = 0;
                    break;
                }
            }
        }

        for (int l = 0; l < student.length; l++) {
            if (student[l] != 0) {
                bw.write(student[l] + "\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();

    }
}