class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            for (int j = i + 1; j <= myString.length(); j++) {
                String str = myString.substring(i, j);
                if (str.endsWith(pat)) {
                    answer = myString.substring(0, j);
                }
            }
        }
        return answer;
    }
}