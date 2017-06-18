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
	//may need this to get the hand the player has at the moment
	public List<Card> getPlayerCard() {
		
		return playerCards;
	}
	
	//player needs to ask dealer for a card if hand is less than 17("hit") method
	
	//maybe add a player's hand print function that can be called from the main

	//may  not need this setter because we have  a method that adds a card to a players hand
//	public void setPlayerCard(List<Card> playerCard) {
//		this.playerCards = playerCard;
//	}
	
	// add card to players card list.. do this from the main by taking a card from the deck
	// by the dealer calling a method that gets a card and then passes this card to the
	// players list
	public void addPlayerCard(Card mycard){
		playerCards.add(mycard);
	}
	
	
	
}
