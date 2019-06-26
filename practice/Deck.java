package practice.org;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck{

	public static void main(String[] args)
	{
		System.out.println(Suit.CLUBS.getRanks()); 
		
		List<Suit> cards = new ArrayList<>(Arrays.asList(Suit.values()));
		
		cards.forEach(x -> System.out.println(x.getRanks()));
		
	}
}

enum Rank{
	ACE,
	TWO,
	THREE,
	FOUR,
	FIVE,
	SIX,
	SEVEN,
	EIGHT,
	NINE,
	TEN,
	JACK,
	QUEEN,
	KING;
	
	@Override
	public String toString()
	{
		return this.name()+"";
	}
}

enum Suit{
	CLUBS(Rank.values()),
	SPADES(Rank.values()),
	HEARTS(Rank.values()),
	DIAMONDS(Rank.values());
	
	private final Rank[] ranks;
	/*private final List<Card> cards = new ArrayList<>();*/
	Suit(Rank[] ranks)
	{
		this.ranks = ranks;
		//this.cards.add(new Card(this, this.ranks));
	}
	
	/*public List<Card> getCards()
	{
		return this.cards;
	}*/
	
	public List<Rank> getRanks()
	{
		return Arrays.asList(this.ranks);
	}
	
	@Override
	public String toString()
	{
		return this.name()+"";
	}
}

class Card{
	private Suit suit;
	private Rank[] ranks;
	public Card(Suit suit, Rank[] ranks)
	{
		this.suit = suit;
		this.ranks = ranks;
	}
	public Suit getSuit() {
		return suit;
	}
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	public Rank[] getRanks() {
		return ranks;
	}
	public void setRanks(Rank[] ranks) {
		this.ranks = ranks;
	}
	
	@Override
	public String toString()
	{
		return this.suit+": "+Arrays.asList(this.ranks);
	}
}
