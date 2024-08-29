class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < X.length(); i++) {
            xArr[X.charAt(i) - '0']++;
        }

        for (int i = 0; i < Y.length(); i++) {
            yArr[Y.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--) {
            int min = Math.min(xArr[i], yArr[i]);
            for (int j = 0; j < min; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) {
            return "-1";
        } else if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();
    }
}