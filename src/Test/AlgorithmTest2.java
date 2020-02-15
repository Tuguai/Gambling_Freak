package Test;
import java.util.ArrayList;
import java.util.List;

import Application.FightTheLandlordApplication;
import Model.*;
import Controller.*;
public class AlgorithmTest2 {
	
	private static String checkWin(int[] a, int[] b, String standard) {
		if(a.length==0) {
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
//		if(possibilities.size()==1) {
//			if( aHasBigger )
//			return possibilities.get(0);
//		}
		for(int i=0; i<possibilities.size(); i++) {
			String t = possibilities.get(i);
			int sum = 0; for(int j=0; j<18; j++) sum=sum+a[j];
			if(t.length()==sum) return t;
			
			int[] ARmv = removeCard(a, t);

			String result1 = checkWin(ARmv, b, "-1");//b pass
			String result2 = checkWin(b, ARmv, possibilities.get(i));//b don't pass and b plays a bigger card
			if(result2.equals("0") && !result1.equals("0")) return possibilities.get(i);
		}
		return "0";
		
	}
	private static int[] removeCard(int[] oldHand, String cards){
		int[] newHand = oldHand.clone();
		for(int i=0; i<cards.length(); i++) {
			int temp = Controller.convertCharToInt(cards.charAt(i));
			newHand[temp]--;
			
		}
		return newHand;
	}
	
	public static void main(String args[]) {
		

//		int [] h = {3,3,5,5,5,6,10,10,11,15};
//		int [] c = {3,6,7,7,13,14,14,16};
		int [] h = {4,4,4,4,8};
		int [] c = {10,12};
		int[] human = new int[18];
		int[] computer = new int[18];
		for(int i=0; i<h.length; i++) {
			human[h[i]]++;
		}
		for(int i=0; i<c.length; i++) {
			computer[c[i]]++;
		}
		
		//Controller2.checkHasBigger(human, "double", "33");
		long t1 = System.currentTimeMillis();
		String answer = checkWin(human,computer,"9");
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
