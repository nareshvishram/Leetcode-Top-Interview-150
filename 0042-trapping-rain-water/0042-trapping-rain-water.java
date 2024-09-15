class Solution {
    public int trap(int[] height) {
        // TC. O(N)
        // space 2*O(N)
        int n=height.length;
        int left[]=new int[n];
        int[] right=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            left[i]=Math.max(max,height[i]);
            max=left[i];
        }
        max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            right[i]=Math.max(max,height[i]);
            max=right[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        return ans;
    }
}