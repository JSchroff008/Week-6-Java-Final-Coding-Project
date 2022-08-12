package basic;

public class App {
	
	public static void main(String[] args) {
		Deck cardDeck = new Deck();
		Player p1 = new Player("1");
		Player p2 = new Player("2");
		cardDeck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				p1.draw(cardDeck);
			} else {
				p2.draw(cardDeck);
			}
		}
		
		for(int i = 0; i < 26; i++) {
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			if(p1Card.getValue() > p2Card.getValue()) {
				p1.addScore();
			} else if (p1Card.getValue() < p2Card.getValue()) {
				p2.addScore();
			}
		}
		
		System.out.printf("Player 1 Score: %d\n", p1.returnScore());
		System.out.printf("Player 2 Score: %d\n", p2.returnScore());
		if(p1.returnScore() > p2.returnScore()) {
			System.out.println("Player 1 Wins!!!");
		} else if (p1.returnScore() < p2.returnScore()) {
			System.out.println("Player 2 Wins!!!");
		} else {
			System.out.println("Players Draw.");
		}
	}
}
