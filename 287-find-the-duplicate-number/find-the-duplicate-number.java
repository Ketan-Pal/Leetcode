class Solution {
    public int findDuplicate(int[] nums) {

        Map<Integer,Integer> mp = new HashMap<>();

        for(int i:nums){
            if(mp.containsKey(i)) return i;
            else mp.put(i,1);
        }

        return -1;
        
    }
}