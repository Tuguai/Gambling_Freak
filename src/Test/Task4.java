package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.Player;
public class Task4 {

	public static void main(String args[]) {
	Controller.initailizeGame();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);
		String t1 = Controller.StraightCard(p1, "2345");
		String t2 = Controller.StraightCard(p1, "23456");
		String t3 = Controller.StraightCard(p1, "abcde");
		
		String t4 = t1+t2+t3;
		if(!t4.equals("000")) {
			pass = false;
			System.out.println(t4);
			System.out.println("Fail--2");
		}
		//Task3-3:add here
		
		
		
		
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}
}
