class Solution {
    public List<Integer> result = new ArrayList<>();

    public void helper(int n,int i){
        if(i>n) return;
        
        result.add(i);
        helper(n,i*10);
        
        if(i%10!=9){
            helper(n,i+1);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        helper(n,1);
        return result;
    }
}