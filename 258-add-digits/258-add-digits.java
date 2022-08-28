class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int rem = num%10;
            int div = num/10;
            num = rem + div;
        }
        
        return num;
    }
}