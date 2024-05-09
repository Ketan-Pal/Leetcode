class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long result=0;
        int len = happiness.length;
        Arrays.sort(happiness);
        for(int j=0;j<k;j++){
            int happy = happiness[len-(j+1)] -(1*j);
            result += happy>=0?happy:0; 
        }
        return result;
    }
}