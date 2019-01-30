import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Anagrams {
	
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String firstString = br.readLine();
		String secondString = br.readLine();
		int number = numberNeeded(firstString, secondString);
		
		System.out.println("Number of Chars to be removed: "+number);
		
	}
	public static int numberNeeded(String str1, String str2)
	{
		int[] charCount1 = getCharsCount(str1);
		int[] charCount2 = getCharsCount(str2);
		
		int delta=0;
		for(int i=0; i<charCount1.length; i++)
		{
			delta += Math.abs(charCount1[i] - charCount2[i]);
		}
		return delta;
	}
	public static int[] getCharsCount(String str)
	{
		int[] charCount = new int[26];
		//int[] charCount2 = new int[26];
		
		for(int i=0; i<str.length(); i++)
		{
			int offSet = str.charAt(i) - (int)'a';
			charCount[offSet]++;
		}
		return charCount;
	}
}
