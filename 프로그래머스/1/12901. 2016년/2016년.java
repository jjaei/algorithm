import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        answer = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US);
        return answer.substring(0,3).toUpperCase();
    }
}