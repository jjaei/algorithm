class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a') {
                sb.setCharAt(i, myString.toUpperCase().charAt(i));
            } else if (myString.charAt(i) > 'A' && myString.charAt(i) <= 'Z') {
                sb.setCharAt(i, myString.toLowerCase().charAt(i));
            }
        }
        return sb.toString();
    }
}