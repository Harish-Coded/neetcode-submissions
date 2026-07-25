class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> open = new HashMap<>();
        open.put(')','(');
        open.put('}','{');
        open.put(']','[');
        for(char c : s.toCharArray())
        {
            if(open.containsKey(c))
            {
                if(!stack.isEmpty() && stack.peek()==open.get(c))
                {
                    stack.pop();
                }
                else return false;
            }
            else stack.push(c);
        }
        return stack.isEmpty();
    }
}
