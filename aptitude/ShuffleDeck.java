import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ShuffleDeck {
	private static List<Integer> deck = new ArrayList<Integer>();
	private static Object[]  pack = new Object[52];
	
	public static void main(String args[])
	{
		
		Random random = new Random();
		for(int i=0; i<52; i++)
		{
			pack[i] = i;
		}
		for(int i=0; i<52; i++)
		{
			deck.add((Integer)pack[random.nextInt(52)]);
		}
		
		pack = deck.toArray();
		
		System.out.println("Shuffled Deck: ");
		for(int i=0; i<52; i++)
		{
			System.out.print(pack[i]+" ");
		}
	}
}
