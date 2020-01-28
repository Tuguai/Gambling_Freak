package Controller;

import java.util.List;

import Model.Board;
import Model.Card;
import Model.FL;
import Model.Game;
import Model.HandCards;
import Model.Player;
import Application.FightTheLandlordApplication;
import Application.Main2;

public class Controller {
	
	public static void initailizeGame() {
		FL currentFL = FightTheLandlordApplication.getFL();
		Board board = new Board("0",currentFL);
		Game game = new Game(board, currentFL);
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
		
		Card c5 = new Card("club", "5");
        Card h5 = new Card("heart", "5");
        Card s5 = new Card("spade", "5");
        Card d5 = new Card("diamond", "5");
        
        Card c6 = new Card("club", "6");
        Card h6 = new Card("heart", "6");
        Card s6 = new Card("spade", "6");
        Card d6 = new Card("diamond", "6");
        
        Card c7 = new Card("club", "7");
        Card h7 = new Card("heart", "7");
        Card s7 = new Card("spade", "7");
        Card d7 = new Card("diamond", "7");
        
        Card c8 = new Card("club", "8");
        Card h8 = new Card("heart", "8");
        Card s8 = new Card("spade", "8");
        Card d8 = new Card("diamond", "8");
        
        Card c9 = new Card("club", "9");
        Card h9 = new Card("heart", "9");
        Card s9 = new Card("spade", "9");
        Card d9 = new Card("diamond", "9");
        
        Card c10 = new Card("club", "T");
        Card h10 = new Card("heart", "T");
        Card s10 = new Card("spade", "T");
        Card d10 = new Card("diamond", "T");
        
        Card c11 = new Card("club", "J");
        Card h11 = new Card("heart", "J");
        Card s11 = new Card("spade", "J");
        Card d11 = new Card("diamond", "J");
        
        Card c12 = new Card("club", "Q");
        Card h12 = new Card("heart", "Q");
        Card s12 = new Card("spade", "Q");
        Card d12 = new Card("diamond", "Q");
        
        Card c13 = new Card("club", "K");
        Card h13 = new Card("heart", "K");
        Card s13 = new Card("spade", "K");
        Card d13 = new Card("diamond", "K");
        
        Card c14 = new Card("club", "A");
        Card h14 = new Card("heart", "A");
        Card s14 = new Card("spade", "A");
        Card d14 = new Card("diamond", "A");
        
        Card c15 = new Card("club", "2");
        Card h15 = new Card("heart", "2");
        Card s15 = new Card("spade", "2");
        Card d15 = new Card("diamond", "2");
        
        Card j1 = new Card("black","j"); //joker
        Card j2 = new Card("red", "J"); //JOKER

		//Task1-1�� write 3456789JQKA2NM with four different colors
		game.addCard(c3);
		game.addCard(h3);
		game.addCard(s3);
		game.addCard(d3);
		
		game.addCard(c4);
		game.addCard(h4);
		game.addCard(s4);
		game.addCard(d4);
		
		game.addCard(c5);
        game.addCard(h5);
        game.addCard(s5);
        game.addCard(d5);
        
        game.addCard(c6);
        game.addCard(h6);
        game.addCard(s6);
        game.addCard(d6);
        
        game.addCard(c7);
        game.addCard(h7);
        game.addCard(s7);
        game.addCard(d7);
        
        game.addCard(c8);
        game.addCard(h8);
        game.addCard(s8);
        game.addCard(d8);
        
        game.addCard(c9);
        game.addCard(h9);
        game.addCard(s9);
        game.addCard(d9);
        
        game.addCard(c10);
        game.addCard(h10);
        game.addCard(s10);
        game.addCard(d10);
        
        game.addCard(c11);
        game.addCard(h11);
        game.addCard(s11);
        game.addCard(d11);
        
        game.addCard(c12);
        game.addCard(h12);
        game.addCard(s12);
        game.addCard(d12);
        
        game.addCard(c13);
        game.addCard(h13);
        game.addCard(s13);
        game.addCard(d13);
        
        game.addCard(c14);
        game.addCard(h14);
        game.addCard(s14);
        game.addCard(d14);
        
        game.addCard(c15);
        game.addCard(h15);
        game.addCard(s15);
        game.addCard(d15);
        
        game.addCard(j1);
        game.addCard(j2);
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
	
	
	/**
	 * Feature:Straight
	 * 
	 * @author Yuelin Liu
	 * @param 
	 * @return 
	 * @exception 
	 * 
	 */
	public static String StraightCard(Player player, String str) {
		
		
		//Task4-1: add here
		
		boolean legal = true;
		List<Card> temp = player.getHand();
		
		legal = legalNameStraightCards(str);
		legal = checkPlayHasCardsInHand(temp,str);
		if(!legal) return "0";
		
		int[] command = convertStringIntoArray(str);
		
		
		return str;	
	}
	
	/**
	 * 
	 * @author Yuelin Liu
	 * @param  remove card without suit
	 * @exception 
	 * 
	 */
	private static void removeSingleCardRandomly(Player player, char rank) {
		
	}
	
	/**
	 * 
	 * @author Yuelin Liu
	 * @param  legal name for straight cards
	 * @exception 
	 * 
	 */
	private static boolean legalNameStraightCards(String str) {
		boolean legal = true;
		if(str.length()==5) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>10) ) {
				legal = false;
			}
			for(int i=0;i<=3;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==6) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>9) ) {
				legal = false;
			}
			for(int i=0;i<=4;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==7) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>8) ) {
				legal = false;
			}
			for(int i=0;i<=5;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==8) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>7) ) {
				legal = false;
			}
			for(int i=0;i<=6;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==9) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>6) ) {
				legal = false;
			}
			for(int i=0;i<=7;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==10) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>5) ) {
				legal = false;
			}
			for(int i=0;i<=8;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==11) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>4) ) {
				legal = false;
			}
			for(int i=0;i<=9;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else if(str.length()==12) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>3) ) {
				legal = false;
			}
			for(int i=0;i<=10;i++) {
				int value1 = convertCharToInt(str.charAt(i));
				int value2 = convertCharToInt(str.charAt(i+1));
				if(value1+1 !=value2 ) {
					legal = false;//check whether it is in sequence(increasing order)
				}
			}
		}
		else {
			legal = false;
		}
		return legal;
	}
	
	
	/**
	 * 
	 * @author Yuelin Liu
	 * @param  checkPlayHasCardsInHand
	 * @exception 
	 * 
	 */
	private static boolean checkPlayHasCardsInHand(List<Card> temp, String str) {
		
		//step 1: convert cards into an array
		int[] hands = convertCardsIntoArray(temp);
		
		//step 2: convert the String
		int[] command = convertStringIntoArray(str);
		
		//step 3; for loop to check each char in the String
		for(int i=0; i<=17; i++) {
			if(command[i]>hands[i])
				return false;
		}
		return true;
	}
	private static int[] convertCardsIntoArray(List<Card> temp) {
		//step 1
		int[] a = new int[18];
		for(int i=0; i<=17; i++) { a[i] = 0;}
		for(int i=0; i<=temp.size(); i++) {
			char m = temp.get(i).getRank().charAt(0);
			int value = convertCharToInt(m);
			a[value] ++;
		}
		return a;
	}
	private static int[] convertStringIntoArray(String str) {
		//step 2
		int[] a = new int[18];
		for(int i=0; i<=17; i++) { a[i] = 0;}
		for(int i=0; i<=str.length(); i++) {
			char m = str.charAt(i);
			int value = convertCharToInt(m);
			a[value] ++;
		}
		
		return a;
	}

	
	
	/**
	 * 
	 * @author Yuelin Liu
	 * @param  3456789TJQKA --> 3456789 10 11 12 13 14
	 * @exception No 2 and jokers!
	 * 
	 */
	private static int convertCharToInt(char chr) {
		if(  ((int)chr>=51)  ||   ((int)chr<=57) ) {
			return ( (int)chr - 48    );
		}
		
		if(   (chr=='J')   ) {
			return 17;
		}
		if(   (chr=='j')   ) {
			return 16;
		}
		if(   (chr=='2')   ) {
			return 15;
		}
		if(   (chr=='A')  ||   (chr=='a')   ) {
			return 14;
		}
		if(   (chr=='K')  ||   (chr=='k')   ) {
			return 13;
		}
		if(   (chr=='Q')  ||   (chr=='q')   ) {
			return 12;
		}
		if(   (chr=='J')  ||   (chr=='j')   ) {
			return 11;
		}
		if(   (chr=='T')  ||   (chr=='t')   ) {
			return 10;
		}

		return 0;
		
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
