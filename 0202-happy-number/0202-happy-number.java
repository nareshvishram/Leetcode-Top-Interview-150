class Solution {
    public boolean isHappy(int n) {
        int slow=n,fast=n;
        do{
            slow=getSquare(slow);
            fast=getSquare(fast);
            fast=getSquare(fast);
        }while(slow!=fast);
        if(slow==1)
            return true;
        else
            return false;
    }
    private int getSquare(int n){
        int tmp=0;
        while(n!=0){
            tmp+=(n%10)*(n%10);
            n/=10;
        }
        return tmp;
    }
}