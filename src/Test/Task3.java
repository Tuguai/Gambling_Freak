package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.*;
public class Task3 {
	
	public static void main(String args[]) {

		
		Controller.initailizeGame();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		Controller.StraightCard(p1, "34567");
		//Task4-3:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}

}
