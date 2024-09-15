class Solution {
    public int trap(int[] height) {
        // TC. O(N)
        // space 2*O(N)
        int n=height.length,ans=0;
        int l=0,r=n-1,lmax=0,rmax=0;
        while(l<r){
            if(height[l]<height[r]){
                // go to left
                if(height[l]>lmax)
                    lmax=height[l];
                else
                    ans+=lmax-height[l];
                l++;
            }else{
                //go to right
                if(height[r]>rmax)
                    rmax=height[r];
                else
                    ans+=rmax-height[r];
                r--;
            }
        }
        return ans;
    }
}