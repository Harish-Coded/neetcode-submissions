class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==t.length())
        {
            char[] sorteds=s.toCharArray();
            Arrays.sort(sorteds);
            char[] sortedt=t.toCharArray();
            Arrays.sort(sortedt);
            for(int i=0;i<sorteds.length;i++)
            {
                if(sorteds[i]!=sortedt[i]) return false;
            }
        }
        else return false;
        return true;
    }
}
