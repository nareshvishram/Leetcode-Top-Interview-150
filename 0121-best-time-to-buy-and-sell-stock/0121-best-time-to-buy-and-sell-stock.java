class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int arr[]=new int[n];
        for(int i=1;i<n;i++){
            arr[i]=prices[i]-prices[i-1];
        }
        return kaden(arr,n);
    }
    private int kaden(int arr[],int n){
        int mc=0,mg=0;
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++){
            mc=Math.max(arr[i],arr[i]+mc);
            if(mg<mc)
                mg=mc;
        }
        return mg;
    }
}
/*
arr=[a1,a2,a3,a4,a5,a6]
buy=a2,sell=a6
profit=a6-a2=[(a6-a5)+(a5-a4)+(a4-a3)+(a3-a2)]

[a,b,c,d,e,f]
 */