import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 2;
        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        }
        return answer;
    }
}