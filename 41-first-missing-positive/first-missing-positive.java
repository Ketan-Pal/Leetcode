class Solution {
    public int firstMissingPositive(int[] nums) {
        
        Set<Integer> set = new HashSet<>();

        for(int num : nums) set.add(num);

        int i=1;
        while(i<=nums.length){
            if(set.contains(i)) i++;
            else    return i;
        }
        return nums.length+1;
    }
}