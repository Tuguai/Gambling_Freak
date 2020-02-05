package Test;
import java.util.ArrayList;
import java.util.List;

import Application.FightTheLandlordApplication;
import Model.*;
import Controller.*;
public class AlgorithmTest2 {
	private static String checkWin(ArrayList a, ArrayList b, String standardType) {
		if(a.size()==0) {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		boolean aHasBigger = false;
		//Check standardType is illegal input
		Controller2.checkHasBigger(a,standardType);
		
		
		
		return null;
		
	}
	
	public static void main(String args[]) {
		FL currentFL = FightTheLandlordApplication.getFL();
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		Player p2 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(1);
		
		List<Card> cardsA = p1.getHand();
		List<Card> cardsB = p2.getHand();
		ArrayList a = Controller.convertCardsIntoArrayList(cardsA);
		ArrayList b = Controller.convertCardsIntoArrayList(cardsB);
		Controller.checkIllegalName("2383");
	}

}
