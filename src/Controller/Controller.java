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
		game.addDealer(player1);
		game.addDealer(player2);
		// by Changzi Chen
		Card c3 = new Card("club", '3', 1);
		Card h3 = new Card("heart", '3', 2);
		Card s3 = new Card("spade", '3',3);
		Card d3 = new Card("diamond", '3',4);
		
		Card c4 = new Card("club", '4',5);
		Card h4 = new Card("heart", '4',6);
		Card s4 = new Card("spade", '4',7);
		Card d4 = new Card("diamond", '4',8);
		
		Card c5 = new Card("club", '5',9);
        Card h5 = new Card("heart", '5',10);
        Card s5 = new Card("spade", '5',11);
        Card d5 = new Card("diamond", '5',12);
        
        Card c6 = new Card("club", '6',13);
        Card h6 = new Card("heart", '6',14);
        Card s6 = new Card("spade", '6',15);
        Card d6 = new Card("diamond", '6',16);
        
        Card c7 = new Card("club", '7',17);
        Card h7 = new Card("heart", '7',18);
        Card s7 = new Card("spade", '7',19);
        Card d7 = new Card("diamond", '7',20);
        
        Card c8 = new Card("club", '8',21);
        Card h8 = new Card("heart", '8',22);
        Card s8 = new Card("spade", '8',23);
        Card d8 = new Card("diamond", '8',24);
        
        Card c9 = new Card("club", '9',25);
        Card h9 = new Card("heart", '9',26);
        Card s9 = new Card("spade", '9',27);
        Card d9 = new Card("diamond", '9',28);
        
        Card c10 = new Card("club", 'T',29);
        Card h10 = new Card("heart", 'T',30);
        Card s10 = new Card("spade", 'T',31);
        Card d10 = new Card("diamond", 'T',32);
        
        Card c11 = new Card("club", 'J',33);
        Card h11 = new Card("heart", 'J',34);
        Card s11 = new Card("spade", 'J',35);
        Card d11 = new Card("diamond", 'J',36);
        
        Card c12 = new Card("club", 'Q',37);
        Card h12 = new Card("heart", 'Q',38);
        Card s12 = new Card("spade", 'Q',39);
        Card d12 = new Card("diamond", 'Q',40);
        
        Card c13 = new Card("club", 'K',41);
        Card h13 = new Card("heart", 'K',42);
        Card s13 = new Card("spade", 'K',43);
        Card d13 = new Card("diamond", 'K',44);
        
        Card c14 = new Card("club", 'A',45);
        Card h14 = new Card("heart", 'A',46);
        Card s14 = new Card("spade", 'A',47);
        Card d14 = new Card("diamond", 'A',48);
        
        Card c15 = new Card("club", '2',49);
        Card h15 = new Card("heart", '2',50);
        Card s15 = new Card("spade", '2',51);
        Card d15 = new Card("diamond", '2',52);
        
        Card j1 = new Card("black",'w',53); //joker
        Card j2 = new Card("red", 'W',54); //JOKER

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
		boolean legal = false;
		List<Card> temp = player.getHand();
		
		//Task2-1: tell whether str is a valid input
		
		if(str.length()!=1) {
			return "0";
		}
		
		
		char SmallJoker = 'w';
		char x = str.charAt(0);
		
		if(x!=SmallJoker) {
			x = Character.toUpperCase(x);
		}
		
		int i=0;
		for(i=0; i<temp.size();i++) {
			if (temp.get(i).getRank()==x) {
				legal =true;
				break;
			}
		}
		
		//Task2-2: write a private function to convert string. ie. "3"-3,"J"-11,"A"-14
		
		//Task2-3 make sure you have send your card in hand to the board
		
		if (legal){
			player.removeHand(temp.get(i));
			
			return str;
		}else {
			return "0";
			}
		}
	

	
	
	/**
	 * Feature: Double
	 * @author: Jianmo Li
	 * @param
	 * @return
	 * @exception
	 * 
	 */
	public static String DoubleCard(Player player, String str) {
		
		//Task3-1: add here
		boolean legal=true;
		List<Card> temp=player.getHand();
		
		legal=(legalNameDoubleCards(str)&&checkPlayHasCardsInHand(temp,str));
		if(!legal) return "0";
		
		removeDoubleCardsRandomly(player,str.charAt(0));
		
		
		return str;	
	}
	/**
	 * 
	 * @author Jianmo Li
	 * @param  legal name for straight cards
	 * @exception 
	 * 
	 */
	private static boolean legalNameDoubleCards(String str) {
		boolean legal = true;
		if(str.length()==2) {
			int asciiS = (int)str.charAt(0);
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>15) ) {
				legal = false;
			}
	
			int value1 = convertCharToInt(str.charAt(0));
			int value2 = convertCharToInt(str.charAt(1));
			if(value1 !=value2 ) {
				legal = false;//check whether it is in sequence(increasing order)
			}
		}
		else {
			legal = false;
		}
		return legal;
	}
	
	/**
	 * 
	 * @author Jianmo Li
	 * @param  remove 2 same cards without suit
	 * @exception 
	 * 
	 */
	private static void removeDoubleCardsRandomly(Player player, char rank) {
		for(int i=0;i<2;i++) removeSingleCardRandomly(player,rank);
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
		
		legal = (legalNameStraightCards(str) && checkPlayHasCardsInHand(temp,str));
		if(!legal) return "0";
		
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		
		
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
		List<Card> temp = player.getHand();
		for(int i=0; i<temp.size(); i++) {
			if(temp.get(i).getRank()==rank) {
				player.removeHand(temp.get(i));
			}
		}
		
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
		for(int i=0; i<temp.size(); i++) {
			char m = temp.get(i).getRank();
			int value = convertCharToInt(m);
			a[value] ++;
		}
		return a;
	}
	private static int[] convertStringIntoArray(String str) {
		//step 2
		int[] a = new int[18];
		for(int i=0; i<=17; i++) { a[i] = 0;}
		for(int i=0; i<str.length(); i++) {
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
	 * @exception 
	 * 
	 */
	private static int convertCharToInt(char chr) {
		//int a = (int)chr;
		if(  ((int)chr>=51)  &&   ((int)chr<=57) ) {
			return ( (int)chr - 48    );
		}
		
		if(   (chr=='W')   ) {
			return 17;
		}
		if(   (chr=='w')   ) {
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
	
	
	
	
	
	/**
	 * 
	 * @author Yuelin Liu
	 * @explain  assign the cards to two players
	 * @exception 
	 * 
	 */
	public static void assignCardTest1() {
		
		FL fl = FightTheLandlordApplication.getFL();
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		Player p2 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(1);
		
		for(int i=1; i<=27; i++) {
			p1.addHand(Card.getWithId  (  (i*2)-1 )   );
		}
		for(int i=1; i<=27; i++) {
			p2.addHand(Card.getWithId  (  (i*2))   );
		}
		
	}
	
	/**
	 * 
	 * @author Yuelin Liu
	 * @explain  assign the cards to two players
	 * @exception 
	 * 
	 */
	public static void assignCardTest2() {
		
		FL fl = FightTheLandlordApplication.getFL();
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		Player p2 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(1);
		
		for(int i=1; i<=27; i++) {
			p1.addHand(Card.getWithId(i) );
		}
		for(int i=1; i<=27; i++) {
			p2.addHand(Card.getWithId(i+27)  );
		}
		
	}
	

	/**
	 * 
	 * @author Yuelin Liu
	 * @explain  remove all the cards
	 * @exception 
	 * 
	 */
	
	public static void removeAllCardsForPlayer(Player player) {
		List<Card> cards = player.getHand();
		for(int i=0; i<cards.size(); i++) {
			player.removeHand(cards.get(i));
		}	
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
