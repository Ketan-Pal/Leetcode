class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0,zero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') one++;
        }
        zero=s.length()-one;
        StringBuilder ans = new StringBuilder();
        for(int j=0;j<one-1;j++){
            ans.append('1');
        }
        for(int j=0;j<zero;j++){
            ans.append('0');
        }
        if(one>0){
            ans.append('1');
        }
        return ans.toString();
    }
}