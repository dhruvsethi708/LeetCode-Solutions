class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 0;
        int sum;
        for(int i = digits.length-1; i>=0; i--){
            
            if(i == digits.length-1){
                sum = digits[i] + 1 + carry;
            }else{
                sum = digits[i] + carry;                
            }
            carry = sum/10;
            digits[i] = sum % 10;
        }
        
        if(carry>0){
            int result[] = new int[digits.length+1];
            result[0] = carry;
            for(int i = 1; i<=digits.length; i++){
                result[i] = digits[i-1];
            }
            return result;
        }else{
        return digits;            
        }
    }
}