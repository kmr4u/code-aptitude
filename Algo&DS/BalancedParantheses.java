import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0; i<num; i++)
		{
			System.out.println(isBalanced(scan.next()));
		}
		
	}
	public static boolean isBalanced(String str)
	{
		Stack<Character> s = new Stack<Character>();
		
		for(char c : str.toCharArray())
		{
			if(c == '{' || c == '[' || c == '(')
			{
				s.push(c);
			}
				
			else if(c == '}' || c == ']' || c == ')')
			{
				if(c == '}')
				{
					if( s.isEmpty() || s.pop() != '{')
						return false;
				}
				else if(c == ']')
				{
					if( s.isEmpty() || s.pop() != '[')
						return false;
				}
				else if(c == ')')
				{
					if( s.isEmpty() || s.pop() != '(')
						return false;
				}
			}
					
		}
		
		if(s.isEmpty())
			return true;
		else
			return false;
				
	}
}
