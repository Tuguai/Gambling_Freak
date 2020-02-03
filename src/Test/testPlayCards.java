package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.*;
public class testPlayCards {

public static void main(String args[]) {
		
		Controller.initailizeGame();
		Controller.assignCardTest3();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		FL currentFL = FightTheLandlordApplication.getFL();
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);

		boolean s2 = Controller.playCards(p1, "");
		//Controller.playCards(p1, "7");
		//Task3-2:add here
		if(!s2) pass = false;
		System.out.println(currentFL.getBoard().getCurrentCardTpye());
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
			
	}
}
