package basic;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	List<Card> deckCards = new ArrayList<Card>();
	List<String> deckSuits = Arrays.asList("Clubs", "Spades", "Hearts", "Diamonds");
	
	public Deck() {
		for(int i = 2; i <= 14; i++) {
			for(String cardSuit : deckSuits) {
				deckCards.add(new Card(i, cardSuit));
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(deckCards);
	}
	public Card draw() {
		return deckCards.remove(0);
	}
}