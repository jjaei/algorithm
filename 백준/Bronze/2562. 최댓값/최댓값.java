import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[9];
        int max = 0;
        int location = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.valueOf(br.readLine());
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                location = j+1;
            }
        }
        System.out.println(max);
        System.out.println(location);
    }
}