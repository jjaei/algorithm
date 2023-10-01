public class Solution {
    public int solution(int a, int b) {

        int answer = 0;
        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);
        
        int iab = Integer.valueOf(ab);
        int iba = Integer.valueOf(ba);


        if (iab >= iba) {
            answer = iab;
        } else if (iba > iab) {
            answer = iba;
        } 

        return answer;

    }
}