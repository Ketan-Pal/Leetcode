class Solution {
    public int maxDepth(String s) {
        int height=0;
        int max=height;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') height++;
            if(s.charAt(i)==')') height--;
            max=Math.max(max,height);
        }
        return max;
    }
}