import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;

        for (int i = 0; i < num; i++) {
            boolean[] alphabet = new boolean[26]; // 각 문자열마다 알파벳 초기화
            String str = sc.next(); // 문자열 입력 받기
            char preChar = str.charAt(0); // 첫(전) 글자 저장
            alphabet[preChar - 97] = true; // 알바펫 자리를 true로 초기화

            boolean check = true;  // check 변수

            for (int j = 1; j < str.length(); j++) {
                char currentChar = str.charAt(j);  // 현재 글자 저장

                if (preChar != currentChar && alphabet[currentChar - 97]) {
                    // 그룹문자가 아닐 때는 count하지 않기 위해 check를 false로 변경
                    // 전 글자와 현재 글자가 같지 않거나, 알파벳 배열이 true일 때
                    // 예를 들어 a b a 일 경우에 해당됨. 전 글자와는 같지 않지만 이전에 나타난 알파벳임.
                    check = false;
                    break;
                }
                // 그룹 문자일 때는 알파벳 배열을 true로 변경하고 전 문자에 현 문자를 대입함.
                alphabet[currentChar - 97] = true;
                preChar = currentChar;

            }
            // check가 true일 때만 count++;
            if (check) {
                count++;
            }
        }

        System.out.println(count);
    }
}