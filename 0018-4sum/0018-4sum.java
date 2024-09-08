class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        if(n<4)
            return ans;
        Arrays.sort(nums);
        if((target<0 && nums[0]>0)||(target>0 && nums[n-1]<0))
            return ans;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long req=(long)target-1*((long)nums[i]+(long)nums[j]);
                int low=j+1,high=n-1;
                while(low<high){
                    long tmp=(long)nums[low]+(long)nums[high];
                    if(tmp==req){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                        while(low<n-1 && nums[low]==nums[low+1])
                            low++;
                        low++;
                        high--;
                    }else if(tmp>req)
                        high--;
                    else
                        low++;
                }
                while(j<n-1 && nums[j]==nums[j+1])
                    j++;
            }
            while(i<n-1 && nums[i]==nums[i+1])
                i++;
        }
        return ans;
    }
}