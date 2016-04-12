/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Spades", "8", 8);
		Card card2 = new Card("Spades", "8", 8);
		Card card3 = new Card("Clubs", "King", 13);
		
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		System.out.println(card3.toString());
		
		System.out.println("do cards 3 and 2 match? " + card2.matches(card3));
		System.out.println("do cards 1 and 3 match?  " + card1.matches(card3));
		System.out.println("do cards 1 and 2 match? " + card1.matches(card2));
	}
}