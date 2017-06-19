package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> playerCards;
	
	//constructor list of player cards
	public Player(){
		playerCards = new ArrayList<Card>();
	}

	//getter for getting a list of a  players cards
	public List<Card> getPlayerCard() {
		
		return playerCards;
	}
	
	public void addPlayerCard(Card mycard){
		playerCards.add(mycard);
	}
	
	
	
}
