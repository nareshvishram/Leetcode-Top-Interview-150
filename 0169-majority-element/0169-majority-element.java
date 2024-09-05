class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        int majority=nums[0],votes=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==majority)
                votes++;
            else{
                votes--;
                if(votes==0){
                    votes=1;
                    majority=nums[i];
                }
            }
        }
        return majority;
    }
}