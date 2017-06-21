package blackjack;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GameDriver {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your player name: ");
		String newPlayerName = kb.next();
		System.out.println("Here is the shuffled deck: ");

		//instantiate dealer/player/hand class
		Dealer newDealer = new Dealer();
		Player newPlayer = new Player();
		Player playerIsDealer = new Player();
		Hand thisHand = new Hand();
		
		//initiate game play: get two cards from the dealer and pass to the player list
		newPlayer.addPlayerCard(newDealer.dealerGetCard());
		newPlayer.addPlayerCard(newDealer.dealerGetCard());
		
		System.out.println("\n" + newPlayerName + " hand\n");
		
		//now call print method from Hand class
		thisHand.printHand(newPlayer);
		//call handValue method and pass name of instantiated player to get total value of hand
		System.out.println("total value of cards: " + thisHand.handValue(newPlayer));
		 
		 
		//now initialize the dealer: dealer now get's two cards from the card deck
		playerIsDealer.addPlayerCard(newDealer.dealerGetCard());
		playerIsDealer.addPlayerCard(newDealer.dealerGetCard());
			
	    System.out.println("\nDealer's hand\n");
			
			//now call print method from Hand class
	   thisHand.printHand(playerIsDealer);
			//call handValue method and pass name of instantiated player to get total value of hand
		System.out.println("total value of cards: " + thisHand.handValue(playerIsDealer));

	   //System.out.println(thisHand.handValue(playerIsDealer));
	   
		if(thisHand.handValue(newPlayer) == 21)
		{
			   System.out.println(newPlayerName + " Wins: Black Jack!");
			   System.exit(0);
	    }
	    if(thisHand.handValue(playerIsDealer) == 21)
	    {
		   System.out.println("Dealer Wins: Black Jack!");
		   System.exit(0);
	    }
	   
//	   if(thisHand.handValue(newPlayer) == 21 && thisHand.handValue(playerIsDealer) == 21){
//		   System.out.println("Player one and Dealer both have Black Jack: No one wins!");
//		   System.exit(0);
//	   }
	  		
		//****************** game play to bust or win
		
	    //check value of player one's cards and if under 17 get another card until value of cards is greater than 17!
		//while(thisHand.handValue(newPlayer) <= 17){
			//get another card!!
			System.out.println(newPlayerName + " hit or stay? ");
			String userInput = kb.next();
			while(userInput.equals("hit"))
			{
				if(userInput.equals("hit"))
				{
					newPlayer.addPlayerCard(newDealer.dealerGetCard());
					System.out.println("\n" + newPlayerName + " hand\n");
					thisHand.printHand(newPlayer);
					if(thisHand.handValue(newPlayer) > 21)
					{
						System.out.println(newPlayerName +" loses: Bust!");
						System.exit(0);
					}
				}
				if(userInput.equals("stay"))
				{
					break;
				}
				System.out.println(newPlayerName + " hit or stay? ");
				userInput = kb.next();
				
			}

			//this will print the last card in the players hand
			//System.out.println(newPlayer.getPlayerCard().get(newPlayer.getPlayerCard().size() -1) + " what's in here?");
		    //System.exit(0);
			
		//*** player 2: the dealer at this moment!
			while(thisHand.handValue(playerIsDealer) <= 17){
					playerIsDealer.addPlayerCard(newDealer.dealerGetCard());
					System.out.println("\nDealers hand\n");
					thisHand.printHand(playerIsDealer);

					if(thisHand.handValue(playerIsDealer) > 21){
						//thisHand.printHand(playerIsDealer);
						System.out.println("Dealer loses: Bust!");
						System.exit(0);
					}
	
			}//end of while loop

				System.out.println("Dealer hand-value: " + thisHand.handValue(playerIsDealer));
				System.out.println("Player one's hand-value: " + thisHand.handValue(newPlayer));

				
				//winner is the one with the highest score at this time if no one has 21 or busted
				if(thisHand.handValue(playerIsDealer) > thisHand.handValue(newPlayer))
				{
					System.out.println("Dealer Wins!");
				}
				if(thisHand.handValue(playerIsDealer) < thisHand.handValue(newPlayer))
				{
					System.out.println("Player one Wins!");
				}
				if(thisHand.handValue(newPlayer) == (thisHand.handValue(playerIsDealer))){
					System.out.println("Player one and Dealer have same score: no one wins!");

				}


	}//end of main

}