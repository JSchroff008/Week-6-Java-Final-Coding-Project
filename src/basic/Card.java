package basic;

public class Card {
	public int cardValue;
	public String cardName;
	public Card(int newCardValue, String cardSuit) {
		cardValue = newCardValue;
		
		switch(newCardValue) {
			case 2: cardName = "2";
				break;
			case 3: cardName = "3";
				break;
			case 4: cardName = "4";
				break;
			case 5: cardName = "5";
				break;
			case 6: cardName = "6";
				break;
			case 7: cardName = "7";
				break;
			case 8: cardName = "8";
				break;
			case 9: cardName = "9";
				break;
			case 10: cardName = "10";
				break;
			case 11: cardName = "Jack";
				break;
			case 12: cardName = "Queen";
				break;
			case 13: cardName = "King";
				break;
			case 14: cardName = "Ace";
				break;
		}
		cardName += " of " + cardSuit;
	}
	public void describe() {
		System.out.println("Card: %s with value of %d\n" + cardName + cardValue);
	}
	public int getValue() {
		return cardValue;
	}
	public void setValue(int cardValue) {
		this.cardValue = cardValue;
	}
	public String getName() {
		return cardName;
	}
	public void setName(String cardName) {
		this.cardName = cardName;
	}
}