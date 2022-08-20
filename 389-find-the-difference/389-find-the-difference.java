class Solution {
    public char findTheDifference(String s, String t) {
        char arr[] = s.toCharArray();
         Arrays.sort(arr);
        
        char brr[] = t.toCharArray();
        Arrays.sort(brr);
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=brr[i]){
                return brr[i];
            }
        }
        
        return brr[brr.length-1];
        
    }
}