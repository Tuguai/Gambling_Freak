package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.Player;
public class Task2 {

	public static void main(String args[]) {

		
		Controller.initailizeGame();
		Controller.assignCardTest1();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		Player p2 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(1);
		
		
		
		//Task4-2:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}
	
}
