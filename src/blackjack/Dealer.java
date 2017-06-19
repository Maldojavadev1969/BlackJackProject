package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {
	

	Deck dealerDeck = new Deck();
	
	public Dealer() {
		super();
		dealerDeck.createDeck();
		Collections.shuffle(dealerDeck.getDeck());
		//now print out shuffled deck to terminal before game play
		dealerDeck.printDeck();
	}

	public Card  dealerGetCard() {
		//get card from dealer deck and store in variable mycard
		//and then remove that card from  the deck so now we have 52 cards - 1 from the top each time
		Card mycard = dealerDeck.getDeck().get(0);
		dealerDeck.getDeck().remove(0);
		//System.out.println("size of deck after removing card " + dealerDeck.getDeck().size());
		
		return mycard;
	}
	

}
