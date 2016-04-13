/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"2", "4", "6", "King"};
		String[] suits1 = {"Hearts", "Clubs", "Spades", "Diamonds"};
		int[] values1 = {2, 4, 6, 13};
	    Deck deck1 = new Deck(ranks1, suits1, values1);
	    System.out.println("How many cards are in this deck? " + deck1.size());
	   
	    
	    String[] ranks2 = {};
	    String[] suits2 = {};
	    int[] values2 = {};
	    Deck deck2 = new Deck(ranks2, suits2, values2);
	    System.out.println("This deck should be empty, is it? " + deck2.isEmpty());
	    
	    String[] ranks3 = {"1", "3", "Queen", "2", "4", "6", "King"};
	    String[] suits3 = {"Diamonds", "Spades", "Clubs", "Spades", "Diamonds", "Spades", "Hearts"};
	    int[] values3 = {1, 3, 12, 2, 4, 6, 13};
	    Deck deck3 = new Deck(ranks3, suits3, values3);
	    System.out.println("If i deal a card from this deck i will get is the: " + deck3.deal());
	    System.out.println("If i deal a card from this deck i will get is the: " + deck3.deal());
	    System.out.println("If i deal a card from this deck i will get is the: " + deck3.deal());
	}
}