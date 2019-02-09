package com.etc.aptitude;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ProperlyNestedParanthesis {

	/**
	 * @param args
	 */
	
	private static Stack<Character> stack = new Stack<Character>();
	private static Map<Character, Character> match = new HashMap<Character, Character>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "()(()()(((()())(()()))";
		
		ParanthesisSolution sol = new ParanthesisSolution();
		System.out.println(sol.solution(input));

}
}	
class ParanthesisSolution {
    private Stack<Character> stack = new Stack<Character>();
    private Map<Character, Character> match = new HashMap<Character, Character>();
    public int solution(String S) {
        // write your code in Java SE 8
        match.put(']', '[');
        match.put('}', '{');
        match.put(')', '(');
        if(null != S && S.length()>0)
        {
            if(S.length() %2 != 0)
                return 0;
            for(Character c: S.toCharArray())
            {
                if(c == '(' || c == '[' || c == '{')
                {
                	stack.push(c);
                	if(stack.size() == S.length())
                    	return 0;
                }    
			    else if(c == ')' || c == ']' || c == '}' )
			    {
			    	if(!stack.isEmpty())
			    	{
			    		if(stack.pop() != match.get(c))
							return 0;
			    	}
			    	else
			    		return 0;
					
			    }
                
            }
            if(!stack.isEmpty())
            	return 0;
        }
        
        return 1;
    }
}