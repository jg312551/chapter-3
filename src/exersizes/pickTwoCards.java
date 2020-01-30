package exersizes;

public class pickTwoCards {
	public static void main(String[] args) {
		final int CARDS_IN_SUIT = 13;
		char suit [] = {'s','c','h','d'};
		int myValue;
		int yourValue;
		int t;
		int t2;
		card myCard = new card();
		card yourCard = new card();
		
		
		 yourValue= ((int)(Math.random() *100)% CARDS_IN_SUIT);
	    myValue= ((int)(Math.random() *100)% CARDS_IN_SUIT);
	    
	   t=((int)(Math.random() * suit.length));
	   t2=((int)(Math.random() * suit.length));
	
	   
	    yourCard.setValue(yourValue);
	    yourCard.setSuit(suit[t2]);
	   
	    myCard.setValue(myValue);
	    myCard.setSuit(suit[t]);
	    
	   
	    System.out.println("my card is the "+ myCard.getValue() +" of "+ myCard.getsuit());

		System.out.println("your card is the "+ yourCard.getValue() +" of "+ yourCard.getsuit());
		    
			
	
		}


}
