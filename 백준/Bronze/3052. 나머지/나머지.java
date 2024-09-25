import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            hash.add(num % 42);
        }
        System.out.println(hash.size());
    }
}