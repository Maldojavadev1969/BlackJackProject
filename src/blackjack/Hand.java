package blackjack;

public class Hand {
	
	// actually needs to be passed a player that is instantiated so it know what list to use!
	// x will be the name of the player instantiated at game time
	public int handValue(Player x){
		
		//initialized local variables
		int TotalCardValues = 0;
		
		for (Card card : x.getPlayerCard()) {
			if(card.getRank().ordinal()  >= 0 && card.getRank().ordinal() <= 9){
				//cards 2-10 .. need to add one to them before adding up value of hand
				TotalCardValues =  TotalCardValues + (card.getRank().ordinal() + 1);
			}
			if(card.getRank().ordinal() == 10){
				//Jack
				TotalCardValues = TotalCardValues + card.getRank().ordinal();
			}
			if(card.getRank().ordinal() == 11){
				//Queen
				TotalCardValues = TotalCardValues + (card.getRank().ordinal() - 1);

			}
			if(card.getRank().ordinal() == 12){
				//King
				TotalCardValues = TotalCardValues + (card.getRank().ordinal() - 2);
			}
			//ran into some problems with attempting to make it work with 1 and 11 values!!
			//working with the Ace... if total is less than 21 have the ace equal to 11 
			// and if total is greater than 21 than the Ace is one!
//			if((TotalCardValues + 11) <= 21 & card.getRank().ordinal() == 0){
//				TotalCardValues =  TotalCardValues + (card.getRank().ordinal() + 10);
//			}
//			if((TotalCardValues + 11) > 21 & card.getRank().ordinal() == 0){
//				TotalCardValues =  TotalCardValues + (card.getRank().ordinal() + 1);
//			}
				
		}
		
		//if total with Ace as "11" is less than or equal to 21 then  play ace as  "11" 
		//if total with Ace as if not then play Ace as "1"
		
		return TotalCardValues;
	}
	
	public void printHand(Player x){
		for (Card card : x.getPlayerCard()) {
			System.out.println(card);
		}
	}
	
	
	
	
	
	
}
