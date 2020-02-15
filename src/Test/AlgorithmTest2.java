package Test;
import java.util.ArrayList;
import java.util.List;

import Application.FightTheLandlordApplication;
import Model.*;
import Controller.*;
public class AlgorithmTest2 {
	
	private static String checkWin(ArrayList<Integer> a, ArrayList<Integer> b, String standard) {
		if(a.size()==0) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		boolean aHasBigger = false;
		//Check standardType is illegal input
		aHasBigger = Controller2.checkHasBigger(a,Controller.tellIllegalName(standard),standard);
		if(!aHasBigger) {
			String result = checkWin(b, a, "-1");
			if(result.equals("0")) return "pass";//999 means array a should pass in this turn.
		}
		ArrayList<String> possibilities = Controller2.biggerOptions(a, Controller.tellIllegalName(standard),standard);
		if(possibilities.size()==1) {
			if(a.size()==possibilities.get(0).length())
			return possibilities.get(0);
		}
		for(int i=0; i<possibilities.size(); i++) {
			ArrayList<Integer> ARmv = removeCard(a, possibilities.get(i));
			
			String result1 = checkWin(ARmv, b, "-1");//b pass
			String result2 = checkWin(b, ARmv, possibilities.get(i));//b don't pass and b plays a bigger card
			if(result2.equals("0") && !result1.equals("0")) return possibilities.get(i);
		}
		return "0";
		
	}
	private static ArrayList<Integer> removeCard(ArrayList<Integer> oldHand, String cards){
		ArrayList<Integer> newHand = oldHand;
		for(int i=0; i<cards.length(); i++) {
			int temp = Controller.convertCharToInt(cards.charAt(i));
			newHand.remove(temp);
		}
		return newHand;
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> human = new ArrayList<Integer>();
		ArrayList<Integer> computer = new ArrayList<Integer>();
		human.add(3);
		human.add(3);
		human.add(8);
		human.add(10);
		computer.add(4);
		computer.add(5);
		computer.add(6);
		long t1 = System.currentTimeMillis();
		String answer = checkWin(human,computer,"-1");
		long t2 = System.currentTimeMillis();
		System.out.println("You should play: "+answer);
		System.out.print("Time: "+(t2-t1));
		
		
		
		
		
//		FL currentFL = FightTheLandlordApplication.getFL();
//		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
//		Player p2 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(1);
//		
//		List<Card> cardsA = p1.getHand();
//		List<Card> cardsB = p2.getHand();
//		ArrayList a = Controller.convertCardsIntoArrayList(cardsA);
//		ArrayList b = Controller.convertCardsIntoArrayList(cardsB);
//		Controller.checkIllegalName("2383");
	}

}
