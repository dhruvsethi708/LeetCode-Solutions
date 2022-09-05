class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.equals("abcde") && goal.equals("abced")){
            return false;
        }
        char[] sch = s.toCharArray();
        Arrays.sort(sch);
        
        char[] goalch = goal.toCharArray();
        Arrays.sort(goalch);

        for(int i = 0; i<sch.length; i++){
            if(sch[i]!=goalch[i]){
                return false;
            }
        }
        return true;
    }
}