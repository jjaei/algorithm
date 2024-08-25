class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int currentPoint = 0;
        int beforePoint = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                answer += beforePoint;
                beforePoint = currentPoint;
                currentPoint = 10;
                i++;
                continue;
            }

            if (dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
                answer += beforePoint;
                beforePoint = currentPoint;
                currentPoint = dartResult.charAt(i) - '0';
            }

            if(dartResult.charAt(i) == 'D') {
                currentPoint *= currentPoint;
            }

            if(dartResult.charAt(i) == 'T') {
                currentPoint *= currentPoint * currentPoint;
            }

            if (dartResult.charAt(i) == '*') {
                beforePoint *= 2;
                currentPoint *= 2;
            }

            if (dartResult.charAt(i) == '#') {
                currentPoint *= -1;
            }
        }
        answer += beforePoint + currentPoint;
        return answer;
    }
}