class Solution {
    int arr[];
    List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res=new ArrayList<>();
        arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=i+1;
        bt(0,n,k,new ArrayList<>());
        return res;
    }
    private void bt(int start,int n,int k,List<Integer> tmp){
        if(tmp.size()==k){
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=start;i<n;i++){
            tmp.add(arr[i]);
            bt(i+1,n,k,tmp);
            tmp.remove(tmp.size()-1);
        }
    }
}