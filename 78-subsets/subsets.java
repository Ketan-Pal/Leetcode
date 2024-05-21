class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> temp=new ArrayList<Integer>();
        sets(nums,0,nums.length,res,temp);
        return res;
    }

    public void sets(int[] nums, int i, int n, List<List<Integer>> res,List<Integer> temp){
        if(i==n){
            res.add(new ArrayList<Integer>(temp));
            return;
        }
        temp.add(nums[i]);
        sets(nums,i+1,n,res,temp);
        temp.remove(temp.size()-1);
        sets(nums,i+1,n,res,temp);
    }
}