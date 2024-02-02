class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1 + str2).equals(str2+str1)){
            int gcdofStrLen = str1.length() < str2.length() ? gcd(str1.length(), str2.length()) : gcd(str2.length(), str1.length());
            return str1.substring(0, gcdofStrLen);
        }
        else return "";
    }

    public int gcd(int num1, int num2){
        while(num2 % num1 != 0){
            int rem = num2 % num1;
            num2 = num1;
            num1 = rem;
        }
        return num1;
    }
}