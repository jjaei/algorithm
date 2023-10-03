class Solution {
    public String solution(String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder(answer);
        int mode = 0;
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 0) {
                        sb.append(code.charAt(i));
                    }
                } else if (code.charAt(i) == '1') {
                    mode = 1;
                }
            } else {
                if (code.charAt(i) != '1') {
                    if (i % 2 != 0) {
                        sb.append(code.charAt(i));
                    }
                } else if (code.charAt(i) == '1') {
                    mode = 0;
                }
            }
        }

        if (sb.length() == 0) {
            sb.append("EMPTY");
        }

        return sb.toString();
    }
}