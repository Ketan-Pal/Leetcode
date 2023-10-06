class Solution {
    public int firstUniqChar(String s) {
        int j;
        int[] count = new int['z'+1];

        for(int i =0;i<s.length();i++){
            count[s.charAt(i)]++;
        }

        for(int i = 0;i<s.length();i++){
            if(count[s.charAt(i)]==1) return i;
        }
        return -1;
        
    }
}