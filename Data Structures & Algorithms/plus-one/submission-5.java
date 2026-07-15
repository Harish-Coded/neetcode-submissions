class Solution {
    public int[] plusOne(int[] n) {
        int i = n.length-1;
        while(i>=0)
        {
            if(n[i]!=9) 
            {
                n[i]=n[i]+1;
                return n;
            }
            else
            {
                n[i]=0;
                i--;
            }
        }
        int ls = n.length;
        if(i==-1)
        {
            ls++;
        }
        int[] num = new int[ls];
        num[0]=1;
        
        return num;
    }
}
