class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();

        for (int i = 0; i < myString.length(); i++) {
            boolean check = true;
            if (myString.length() < pat.length()) {
                return answer;
            }
            for (int j = 0; j < pat.length(); j++) {
                if (myString.charAt(i + j) != pat.charAt(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}