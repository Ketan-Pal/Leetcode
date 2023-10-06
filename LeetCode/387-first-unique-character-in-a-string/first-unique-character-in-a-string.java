class Solution {
    public int firstUniqChar(String s) {
        int j;
        Integer[] count = Collections.nCopies(s.length(), 0).toArray(new Integer[0]);

        for(int i =0;i<s.length();i++){
            for(j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count[i]++;
                    count[j]++;
                    break;
                }
            }
        }

        for(int i = 0;i<count.length;i++){
            if(count[i]==0) return i;
        }
        return -1;
        
    }
}