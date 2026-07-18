class Solution {
    static int area(int height[],int l,int r){
        return (Math.min(height[l],height[r])*(r-l));
    }
    static int maxArea(int height[])
    {
        int maxarea=0;
        int l=0;
        int r=height.length-1;
        while(l<r)
        {
            int temparea=area(height,l,r);
            if(temparea > maxarea) maxarea = temparea;
            if(height[l]<height[r])l++;
            else r--;            
        }
        return maxarea;
    }
    public static void main (String[] args){
        int height1[] = {1,8,6,2,5,4,8,3,7};
        int s = maxArea(height1);
        System.out.println(s);

    }
}