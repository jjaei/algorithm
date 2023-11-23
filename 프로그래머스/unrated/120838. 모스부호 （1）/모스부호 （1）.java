class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] morseArr = letter.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < morseArr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morseArr[i].equals(morse[j])) {
                    sb.append(alphabet[j]);
                }
            }
        }
        return sb.toString();
    }
}