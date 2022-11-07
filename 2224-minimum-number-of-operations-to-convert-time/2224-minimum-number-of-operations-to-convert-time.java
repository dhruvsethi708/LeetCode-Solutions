class Solution {
    public int convertTime(String current, String correct) {
        
        int currentHour=Integer.parseInt(current.substring(0,2));
        int currentMinute=Integer.parseInt(current.substring(3));
        int correctHour=Integer.parseInt(correct.substring(0,2));
        int correctMinute=Integer.parseInt(correct.substring(3));
        
        
        int diff = (correctHour*60+correctMinute)-(currentHour*60+currentMinute);
        
        int operations = diff/60;
        int remainder=diff%60;
        
        operations +=remainder/15;
        remainder=remainder%15;
        
        operations +=remainder/5;
        remainder =remainder%5;
        
        return operations+remainder;
    }
}