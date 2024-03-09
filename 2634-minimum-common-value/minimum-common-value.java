class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        Map<Integer,Integer> mp = new HashMap<Integer,Integer>();

        for(int i:nums1){
            mp.put(i,1);
        }
        for(int i: nums2){
            if(mp.containsKey(i)) return i;
        }

        return -1;
        
    }
}