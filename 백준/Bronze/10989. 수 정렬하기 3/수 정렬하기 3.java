import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.valueOf(br.readLine());
        }
        Arrays.sort(nums);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int num : nums) {
            bw.write(num + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}