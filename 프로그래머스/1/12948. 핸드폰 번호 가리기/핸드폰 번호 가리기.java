class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        String frontNumber = phone_number.substring(0, phone_number.length() - 4);
        for (int i = 0; i < frontNumber.length(); i++) {
            sb.append("*");
        }
        sb.append(phone_number.substring(phone_number.length() - 4));
        return sb.toString();
    }
}