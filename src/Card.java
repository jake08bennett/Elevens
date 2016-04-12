/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String cardSuit;

	/**
	 * String value that holds the cardRank of the card
	 */
	private String cardRank;

	/**
	 * int value that holds the point value.
	 */
	private int cardPointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardcardRank  a <code>String</code> value
	 *                  containing the cardRank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardcardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardcardRank, String cardSuit, int cardcardPointValue) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		 this.cardSuit = cardSuit;
	     this.cardRank = cardcardRank;
	     this.cardPointValue = cardcardPointValue;
	}


	/**
	 * Accesses this <code>Card's</code> suit.
	 * @return this <code>Card's</code> suit.
	 */
	public String suit() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return this.cardSuit;
   }

	/**
	 * Accesses this <code>Card's</code> cardRank.
	 * @return this <code>Card's</code> cardRank.
	 */
	public String cardRank() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return this.cardRank;
	}

   /**
	 * Accesses this <code>Card's</code> point value.
	 * @return this <code>Card's</code> point value.
	 */
	public int cardPointValue() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return this.cardPointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the cardRank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean matches(Card otherCard) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return this.cardSuit.equals(otherCard.cardSuit) && this.cardRank.equals(otherCard.cardRank) && this.cardPointValue == otherCard.cardPointValue;
	       
	}

	/**
	 * Converts the cardRank, suit, and point value into a string in the format
	 *     "[cardRank] of [Suit] (point value = [cardPointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the cardRank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		return "The card of " + this.cardRank + " has a cardRank of " + this.cardSuit + ". The point value is  " + this.cardPointValue;
	}
}