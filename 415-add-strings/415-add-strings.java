class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        
        int i = num1.length() -1;
        int j= num2.length() -1;
        
        int carry =0;
        
        while(i >= 0 || j >= 0 || carry > 0){
            int n1 =0, n2=0;
            
            if(i >= 0)
            {
                n1 = num1.charAt(i) - '0';
                i--;
            }
            
            if(j >= 0)
            {
                n2 = num2.charAt(j) - '0';
                j--;
            }
            
             int num = (n1 + n2 + carry) % 10;
            
             if( (n1 + n2 + carry) >= 10)
                carry = 1;
            
            else
                carry =0;
            
            sb.append(num);
        }
        
        return sb.reverse().toString();
    }
}