package blackjack;

public class Hand {
	
	// actually needs to be passed a player that is instantiated so it know what list to use!
	// x will be the name of the player instantiated at game time
	public int handValue(Player x){
		
		//initialized local variables
		int TotalCardValues = 0;
		
		for (Card card : x.getPlayerCard()) {
			if(card.getRank().ordinal()  >= 0 && card.getRank().ordinal() <= 9){
				//Soft Ace and cards 1-10 .. need to add one to them before adding up value of hand
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
				
		}
		
		return TotalCardValues;
	}
	
	public void printHand(Player x){
		for (Card card : x.getPlayerCard()) {
			System.out.println(card);
		}
	}
	
	
	
	
	
	
}
