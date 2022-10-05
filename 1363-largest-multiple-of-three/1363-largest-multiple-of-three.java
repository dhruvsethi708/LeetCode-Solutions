class Solution {
    public String largestMultipleOfThree(int[] digits) {
        
                int n = digits.length;
        int sum = 0;
        for(int val : digits)   sum += val;
        Arrays.sort(digits);
        if(sum % 3 == 0){
            if(digits[n - 1] == 0)
                return "" + 0;
        }else if(sum % 3 == 1){
            boolean found = false;
            for(int i = 0; i < n; i++){
                if(digits[i] % 3 == 1){
                    digits[i] = -1;
                    found = true;
                    break;
                }
            }
            if(!found){
                int[] vals = new int[2];
                Arrays.fill(vals, -1);
                for(int i = 0; i < n; i++){
                    if(digits[i] % 3 == 2){
                        if(vals[0] == -1)   vals[0] = i;
                        else{
                            vals[1] = i;
                            break;
                        }
                    }
                }
                if(vals[1] == -1)
                    return "";
                digits[vals[0]] = -1;
                digits[vals[1]] = -1;
            }
        }else{
            boolean found = false;;
            for(int i = 0; i < n; i++){
                if(digits[i] % 3 == 2){
                    digits[i] = -1;
                    found = true;
                    break;
                }
            }
            if(!found){
                int[] vals = new int[2];
                Arrays.fill(vals, -1);
                for(int i = 0; i < n; i++){
                    if(digits[i] % 3 == 1){
                        if(vals[0] == -1)   vals[0] = i;
                        else{
                            vals[1] = i;
                            break;
                        }
                    }
                }
                if(vals[1] == -1)
                    return "";
                digits[vals[0]] = -1;
                digits[vals[1]] = -1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = n - 1; i >= 0; i--)
            if(digits[i] != -1)
                sb.append(digits[i]);
        
        if(sb.length() == 0)
            return "";
        if(sb.charAt(0) == '0'){
            return "" + 0;
        }
        return "" + sb;

    }
}