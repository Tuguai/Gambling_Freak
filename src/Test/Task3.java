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
		String t1 = Controller.singleCard(p1, "dad");
		String t2 = Controller.singleCard(p1, "34");
		String t3 = Controller.singleCard(p1, "JK");
		String t4 = Controller.singleCard(p1, "778");
		String t5 = t1+t2+t3+t4;
		if(!t5.equals("0000")) {
			pass = false;
			System.out.println("Fail--2");
		}
		
		String t6 = Controller.singleCard(p1, "TT");
		if(!t6.equals("TT")) {
			pass = false;
			System.out.println("Fail--3");
		}
		String t7 = Controller.singleCard(p1, "22");
		if(!t7.equals("22")) {
			pass = false;
			System.out.println("Fail--4");
		}
		Controller.singleCard(p1, "44");
		
		String t8 = Controller.singleCard(p1, "TT");
		String t9 = Controller.singleCard(p1, "44");
		if(!(t8+t9).equals("00")) {
			pass = false;
			System.out.println("Fail--5");
		}
		
		String t10 = Controller.singleCard(p1, "ww");
		String t11 = Controller.singleCard(p1, "WW");
		if(!(t10+t11).equals("00")) {
			pass = false;
			System.out.println("Fail--6");
		}
		
		//Task4-3:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}

}
