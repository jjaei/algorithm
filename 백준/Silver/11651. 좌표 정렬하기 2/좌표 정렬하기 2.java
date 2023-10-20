import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().trim().split(" ");
            arr[i][0] = Integer.valueOf(input[0]);
            arr[i][1] = Integer.valueOf(input[1]);
        }
        Arrays.sort(arr, (arr1, arr2) -> {
            if (arr1[1] == arr2[1]) {
                return Integer.compare(arr1[0], arr2[0]);
            }
            return Integer.compare(arr1[1], arr2[1]);
        });

        for (int j = 0; j < n; j++) {
            System.out.println(arr[j][0] + " " + arr[j][1]);
        }
        br.close();
    }
}