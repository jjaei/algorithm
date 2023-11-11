class Solution {
    public String[] solution(String[] picture, int k) {
        int newHeight = picture.length * k;
        int newLength = picture[0].length() * k;
        String[] answer = new String[newHeight];

        for (int i = 0; i < newHeight; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < newLength; j++) {
                sb.append(picture[i/k].charAt(j/k));
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}