package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.*;
public class Task3 {
	
	public static void main(String args[]) {

		
		Controller.initailizeGame();
		Controller.assignCardTest1();
		boolean pass = true;
		if(FightTheLandlordApplication.getFL()==null) {
			pass = false;
			System.out.println("Fail--1");
		}
		Player p1 = FightTheLandlordApplication.getFL().getCurrentGame().getDealer(0);

		String t1 = Controller.DoubleCard(p1, "dad");
		String t2 = Controller.DoubleCard(p1, "34");
		String t3 = Controller.DoubleCard(p1, "JK");
		String t4 = Controller.DoubleCard(p1, "778");
		String t5 = t1+t2+t3+t4;
		if(!t5.equals("0000")) {
			pass = false;
			System.out.println("Fail--2");
		}
		
		String t6 = Controller.DoubleCard(p1, "TT");
		if(!t6.equals("TT")) {
			pass = false;
			System.out.println("Fail--3");
		}
		String t7 = Controller.DoubleCard(p1, "22");
		if(!t7.equals("22")) {
			pass = false;
			System.out.println("Fail--4");
		}
		Controller.DoubleCard(p1, "44");
		
		String t8 = Controller.DoubleCard(p1, "TT");
		String t9 = Controller.DoubleCard(p1, "44");
		if(!(t8+t9).equals("00")) {
			pass = false;
			System.out.println("Fail--5");
		}
		
		String t10 = Controller.DoubleCard(p1, "ww");
		String t11 = Controller.DoubleCard(p1, "WW");
		if(!(t10+t11).equals("00")) {
			pass = false;
			System.out.println("Fail--6");
		}
		

		Controller.StraightCard(p1, "34567");
		Controller.ThreeDOne(p1, "3331");

		//Task4-3:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}

}
