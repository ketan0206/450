
class Parenthesis
{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x)
    {
        Stack<Character> stack = new Stack<>();
        char[] arr = x.toCharArray();
        for (char s : arr) {
            if (s=='[' || s=='{' || s=='(') {
                stack.push(s);
            } else {
                if (stack.isEmpty()) return false;
                if (s!=reverse(stack.pop())) return false;
            }
        }
        return stack.isEmpty();
    }
    
    static char reverse(char s) {
        if (s=='[') return ']';
        if (s=='{') return '}';
        if (s=='(') return ')';
        return s;
    }
}
