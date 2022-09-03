import java.time.*;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        
        LocalDate localDate = LocalDate.of(year, month, day);
        
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        
        return dayOfWeek.name().substring(0,1) + dayOfWeek.name().substring(1).toLowerCase();
    }
}