package strings;

import java.util.*;

public class BalanceParanthesis {

	public static void main(String args[]){

		Scanner ss = new Scanner(System.in);
		String sc = ss.nextLine();
		System.out.println("");
		System.out.println(bstack(sc));

		ss.close();
	}
	public static boolean bstack(String s) {

		Stack<Character> stk = new Stack<Character>();

		for (int i=0;i<s.length(); i++) {

			if(s.charAt(i)=='[' ) {
				stk.push('[');
			}
			else if(s.charAt(i)=='{' ) {
				stk.push('{');
			}
			else if(s.charAt(i)=='(' ) {
				stk.push('(');
			}

			else if(s.charAt(i)==']') {

				if(stk.peek()=='[') {
					stk.pop();
				}
				else if(stk.isEmpty()) {
					return false;
				}
				else {
					return false;
				}
			}

			else if(s.charAt(i)=='}') {

				if(stk.peek()=='{') {
					stk.pop();
				}
				else if(stk.isEmpty()) {
					return false;
				}
				else {
					return false;
				}
			}

			else if(s.charAt(i)==')'){

				if(stk.peek()=='('){
					stk.pop();
				}
				else if(stk.isEmpty()){
					return false;
				}
				else {
					return false;
				}
			}
		}
		return stk.isEmpty();
	}
}
