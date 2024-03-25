class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();

        for(int i:nums){
            if(mp.containsKey(i)){
                ls.add(i);
            }
            else{
                mp.put(i,1);
            }
        }
        return ls;
    }
}