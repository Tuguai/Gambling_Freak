package Controller;

import Model.HandCards;

public class Controller {
	
	public static void computeN(HandCards a) {
		int[] tmp;
		tmp=a.getCard().clone();
		int number=0;
		
		for(int i=0; i<=17;i++) {
			number =+ tmp[i];
		}
		a.setNumberOfCards(number);
	}

	public static void giveC(HandCards person, int value, int number) {
		int [] tmp = person.getCard().clone();
		tmp[value] = number;
		person.setCard(tmp);
	}
	
	
	
	public static String singleCard(HandCards player, int a) throws Exception {
		
		String temp;
		if (a == 3) 	temp = "3";				
		else if (a == 4)  temp = "4";	 					
		else if (a == 5)  temp = "5";	 					
		else if (a == 6)  temp = "6";	 			
		else if (a == 7)  temp = "7";	 				
		else if (a == 8)  temp = "8";	 				
		else if (a == 9)  temp = "9";	 				
		else if (a == 10)  temp = "10";	 				
		else if (a == 11)  temp = "11";	
		else if (a == 12)  temp = "12";	 
		else if (a == 13)  temp = "13";	
		else if (a == 14)  temp = "14";	 
		else if (a == 15)  temp = "15";	 
		else if (a == 16)  temp = "16";	 
		else if (a == 17)  temp = "17";	 
		
		else {
			throw new Exception("It is illegal!");
		}
		
		int[] temp2 = player.getCard().clone();
		
		if(temp2[a]<=0) throw new Exception("It is illegal!");
		
		temp2[a]--; 
		
		player.setCard(temp2);
		
		return temp;
			
	}
	
	public static void doubleCard() {
		
	}
	
	public static void tripleCard() {
		
	}
	
	public static void tripleDDDCard() {
		
	}
	
	public static void tripleSSSCard() {
		
	}	
	
	
}
