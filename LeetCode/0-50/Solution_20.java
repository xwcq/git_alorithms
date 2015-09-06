import java.util.Stack;

public class Solution_20 {
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char in = s.charAt(i);
			if (in == '(' || in == '{' || in == '[') stack.push(in);
			else {
				// when use pop, remember to check whether the stack is empty 
				if (stack.isEmpty()) return false;
				char out = stack.pop();
				if (isMatch(out, in)) continue;
				else return false;
			}
		}
		/*if (!stack.isEmpty()) return false;
		return true;*/
		return stack.isEmpty();
	}
	
	private static boolean isMatch(char a, char b) {
		if ((a == '(' && b == ')')) return true;
		if ((a == '[' && b == ']')) return true;
		if ((a == '{' && b == '}')) return true;
		return false;
	}
	
	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}
}





















