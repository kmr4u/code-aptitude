package practice.org;

public class Permutations {

	public static void main(String[] args)
	{
		String name = "MADHU";
		permute(name);
	}
	public static void permute(String s)
	{
		permute("", s);
	}
	public static void permute(String prefix, String s)
	{
		int n=s.length();
		if(n == 0) {System.out.println("permutation: "+prefix);}
		else {
			
			for(int i=0; i<n; i++)
			{
				System.out.println("prefix so far: "+prefix);
				permute(prefix+s.charAt(i), s.substring(0, i)+s.substring(i+1,n));
			}
		}
	}
}
