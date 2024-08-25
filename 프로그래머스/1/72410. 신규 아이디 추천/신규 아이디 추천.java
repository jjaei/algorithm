class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase().replaceAll("[^0-9._\\-a-z]","");
        new_id = new_id.replaceAll("\\.{2,}", ".");
        new_id = new_id.replaceAll("^\\.|\\.$", "");
        new_id = new_id.isEmpty() ? "a" : new_id;
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("\\.$","");
        }
        if (new_id.length() <= 2) {
            for (int i = new_id.length(); i < 3; i++) {
                new_id += new_id.charAt(i - 1);
            }
        }
        return new_id;
    }
}