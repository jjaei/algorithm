class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            if(index + n < my_str.length()) {
                answer[i] = my_str.substring(index, index + n);
                index += n;
            } else {
                answer[i] = my_str.substring(index);
            }
        }
        return answer;
    }
}