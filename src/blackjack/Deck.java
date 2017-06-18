package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	List<Card> deck;
	
	//this method will be called  to get a deck of 52 cards
	public void createDeck(){
		deck = new ArrayList<>(52);

        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                deck.add(new Card(r, s));
            }
        }
        //may need to make this a seperate method for printing out a deck of cards
//        for (Card card : deck) {
//            System.out.println(card);
//        }
		
	}

	public List<Card> getDeck() {
		return deck;
	}

	public void setDeck(List<Card> deck) {
		this.deck = deck;
	}
	
	

}
