package Controller;

import java.util.List;

import Model.Board;
import Model.Card;
import Model.Game;
import Model.HandCards;
import Model.Player;

public class Controller {
	
	public static void initailizeGame() {
		Board board = new Board("0");
		Game game = new Game(board);
		Player player1 = new Player("Tom", 100);
		Player player2 = new Player("Jerry", 100);
		Card c3 = new Card("club", "3");
		Card h3 = new Card("heart", "3");
		Card s3 = new Card("spade", "3");
		Card d3 = new Card("diamond", "3");
		Card c4 = new Card("club", "4");
		Card h4 = new Card("heart", "4");
		Card s4 = new Card("spade", "4");
		Card d4 = new Card("diamond", "4");
		//......
		//Task1-1£º write 3456789JQKA2NM with four different colors
		game.addCard(c3);
		game.addCard(h3);
		game.addCard(s3);
		game.addCard(d3);
		
		game.addCard(c4);
		game.addCard(h4);
		game.addCard(s4);
		game.addCard(d4);
		//......
		//Task1-2:  add 3456789JQKA2NM with four different colors to game
		// Task1-3: pass your tester (Test.task1)
	}
	
	
	public static String singleCard(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		
		//Task2-1: tell whether str is a valid input
		
		for(Card c : temp) {
			c.getRank() = ConvertStringToInt(str);//Task2-2: write a private function to convert string. ie. "3"-3,"J"-11,"A"-14
		}
		//Task2-3 make sure you have send your card in hand to the board
		if(!legal) str = "false";
		return str;	
		//Task2-4 pass your tester (Test.task2)
	}
	
	public static String DoubleCard(Player player, String str) {
		
		//Task3-1: add here
		return str;	
	}
	
	public static String StraightCard(Player player, String str) {
		
		//Task4-1: add here
		return str;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void computeN(HandCards a) {
//		int[] tmp;
//		tmp=a.getCard().clone();
//		int number=0;
//		
//		for(int i=0; i<=17;i++) {
//			number =+ tmp[i];
//		}
//		a.setNumberOfCards(number);
//	}
//
//	public static void giveC(HandCards person, int value, int number) {
//		int [] tmp = person.getCard().clone();
//		tmp[value] = number;
//		person.setCard(tmp);
//	}
//	
//	
//	
//	public static String singleCard(HandCards player, int a) throws Exception {
//		
//		String temp;
//		if (a == 3) 	temp = "3";				
//		else if (a == 4)  temp = "4";	 					
//		else if (a == 5)  temp = "5";	 					
//		else if (a == 6)  temp = "6";	 			
//		else if (a == 7)  temp = "7";	 				
//		else if (a == 8)  temp = "8";	 				
//		else if (a == 9)  temp = "9";	 				
//		else if (a == 10)  temp = "10";	 				
//		else if (a == 11)  temp = "11";	
//		else if (a == 12)  temp = "12";	 
//		else if (a == 13)  temp = "13";	
//		else if (a == 14)  temp = "14";	 
//		else if (a == 15)  temp = "15";	 
//		else if (a == 16)  temp = "16";	 
//		else if (a == 17)  temp = "17";	 
//		
//		else {
//			throw new Exception("It is illegal!");
//		}
//		
//		int[] temp2 = player.getCard().clone();
//		
//		if(temp2[a]<=0) throw new Exception("It is illegal!");
//		
//		temp2[a]--; 
//		
//		player.setCard(temp2);
//		
//		return temp;
//			
//	}
//	
//	public static void doubleCard() {
//		
//	}
//	
//	public static void tripleCard() {
//		
//	}
//	
//	public static void tripleDDDCard() {
//		
//	}
//	
//	public static void tripleSSSCard() {
//		
//	}	
	
	
}
