class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==1)
            return;
        k=k%n;
        rotate(0,n-1,nums);
        rotate(0,k-1,nums);
        rotate(k,n-1,nums);
        
    }
    private void rotate(int i,int j,int nums[]){
        while(j>i){
            int tmp=nums[i];
            nums[i]=nums[j];
            nums[j]=tmp;
            i++;
            j--;

        }
    }
}