class Solution {
    public String solution(int age) {
        StringBuilder sb = new StringBuilder();
        String sAge = String.valueOf(age);
        for (int i = 0; i < sAge.length(); i++) {
            char digit = sAge.charAt(i);
            char alphabet = (char)('a' + (digit - '0'));
            sb.append(alphabet);
        }
        return sb.toString();
    }
}