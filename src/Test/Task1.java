package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.Board;
public class Task1 {
	public static void main(String args[]) {

		Controller.initailizeGame();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		
		//Task3-2:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}
	

}
