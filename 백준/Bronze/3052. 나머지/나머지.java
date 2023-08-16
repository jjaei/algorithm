import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();
        // HashSet은 중복을 허용하지 않음.

        for (int i = 0; i < 10; i++) {
            int num = Integer.valueOf(br.readLine());
            int nums = num % 42;
            set.add(nums);
        }

        System.out.println(set.size()); // 중복을 허용하지 않기 때문에 set의 현재 size를 출력함.
        br.close();
    }
}