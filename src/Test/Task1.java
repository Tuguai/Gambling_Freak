package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.Board;
public class Task1 {
	public static void main(String args[]) {
		//Task3-2:add here
		Controller.initailizeGame();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
			
	}
	

}
