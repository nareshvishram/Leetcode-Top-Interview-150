class Solution {
     List<Integer> res=new ArrayList<>();
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0)
            return res;
        generateMatrix(matrix);
        return res;
    }
     public int[][] generateMatrix(int arr[][]) {
        int top=0,bottom=arr.length-1,right=arr[0].length-1,left=0,dir=0;
        while(top<=bottom && right>=left)
        {
            /*
            * left-------right
            * top
            * |
            * |
            * |
            * bottom
             */
            if(dir==0)
            {
                for(int i=left;i<=right;i++)
                {
                    res.add(arr[top][i]);
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    res.add(arr[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }
            else
            {
                for(int i=bottom;i>=top;i--)
                  res.add(arr[i][left]);
                left++;
            }
            dir=(dir+1)%4;
            
        }
       // for(int d[]:arr)
         // System.out.println(Arrays.toString(arr));
        return arr;
    }
}