class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res=new ArrayList<>();
        bt(0,candidates,target,new ArrayList<>());
        return res;
    }
    private void bt(int start,int arr[],int sum,List<Integer> tmp){
        if(sum==0){
                res.add(new ArrayList<>(tmp));
            return;
        }
        if(sum<0)
            return;
        for(int i=start;i<arr.length;i++){
            tmp.add(arr[i]);
            bt(i,arr,sum-arr[i],tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}