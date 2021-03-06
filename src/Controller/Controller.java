package Controller;

import java.util.ArrayList;
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
	
	
	public static boolean playCards(Player player,String str) {
		if(legalNameSingleCards(str)) {
			String str1 = singleCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			if(!str1.equals("0"))
			return true;
		}
		if(legalNameDoubleCards(str)) {
			String str1 = DoubleCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameThreeCards(str)) {
			String str1 = ThreeCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards5(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards6(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards7(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards8(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards9(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards10(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards11(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameStraightCards12(str)) {
			String str1 = StraightCard(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameThreeDOne(str)) {
			String str1 = ThreeDOne(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameThreeDTwo(str)) {
			String str1 = ThreeDTwo(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameKingBomb(str)) {
			String str1 = KingBomb(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameFourBomb(str)) {
			String str1 = FourBomb(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameFourDTwo(str)) {
			String str1 = FourDTwoS(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameFourDTwoPair(str)) {
			String str1 = FourDTwoPair(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight3(str)) {
			String str1 = DoubleStraight3(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight4(str)) {
			String str1 = DoubleStraight4(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight5(str)) {
			String str1 = DoubleStraight5(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight6(str)) {
			String str1 = DoubleStraight6(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight7(str)) {
			String str1 = DoubleStraight7(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight8(str)) {
			String str1 = DoubleStraight8(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight9(str)) {
			String str1 = DoubleStraight9(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNameDoubleStraight10(str)) {
			String str1 = DoubleStraight10(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA1BBB1(str)) {
			String str1 = PlaneAAA1BBB1(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA22BBB22(str)) {
			String str1 = PlaneAAA22BBB22(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA1BBB1CCC1(str)) {
			String str1 = PlaneAAA1BBB1CCC1(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA22BBB22CCC22(str)) {
			String str1 = PlaneAAA22BBB22CCC22(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA1BBB1CCC1DDD1(str)) {
			String str1 = PlaneAAA1BBB1CCC1DDD1(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA22BBB22CCC22DDD22(str)) {
			String str1 = PlaneAAA22BBB22CCC22DDD22(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAA1BBB1CCC1DDD1EEE1(str)) {
			String str1 = PlaneAAA1BBB1CCC1DDD1EEE1(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAABBB(str)) {
			String str1 = PlaneAAABBB(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAABBBCCC(str)) {
			String str1 = PlaneAAABBBCCC(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAABBBCCCDDD(str)) {
			String str1 = PlaneAAABBBCCCDDD(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAABBBCCCDDDEEE(str)) {
			String str1 = PlaneAAABBBCCCDDDEEE(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		if(legalNamePlaneAAABBBCCCDDDEEEFFF(str)) {
			String str1 = PlaneAAABBBCCCDDDEEEFFF(player, str);
			FightTheLandlordApplication.getFL().getBoard().setCurrentCardTpye(str1);
			return true;
		}
		System.out.println("illegal input!");
		return false;		
	}
	
	public static boolean checkIllegalName(String cardsType) {
		String str = cardsType;
		if(legalNameSingleCards(str)) return true;
		if(legalNameDoubleCards(str)) return true;
		if(legalNameThreeCards(str)) return true;
		
		if(legalNameThreeDOne(str)) return true;
		if(legalNameThreeDTwo(str)) return true;
		
		if(legalNameStraightCards5(str)) return true;
		if(legalNameStraightCards6(str)) return true;
		if(legalNameStraightCards7(str)) return true;
		if(legalNameStraightCards8(str)) return true;
		if(legalNameStraightCards9(str)) return true;
		if(legalNameStraightCards10(str)) return true;
		if(legalNameStraightCards11(str)) return true;
		if(legalNameStraightCards12(str)) return true;
		
		if(legalNameFourBomb(str)) return true;
		if(legalNameFourDTwo(str)) return true;
		if(legalNameFourDTwoPair(str)) return true;
		
		if(legalNameKingBomb(str)) return true;
		
		if(legalNameDoubleStraight3(str)) return true;
		if(legalNameDoubleStraight4(str)) return true;
		if(legalNameDoubleStraight5(str)) return true;
		if(legalNameDoubleStraight6(str)) return true;
		if(legalNameDoubleStraight7(str)) return true;
		if(legalNameDoubleStraight8(str)) return true;
		if(legalNameDoubleStraight9(str)) return true;
		if(legalNameDoubleStraight10(str)) return true;
		
		if(legalNamePlaneAAABBB(str)) return true;
		if(legalNamePlaneAAABBBCCC(str)) return true;
		if(legalNamePlaneAAABBBCCCDDD(str)) return true;
		if(legalNamePlaneAAABBBCCCDDDEEE(str)) return true;
		if(legalNamePlaneAAABBBCCCDDDEEEFFF(str)) return true;
		if(legalNamePlaneAAA1BBB1(str)) return true;
		if(legalNamePlaneAAA1BBB1CCC1(str)) return true;
		if(legalNamePlaneAAA1BBB1CCC1DDD1(str)) return true;
		if(legalNamePlaneAAA1BBB1CCC1DDD1EEE1(str)) return true;
		if(legalNamePlaneAAA22BBB22(str)) return true;
		if(legalNamePlaneAAA22BBB22CCC22(str)) return true;
		if(legalNamePlaneAAA22BBB22CCC22DDD22(str)) return true;
		return false;
	}
	
	public static String tellIllegalName(String cardsType) {
		String str = cardsType;
		if(cardsType.equals("-1")) return cardsType;
		if(legalNameSingleCards(str)) return "single";
		if(legalNameDoubleCards(str)) return "double";
		if(legalNameThreeCards(str)) return "triple";
		
		if(legalNameThreeDOne(str)) return "threeDOne";
		if(legalNameThreeDTwo(str)) return "threeDTwo";
		
		if(legalNameStraightCards5(str)) return "StraightCards5";
		if(legalNameStraightCards6(str)) return "StraightCards6";
		if(legalNameStraightCards7(str)) return "StraightCards7";
		if(legalNameStraightCards8(str)) return "StraightCards8";
		if(legalNameStraightCards9(str)) return "StraightCards9";
		if(legalNameStraightCards10(str)) return "StraightCards10";
		if(legalNameStraightCards11(str)) return "StraightCards11";
		if(legalNameStraightCards12(str)) return "StraightCards12";
		
		if(legalNameFourBomb(str)) return "FourBomb";
		if(legalNameFourDTwo(str)) return "FourDTwo";
		if(legalNameFourDTwoPair(str)) return "FourDTwoPair";
		
		if(legalNameKingBomb(str)) return "KingBomb";
		
		if(legalNameDoubleStraight3(str)) return "DoubleStraight3";
		if(legalNameDoubleStraight4(str)) return "DoubleStraight4";
		if(legalNameDoubleStraight5(str)) return "DoubleStraight5";
		if(legalNameDoubleStraight6(str)) return "DoubleStraight6";
		if(legalNameDoubleStraight7(str)) return "DoubleStraight7";
		if(legalNameDoubleStraight8(str)) return "DoubleStraight8";
		if(legalNameDoubleStraight9(str)) return "DoubleStraight9";
		if(legalNameDoubleStraight10(str)) return "DoubleStraight10";
		
		if(legalNamePlaneAAABBB(str)) return "PlaneAAABBB";
		if(legalNamePlaneAAABBBCCC(str)) return "PlaneAAABBBCCC";
		if(legalNamePlaneAAABBBCCCDDD(str)) return "PlaneAAABBBCCCDDD";
		if(legalNamePlaneAAABBBCCCDDDEEE(str)) return "PlaneAAABBBCCCDDDEEE";
		if(legalNamePlaneAAABBBCCCDDDEEEFFF(str)) return "PlaneAAABBBCCCDDDEEEFFF";
		if(legalNamePlaneAAA1BBB1(str)) return "PlaneAAA1BBB1";
		if(legalNamePlaneAAA1BBB1CCC1(str)) return "PlaneAAA1BBB1CCC1";
		if(legalNamePlaneAAA1BBB1CCC1DDD1(str)) return "PlaneAAA1BBB1CCC1DDD1";
		if(legalNamePlaneAAA1BBB1CCC1DDD1EEE1(str)) return "PlaneAAA1BBB1CCC1DDD1EEE1";
		if(legalNamePlaneAAA22BBB22(str)) return "PlaneAAA22BBB22";
		if(legalNamePlaneAAA22BBB22CCC22(str)) return "PlaneAAA22BBB22CCC22";
		if(legalNamePlaneAAA22BBB22CCC22DDD22(str)) return "PlaneAAA22BBB22CCC22DDD22";
		return "0";
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
		//legal=(legalNameSingleCards(str));// yuelin changed
		if(legal) legal = checkPlayHasCardsInHand(temp,str);
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
		
		//legal=legalNameDoubleCards(str);
		if(legal) legal = checkPlayHasCardsInHand(temp,str);
		if(!legal) return "0";
		
		removeDoubleCardsRandomly(player,str.charAt(0));
		
		
		return str;	
	}
	
	public static String ThreeCard(Player player, String str) {
		
		//Task3-1: add here
		boolean legal=true;
		List<Card> temp=player.getHand();
		
		legal=legalNameThreeCards(str);
		if(legal) legal = checkPlayHasCardsInHand(temp,str);
		if(!legal) return "0";
		
		removeDoubleCardsRandomly(player,str.charAt(0));
		
		
		return str;	
	}
	/**
	 * Feature:Straight
	 * This method plays a straight card from a selected player. If the operation is 
	 * legal(inputs are legal straight cards and cards are actually hold by the player),
	 * the cards will be removed from player and appear on the board.
	 * @author Yuelin Liu
	 * @param player: selected player
	 * @param str: specific straight cards in String
	 * @return the staright cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	public static String StraightCard(Player player, String str) {
		
		
		//Task4-1: add here
		
		boolean legal = true;
		List<Card> temp = player.getHand();
		
		//legal = legalNameStraightCards(str);
		if(legal) legal = checkPlayHasCardsInHand(temp,str);
		if(!legal) return "0";
		
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		
		
		return str;	
	}


	/**
	 * Feature: ThreeDOne
	 * This method plays a straight card from a selected player. If the operation is 
	 * legal(inputs are legal straight cards and cards are actually hold by the player),
	 * the cards will be removed from player and appear on the board.
	 * @author Zicheng Chang
	 * @param player: selected player
	 * @param str: specific straight cards in String
	 * @return the staright cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	public static String ThreeDOne(Player player, String str) {
		
		
		//Task4-1: add here
		
		boolean legal = true;
		List<Card> temp = player.getHand();
	
		//legal = legalNameThreeDOne(str);
		if(legal)legal = checkPlayHasCardsInHand(temp,str);
		if(!legal) return "0";
		
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		
		return str;	
	}

	/**
	 * Feature: ThreeDTwo
	 * This method plays a straight card from a selected player. If the operation is 
	 * legal(inputs are legal straight cards and cards are actually hold by the player),
	 * the cards will be removed from player and appear on the board.
	 * @author Zicheng Chang
	 * @param player: selected player
	 * @param str: specific straight cards in String
	 * @return the staright cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	public static String ThreeDTwo(Player player, String str) {
		
		
		//Task4-1: add here
		
		boolean legal = true;
		List<Card> temp = player.getHand();
	
		//legal = legalNameThreeDTwo(str);
		if(legal)legal = checkPlayHasCardsInHand(temp,str);
		if(!legal) return "0";
		
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		
		return str;	
	}

	/**
	 *
	 * @author Yuelin Liu
	 * @param str
	 * @return legal string
	 */
	
	public static String FourBomb(Player player, String str){
		boolean legal = true;
		List<Card> temp = player.getHand();
	
		//legal = legalNameFourBomb(str);
		if(legal)legal = checkPlayHasCardsInHand(temp,str);
	
		if(!legal) return "0";
	
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	


	/**
	 *
	 * @author Lide
	 * @param str
	 * @return legal string
	 */
	
	public static String FourDTwoS(Player player, String str){
		boolean legal = true;
		List<Card> temp = player.getHand();
	
		//legal = legalNameFourDTwo(str);
		if(legal)legal = checkPlayHasCardsInHand(temp,str);
	
		if(!legal) return "0";
	
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	
	
	/**
	 * Feature: FourDTwoPair
	 * @author Yuelin Liu
	 * @param str: 
	 * @return the staright cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	public static String FourDTwoPair(Player player, String str){
		boolean legal = true;
		List<Card> temp = player.getHand();
	
		//legal = legalNameFourDTwoPair(str);
		if(legal)legal = checkPlayHasCardsInHand(temp,str);
	
		if(!legal) return "0";
	
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
	
		return str;
	
	}
	
	
	/**
	 * Feature:KingBomb
	 * @author Yuelin Liu
	 * @param str: 
	 * @return the corresponding cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	public static String KingBomb(Player player, String str){
		
		boolean legal = true;
		List<Card> temp = player.getHand();
	
		//legal = legalNameKingBomb(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);
	
		if(!legal) return "0";
	
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
	
		return str;
	}
	
	/**
	 * Feature:Plane
	 * @author Yuelin Liu
	 * @param str: 
	 * @return the corresponding cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	
	public static String PlaneAAA1BBB1CCC1DDD1EEE1(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA1BBB1CCC1DDD1EEE1(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAA1BBB1CCC1DDD1(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA1BBB1CCC1DDD1(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAA1BBB1CCC1(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA1BBB1CCC1(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAA1BBB1(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA1BBB1(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAA22BBB22CCC22DDD22(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA22BBB22CCC22DDD22(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAA22BBB22CCC22(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA22BBB22CCC22(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAA22BBB22(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAA22BBB22(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAABBB(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAABBB(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAABBBCCC(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAABBBCCC(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAABBBCCCDDD(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAABBBCCCDDD(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAABBBCCCDDDEEE(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAABBBCCCDDDEEE(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String PlaneAAABBBCCCDDDEEEFFF(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNamePlaneAAABBBCCCDDDEEEFFF(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	
	
	/**
	 * Feature:DoubleStraight
	 * @author Yuelin Liu
	 * @param str: 
	 * @return the corresponding cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	public static String DoubleStraight3(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight3(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight4(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight4(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight5(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight5(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight6(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight6(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight7(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight7(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight8(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight8(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight9(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight9(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	public static String DoubleStraight10(Player player, String str) {
		boolean legal = true;
		List<Card> temp = player.getHand();
		//legal = legalNameDoubleStraight10(str);
		if(legal)	legal = checkPlayHasCardsInHand(temp,str);		
		if(!legal) return "0";
		for(int i=0; i<str.length(); i++) {
			removeSingleCardRandomly(player, str.charAt(i));
		}
		return str;
	}
	
	
	private static boolean legalNamePlaneAAABBB(String str) {
		if(str.length() != 6) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 3; i=i+3) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(3));

		if(t1+1!=t2)return false;
;
		return true;
	}


	private static boolean legalNamePlaneAAABBBCCC(String str) {
		if(str.length() != 9) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 6; i=i+3) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(3));
		int t3  = convertCharToInt(str.charAt(6));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3>=15) return false;
		return true;
	}


	private static boolean legalNamePlaneAAABBBCCCDDD(String str) {
		if(str.length() != 12) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 9; i=i+3) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(3));
		int t3  = convertCharToInt(str.charAt(6));
		int t4  = convertCharToInt(str.charAt(9));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3+1!=t4)return false;
		if(t4>=15) return false;
		return true;
	}


	private static boolean legalNamePlaneAAABBBCCCDDDEEE(String str) {
		if(str.length() != 15) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 12; i=i+3) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(3));
		int t3  = convertCharToInt(str.charAt(6));
		int t4  = convertCharToInt(str.charAt(9));
		int t5  = convertCharToInt(str.charAt(12));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3+1!=t4)return false;
		if(t4+1!=t5)return false;
		if(t5>=15) return false;
		return true;
	}


	private static boolean legalNamePlaneAAABBBCCCDDDEEEFFF(String str) {
		if(str.length() != 18) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 15; i=i+3) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(3));
		int t3  = convertCharToInt(str.charAt(6));
		int t4  = convertCharToInt(str.charAt(9));
		int t5  = convertCharToInt(str.charAt(12));
		int t6  = convertCharToInt(str.charAt(15));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3+1!=t4)return false;
		if(t4+1!=t5)return false;
		if(t5+1!=t6)return false;
		if(t6>=15) return false;
		return true;
	}


	/**
	 * Feature:DoubleStraight
	 * @author Yuelin Liu
	 * @param str: 
	 * @return the corresponding cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	private static boolean legalNameDoubleStraight3(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 3);
	}
	private static boolean legalNameDoubleStraight4(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 4);
	}
	private static boolean legalNameDoubleStraight5(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 5);
	}
	private static boolean legalNameDoubleStraight6(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 6);
	}
	private static boolean legalNameDoubleStraight7(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 7);
	}
	private static boolean legalNameDoubleStraight8(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 8);
	}
	private static boolean legalNameDoubleStraight9(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 9);
	}
	private static boolean legalNameDoubleStraight10(String str) {
		// TODO Auto-generated method stub
		return legalNameDoubleStraight10(str, 10);
	}

	private static boolean legalNameDoubleStraight10(String str, int numberOfPairs) {
		if(str.length() != (numberOfPairs*2)) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= numberOfPairs*2-2; i=i+2) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			if(c1 != c2) {
				return false;
			}
		}
		int c0 = convertCharToInt(str.charAt(0));
		int c99 = convertCharToInt(str.charAt(str.length()-1));
		if(c0<3||c99>14) return false;
		
		for(int i = 0; i <= numberOfPairs*2-4; i=i+2) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+2));
			if(c1+1 != c2) {
				return false;
			}
		}
		return true;
	}


	/**
	 * This method only see following example as legal input:
	 * "3331", "TTT2","JJJQ" etc.
	 * The "Three" part should always be at head of your input. 
	 * @author Zichen Chang
	 * @param  legal name for ThreeD
	 * @exception 
	 * 
	 */
	private static boolean legalNameThreeDOne(String str) {
		// first check the length
		if(str.length() != 4) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		// check input str doesn't include any illegal card
		for(int i = 0; i <= 3; i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		// then check first three char is same
		for(int i = 0; i <= 1; i++) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			if(c1 != c2) {
				return false;
			}
		}
		int c1 = convertCharToInt(str.charAt(1));
		int c3 = convertCharToInt(str.charAt(3));
		if(c1==c3) return false;
		return true;
	}


	/**
	 * This method only see following example as legal input:
	 * "333AA", "TTT2","JJJQ" etc.
	 * The "Three" part should always be at head of your input. 
	 * @author Yuelin Liu
	 * @param  legal name for ThreeD
	 * @exception 
	 * 
	 */
	private static boolean legalNameThreeDTwo(String str) {
		// TODO Auto-generated method stub
		if(str.length() != 5) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		// check input str doesn't include any illegal card
		for(int i = 0; i <= 3; i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		// then check first three char is same
		for(int i = 0; i <= 1; i++) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			if(c1 != c2) {
				return false;
			}
		}
		int c3 = convertCharToInt(str.charAt(3));
		int c4 = convertCharToInt(str.charAt(4));
		if(c3!=c4) return false;
		return true;
	}


	private static boolean legalNamePlaneAAA22BBB22CCC22DDD22(String str) {
		if(str.length() != 20) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 15; i=i+5) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			//int c5 = convertCharToInt(str.charAt(i+4));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(5));
		int t3  = convertCharToInt(str.charAt(10));
		int t4  = convertCharToInt(str.charAt(15));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3+1!=t4)return false;
		if(t4>=15) return false;
		return true;
	}


	private static boolean legalNamePlaneAAA22BBB22CCC22(String str) {
		if(str.length() != 15) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 10; i=i+5) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			//int c5 = convertCharToInt(str.charAt(i+4));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(5));
		int t3  = convertCharToInt(str.charAt(10));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3>=15) return false;
		return true;
	}

	
	private static boolean legalNamePlaneAAA22BBB22(String str) {
		if(str.length() != 10) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 5; i=i+5) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			//int c5 = convertCharToInt(str.charAt(i+4));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(5));
		if(t1+1!=t2)return false;
		if(t2>=15) return false;
		return true;
	}

	private static boolean legalNamePlaneAAA1BBB1CCC1DDD1(String str) {
		if(str.length() != 16) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 12; i=i+4) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(4));
		int t3  = convertCharToInt(str.charAt(8));
		int t4  = convertCharToInt(str.charAt(12));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3+1!=t4)return false;
		if(t4>=15) return false;
		return true;
	}


	private static boolean legalNamePlaneAAA1BBB1CCC1(String str) {
		if(str.length() != 12) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 8; i=i+4) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(4));
		int t3  = convertCharToInt(str.charAt(8));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3>=15) return false;
		return true;
	}
	
	private static boolean legalNamePlaneAAA1BBB1(String str) {
		if(str.length() != 8) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 4; i=i+4) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(4));
		if(t1+1!=t2)return false;
		if(t2>=15) return false;
		return true;
	}


	private static boolean legalNamePlaneAAA1BBB1CCC1DDD1EEE1(String str) {
		if(str.length() != 20) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		for(int i = 0; i <= 16; i=i+4) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			//int c4 = convertCharToInt(str.charAt(i+3));
			if(c1!=c2 || c2!=c3 ) return false;
		}
		int t1  = convertCharToInt(str.charAt(0));
		int t2  = convertCharToInt(str.charAt(4));
		int t3  = convertCharToInt(str.charAt(8));
		int t4  = convertCharToInt(str.charAt(12));
		int t5  = convertCharToInt(str.charAt(16));
		if(t1+1!=t2)return false;
		if(t2+1!=t3)return false;
		if(t3+1!=t4)return false;
		if(t4+1!=t5)return false;
		if(t5>=15) return false;
		return true;
	}


	/**
	 * Feature: FourBomb
	 * @author Yuelin Liu
	 * @param str: "3333"
	 * @return the Bomb cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	private static boolean legalNameFourBomb(String str) {
		// TODO Auto-generated method stub
		if(str.length() !=4) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		// check input str doesn't include any illegal card
		for(int i = 0; i <= 3; i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		int c0 = convertCharToInt(str.charAt(0));
		int c1 = convertCharToInt(str.charAt(1));
		int c2 = convertCharToInt(str.charAt(2));
		int c3 = convertCharToInt(str.charAt(3));
		if(c0 != c1 || c1 != c2 || c2 != c3 ) {
				return false;
		}		
		return true;
	}

	
	private static boolean legalNameSingleCards(String str) {
		// TODO Auto-generated method stub
		if(str.length() !=1) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		int c0 = convertCharToInt(str.charAt(0));
		if(c0<3 || c0>17) return false;
		return true;
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


	private static boolean legalNameThreeCards(String str) {
		boolean legal = true;
		if(str.length()==3) {
			int value = convertCharToInt(str.charAt(0));
			if( (value<3)  || (value>15) ) {
				legal = false;
			}
			int value1 = convertCharToInt(str.charAt(0));
			int value2 = convertCharToInt(str.charAt(1));
			int value3 = convertCharToInt(str.charAt(2));
			if(value1 !=value2 || value2!=value3) {
				legal = false;
			}
		}
		else {
			legal = false;
		}
		return legal;
	}


	/**
	 * Feature: FourDTwoPair
	 * @author Yuelin Liu
	 * @param str: "33338899"
	 * @return the corresponding cards in String if successful, otherwise "0"
	 * @exception 
	 * 
	 */
	private static boolean legalNameFourDTwoPair(String str) {
		// TODO Auto-generated method stub
		if(str.length() != 8) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		// check input str doesn't include any illegal card
		for(int i = 0; i <= 7; i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		// then check first four char is same
		for(int i = 0; i <= 1; i++) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			if(c1 != c2 || c3 != c2) {
				return false;
			}
		}
		int c0 = convertCharToInt(str.charAt(0));
		int c4 = convertCharToInt(str.charAt(4));
		int c5 = convertCharToInt(str.charAt(5));
		int c6 = convertCharToInt(str.charAt(6));
		int c7 = convertCharToInt(str.charAt(7));
		if(c4==c0) return false;
		if(c6==c0) return false;
		if(c4!=c5) return false;
		if(c6!=c7) return false;
		return true;
	}


	/**
	 * check if it is a legal sequence:
	 * "KKKK34","333379"
	 * @param str the user input combo
	 * @return if the selected cards are legal
	 */
	private static boolean legalNameFourDTwo(String str) {
		// first check the length
		if(str.length() != 6) {
			//System.out.println("Illegal input size, try again");
			return false;
		}
		// check input str doesn't include any illegal card
		for(int i = 0; i <= 5; i++) {
			int value = convertCharToInt(str.charAt(i));
			if(value == 0) {
				return false;
			}
		}
		// then check first four char is same
		for(int i = 0; i <= 1; i++) {
			int c1 = convertCharToInt(str.charAt(i));
			int c2 = convertCharToInt(str.charAt(i+1));
			int c3 = convertCharToInt(str.charAt(i+2));
			if(c1 != c2 || c3 != c2) {
				return false;
			}
		}
		return true;
	}


	/**
	 * 
	 * @author Yuelin Liu
	 * @param  legal name for straight cards
	 * @exception 
	 * 
	 */
	private static boolean legalNameStraightCards5(String str) {
		boolean legal = true;
		if(str.length()==5) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards6(String str) {
		boolean legal = true;
		if(str.length()==6) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards7(String str) {
		boolean legal = true;
		if(str.length()==7) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards8(String str) {
		boolean legal = true;
		if(str.length()==8) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards9(String str) {
		boolean legal = true;
		if(str.length()==9) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards10(String str) {
		boolean legal = true;
		if(str.length()==10) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards11(String str) {
		boolean legal = true;
		if(str.length()==11) {
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
		}else {
			legal=false;
		}
		return legal;
	}
	private static boolean legalNameStraightCards12(String str) {
		boolean legal = true;
		if(str.length()==12) {
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
		}else {
			legal=false;
		}
		return legal;
	}
//	private static boolean legalNameStraightCards(String str) {
//		boolean legal = true;
//		if(str.length()==5) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>10) ) {
//				legal = false;
//			}
//			for(int i=0;i<=3;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==6) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>9) ) {
//				legal = false;
//			}
//			for(int i=0;i<=4;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==7) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>8) ) {
//				legal = false;
//			}
//			for(int i=0;i<=5;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==8) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>7) ) {
//				legal = false;
//			}
//			for(int i=0;i<=6;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==9) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>6) ) {
//				legal = false;
//			}
//			for(int i=0;i<=7;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==10) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>5) ) {
//				legal = false;
//			}
//			for(int i=0;i<=8;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==11) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>4) ) {
//				legal = false;
//			}
//			for(int i=0;i<=9;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else if(str.length()==12) {
//			int asciiS = (int)str.charAt(0);
//			int value = convertCharToInt(str.charAt(0));
//			if( (value<3)  || (value>3) ) {
//				legal = false;
//			}
//			for(int i=0;i<=10;i++) {
//				int value1 = convertCharToInt(str.charAt(i));
//				int value2 = convertCharToInt(str.charAt(i+1));
//				if(value1+1 !=value2 ) {
//					legal = false;//check whether it is in sequence(increasing order)
//				}
//			}
//		}
//		else {
//			legal = false;
//		}
//		return legal;
//	}
	
	private static boolean legalNameKingBomb(String str) {
		if(str.equals("Ww") || str.equals("wW")) return true;
		return false;
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
	 * @explanation: int[14]==2 means you have 2 Aces.
	 * @exception 
	 * 
	 */
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
	/**
	 * 
	 * @author Yuelin Liu
	 * @explanation:  ArrayList a = 3 3 3 4 6 7 8 13 14 17; a[4]==6;
	 * @exception 
	 * 
	 */
	public static ArrayList convertCardsIntoArrayList(List<Card> temp) {
		ArrayList result = new ArrayList();
		int a[] = convertCardsIntoArray(temp);
		for(int i=3; i<=17; i++) {
			while (a[i]!=0) {
				result.add(i);
				a[i]--;
			}
			
		}
		return result;
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
	public static int convertCharToInt(char chr) {
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
		// if input has something else other than legal handcard, return 0;
		return 0;		
	}
	public static char convertIntToChar(int n) {
		//int a = (int)chr;
		if (n==3) return '3';
		if (n==4) return '4';
		if (n==5) return '5';
		if (n==6) return '6';
		if (n==7) return '7';
		if (n==8) return '8';
		if (n==9) return '9';
		if (n==10) return 'T';
		if (n==11) return 'J';
		if (n==12) return 'Q';
		if (n==13) return 'K';
		if (n==14) return 'A';
		if (n==15) return '2';
		if (n==16) return 'w';
		if (n==17) return 'W';
		// if input has something else other than legal handcard, return 0;
		return '0';		
	}
	public static String convertIntToString(int n) {
		//int a = (int)chr;
		if (n==3) return "3";
		if (n==4) return "4";
		if (n==5) return "5";
		if (n==6) return "6";
		if (n==7) return "7";
		if (n==8) return "8";
		if (n==9) return "9";
		if (n==10) return "T";
		if (n==11) return "J";
		if (n==12) return "Q";
		if (n==13) return "K";
		if (n==14) return "A";
		if (n==15) return "2";
		if (n==16) return "w";
		if (n==17) return "W";
		// if input has something else other than legal handcard, return 0;
		return "0";		
	}
	public static int[] convertArrayListToCardArray(ArrayList<Integer> a){
		int[] result = new int[18];
		for(int i=0; i<a.size(); i++) {
			result[a.get(i)]++;
		}
		return result;
		
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
	 * @explain  assign the cards to two players
	 * @exception 
	 * 
	 */
	public static void assignCardTest3() {
		
		FL fl = FightTheLandlordApplication.getFL();
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		Player p2 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(1);
		
		for(int i=1; i<=54; i++) {
			p1.addHand(Card.getWithId(i) );
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
