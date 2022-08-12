package basic;
import java.util.List;
import java.util.ArrayList;

public class Player {
	public List<Card> cardInHand = new ArrayList<Card>();
	public int score;
	public String cardName;
	
	public Player() {
		score = 0;
	}
	public Player(String newCard) {
		cardName = newCard;
		score = 0;
	}
	public void describe() {
		System.out.printf("Player %s has the following cards: \n", cardName);
		for(Card card : cardInHand) {
			card.describe();
		}
	}
	public Card flip() {
		return cardInHand.remove(0);
	}
	public void draw(Deck deck) {
		cardInHand.add(deck.draw());
	}
	public void addScore() {
		score++;
	}
	public int returnScore() {
		return score;
	}
}
