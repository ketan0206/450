class Solution {
    
    public String reverse(String S){
        Stack<Character> stack = new Stack<>();
        char[] arr = S.toCharArray();
        for (char c : arr) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(String.valueOf(stack.pop()));
        }
        return sb.toString();
    }

}