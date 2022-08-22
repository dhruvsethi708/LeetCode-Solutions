class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        StringBuilder s = new StringBuilder();
        
        for(String i: words){
            
            if(i.length()<=2){
                s.append(i);
            }else{
            s.append(i.substring(0, 1).toUpperCase() + i.substring(1));                
            }
            s.append(" ");
        }
        
        return s.toString().trim();
    }
}