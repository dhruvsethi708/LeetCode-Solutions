
class Solution {
    public int dayOfYear(String date) {
        int[] arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
            
        
        String mon = date.substring(5,7);
        int month = Integer.parseInt(mon);
        
        String dat = date.substring(8,10);
        int din = Integer.parseInt(dat);
        
        int day = din;
        
        for(int i = 1; i<month; i++){
            day += arr[i-1]; 
        }

        String yr = date.substring(0,4);
        int year = Integer.parseInt(yr);
        
        if(year%4==0 && month>2){
            if(year%400==0){
            day = day +1;                
            }else if(year%100==0){
                day = day;
            }else{
                day = day+1;
            }
            
        }
        
        return day;
        
    }
}