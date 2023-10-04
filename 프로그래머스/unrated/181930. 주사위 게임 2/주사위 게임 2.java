class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int abc2 = (a * a) + (b * b) + (c * c);
        int abc3 = (a * a * a) + (b * b * b) + (c * c * c);

        if (a == b && a == c) {
            answer = (a + b + c) * abc2 * abc3;
        } else if (a != b && b != c && a != c) {
            answer = a + b + c;
        } else {
            answer = (a + b + c) * abc2;
        }
        return answer;
    }
}