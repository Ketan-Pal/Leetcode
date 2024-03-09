class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i:nums){
            if(mp.containsKey(i)) return true;
            else{
                mp.put(i,1);
            }
        }
        return false;
        
    }
}