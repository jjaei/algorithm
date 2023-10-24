class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                sb.setCharAt(i, 'B');
            } else {
                sb.setCharAt(i, 'A');
            }
        }
        String str = String.valueOf(sb);
        return str.contains(pat) ? 1 : 0;
    }
}