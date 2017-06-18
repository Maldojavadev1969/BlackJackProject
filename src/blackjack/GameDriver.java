package blackjack;

import java.util.Collections;
import java.util.List;

public class GameDriver {

	public static void main(String[] args) {
		
		//instantiate dealer/player/hand class
		Dealer newDealer = new Dealer();
		Player newPlayer = new Player();
		Player playerIsDealer = new Player();
		Hand thisHand = new Hand();
		
		//initiate game play: get two cards from the dealer and pass to the player list
		newPlayer.addPlayerCard(newDealer.dealerGetCard());
		newPlayer.addPlayerCard(newDealer.dealerGetCard());
		
		System.out.println("\nplayers hand\n");

		
		//now call print method from Hand class
		thisHand.printHand(newPlayer);
		//call handValue method and pass name of instantiated player to get total value of hand
		System.out.println(thisHand.handValue(newPlayer));
		 
		 
		//now initialize the dealer: dealer now get's two cards from the card deck
			playerIsDealer.addPlayerCard(newDealer.dealerGetCard());
			playerIsDealer.addPlayerCard(newDealer.dealerGetCard());
			
	    System.out.println("\nDealer's hand\n");
			
			//now call print method from Hand class
	   thisHand.printHand(playerIsDealer);
			//call handValue method and pass name of instantiated player to get total value of hand
	   System.out.println(thisHand.handValue(playerIsDealer));
		

		//****************** now working on game play to bust or black jack or win
		
		//check value of player one's cards and if under 17 get another card until value of cards is greater than 17!
//		while(P1TotalCardValues < 18){
//			//get another card!!
//			newPlayer.addPlayerCard(newDealer.dealerGetCard());
//			
//			//this will print the last card in the players hand
//			System.out.println(newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1) + " what's in here?");
//			//this line of code will get the players ordinal value of the card that they just got!
//			//System.out.println(newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1).getRank().ordinal() + " what's in here?");
//			//P1TotalCardValues = P1TotalCardValues + newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1).getRank().ordinal();
//
//			if(newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1).getRank().ordinal()  >= 0 && newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1).getRank().ordinal() <= 9){

//			if(P1TotalCardValues > 21){
//				
//				System.out.println("Player one loses: Bust!");
//			}
//			if(P1TotalCardValues == 21){
//				
//				System.out.println("Player one Wins");
//			}			
//		}//end of while loop
		//System.out.println("player hand-value: " + P1TotalCardValues);
		
		
		//*** player 2 the dealer at this moment!
		//check value of player one's cards and if under 17 get another card until value of cards is greater than 17!
//				while(P2TotalCardValues < 18){
//					//get another card!!
//					playerIsDealer.addPlayerCard(newDealer.dealerGetCard());
//					
//					//this will print the last card in the players hand
//					System.out.println(playerIsDealer.getPlayerCard().get(playerIsDealer.getPlayerCard().size() -1) + " what's in here?");
//					//this line of code will get the players ordinal value of the card that they just got!
//					//System.out.println(newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1).getRank().ordinal() + " what's in here?");
//					//P1TotalCardValues = P1TotalCardValues + newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1).getRank().ordinal();
//
//				
//					if(P2TotalCardValues > 21){
//						
//						System.out.println("Dealer loses: Bust!");
//					}
//					if(P2TotalCardValues == 21){
//						
//						System.out.println("Dealer  Wins");
//					}			
//				}//end of while loop
//				System.out.println("Dealer hand-value: " + P2TotalCardValues);

	}//end of main


}//end of class
//Deal two hands of cards - one to a Dealer and another to a Player. Allow the players to Hit 
//(add cards to their hand) or Stay (not add cards to their hand) in accordance to the rules of blackjack shown in the wiki
//. Do not worry about the multiple values for Ace until your basic game logic is working. Assume they are either 1 or 11 to start.