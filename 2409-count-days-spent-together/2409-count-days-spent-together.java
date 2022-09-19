class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int am1 = Integer.parseInt(arriveAlice.substring(0,2));
        int am2 = Integer.parseInt(leaveAlice.substring(0,2));
        int bm1 = Integer.parseInt(arriveBob.substring(0,2));
        int bm2 = Integer.parseInt(leaveBob.substring(0,2));
        
        int ad1 = Integer.parseInt(arriveAlice.substring(3));
        int ad2 = Integer.parseInt(leaveAlice.substring(3));
        int bd1 = Integer.parseInt(arriveBob.substring(3));
        int bd2 = Integer.parseInt(leaveBob.substring(3));
        
        int days[] = {0,31,59,90,120,151,181,212,243,273,304,334,365};
        
        int aarday = days[am1-1] + ad1;
        int alvday = days[am2-1] + ad2;
        int barday = days[bm1-1] + bd1;
        int blvday = days[bm2-1] + bd2;      
        
        int lastarrival = Math.max(aarday,barday);
        int firstleave = Math.min(alvday ,blvday);
        
        int totaldays = firstleave - lastarrival + 1;
            
        return totaldays<0?0:totaldays;
        
    }
}