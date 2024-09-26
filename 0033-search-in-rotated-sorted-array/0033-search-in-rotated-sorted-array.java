class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        if(n<=0)
            return -1;
        int l=0,r=n-1;
        while(l<=r){
            int mid=(r-l)/2+l;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>=nums[0]){
                // left part sorted
                if(nums[0]<=target && nums[mid]>=target){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }else{
                // right part is sorted
                if(nums[r]>=target && nums[mid]<=target)
                    l=mid+1;
                else
                    r=mid-1;
            }
        }
        return -1;

    }
}