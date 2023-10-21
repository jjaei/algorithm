class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);

        while (index != -1) {
            answer++;
            index = myString.indexOf(pat, index + 1);
        }

        return answer;
    }
}