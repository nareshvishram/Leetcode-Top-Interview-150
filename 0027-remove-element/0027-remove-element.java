class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0,j=nums.length-1;
        if(nums.length==0)
            return 0;
        while(j>=0 && nums[j]==val)
            j--;
        if(j<0)
            return 0;
        System.out.println(i+" "+j);
        while(i<nums.length && i<=j){
            if(i==j && nums[i]==val)
                break;
            while(j>=0 && nums[j]==val)
                j--;
            if(j<i)
                break;
            if(nums[i]==val)
                nums[i++]=nums[j--];
            else
                i++;
        }
        System.out.println(i+" "+j);
        return i;
    }
}