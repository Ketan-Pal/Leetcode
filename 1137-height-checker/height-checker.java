class Solution {
    public int heightChecker(int[] heights) {
        int expect[] = new int[heights.length];
        expect=heights.clone();
        int count=0;
        Arrays.sort(expect);
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=expect[i])count++;
        }
        return count;
    }
}