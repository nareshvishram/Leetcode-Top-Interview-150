class Solution {
    public int jump(int[] nums) {
        int jumps=0,l=0,r=0,n=nums.length;
        if(n==1 || nums[0]==0)
            return 0;
        while(r<=n-1){
            int reachable=0;
            for(int j=l;j<=r;j++){
                reachable=Math.max(reachable,j+nums[j]);
                if(reachable>=n-1)
                    return jumps+1;
            }
            l=r+1;
            r=reachable;
            jumps++;
        }
        return jumps;
    }
}