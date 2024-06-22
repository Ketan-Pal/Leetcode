class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return  findTotalSubArrays(nums, k) - findTotalSubArrays(nums, k - 1);
    }

    public int findTotalSubArrays(int[] nums, int k){

        int i = 0;
        int j = 0;
        int subArrays = 0;
        int countOdd = 0;

        while(j < nums.length){

            if(nums[j] % 2 != 0){  
                countOdd++;
            }

            while(countOdd > k){    

                if(nums[i] % 2 != 0){   
                    countOdd--;
                }
                i++;    
            }
            subArrays += j - i + 1;    
            j++;
        } 
        return subArrays;
    }
}