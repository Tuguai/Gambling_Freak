package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
public class Task3 {
	
	public static void main(String args[]) {

		
		Controller.initailizeGame();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		
		//Task4-3:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}

}
