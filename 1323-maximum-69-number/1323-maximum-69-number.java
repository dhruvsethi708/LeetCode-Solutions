class Solution {
    public int maximum69Number (int num) {
        
        int temp = num;
        String s = Integer.toString(temp);
        
        int[] arr = new int[s.length()];
        
        int idx = 0;
        while(temp>0){
            arr[s.length()-1-idx] = temp%10;
            temp /= 10;
            idx++;
        }
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==6){
                arr[i]=9;
                break;
            }
        }
        
        int ans = 1;
        
        for(int j = 0; j<arr.length; j++){
            ans += arr[j]*Math.pow(10, arr.length-j);
        }
        
        // remove extra 1 added to the ans from 10 to the power 0.
        return ans/10;
    }
}