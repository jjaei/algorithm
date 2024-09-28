import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] alphabet = new int[26];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }

        for (int j = 0; j < s.length(); j++) {
            if (alphabet[s.charAt(j) - 97] == -1) {
                alphabet[s.charAt(j) - 97] = j;
            }
        }
        for (int k = 0; k < alphabet.length; k++) {
            System.out.print(alphabet[k] + " ");
        }
    }
}