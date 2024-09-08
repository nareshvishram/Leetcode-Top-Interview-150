class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int req=-nums[i];
            int low=i+1,high=n-1;
            while(low<high){
                if(nums[low]+nums[high]==req){
                    ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while(low<n-1 && nums[low]==nums[low+1])
                        low++;
                    low++;
                    high--;
                }else if(nums[low]+nums[high]>req)
                    high--;
                else
                    low++;
            }
            while(i<n-1 && nums[i]==nums[i+1])
                i++;
        }
        return ans;
    }
}