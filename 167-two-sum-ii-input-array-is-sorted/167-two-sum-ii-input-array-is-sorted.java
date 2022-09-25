class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, h = numbers.length-1;
        
        for(int i = 0; i<numbers.length-1; i++){
            int sum = numbers[l] + numbers[h];
            if(target == sum){
                return new int[]{l+1, h+1};
            }else if(target<sum){
                h--;
            }else{
                l++;
            }
        }
        
        return new int[]{-1,-1};
    }
}