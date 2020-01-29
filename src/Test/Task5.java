package Test;
import Application.FightTheLandlordApplication;
import Controller.Controller;
import Model.Card;
import Model.Player;
public class Task5 {

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
		
		String t0 = Controller.singleCard(p1, "5556");
		String t1 = Controller.singleCard(p1, "3343");
		String t2 = Controller.singleCard(p1, "3322");
		String t3 = Controller.singleCard(p1, "g2");
		String t4 = Controller.singleCard(p1, "wwwa");
		String t5 = t1+t2+t3+t4+t0;
		if(!t5.equals("00000")) {
			pass = false;
			System.out.println("Fail--2");
		}
		
		
		Controller.removeAllCardsForPlayer(p1);
		Controller.assignCardTest2();
		
		
		String t6 = Controller.singleCard(p1, "T");
		if(!t6.equals("T")) {
			pass = false;
			System.out.println("Fail--3");
		}
		String t7 = Controller.singleCard(p1, "2");
		if(!t7.equals("2")) {
			pass = false;
			System.out.println("Fail--4");
		}
		Controller.singleCard(p1, "4");
		Controller.singleCard(p1, "4");
		
		String t8 = Controller.singleCard(p1, "44");
		String t9 = Controller.singleCard(p1, "4");
		if(!(t8+t9).equals("00")) {
			pass = false;
			System.out.println("Fail--5");
		}
		
		String t10 = Controller.singleCard(p1, "j");
		String t11 = Controller.singleCard(p1, "q");
		if(!(t10+t11).equals("jq")) {
			pass = false;
			System.out.println("Fail--6");
		}
		
		p1.addHand(Card.getWithId(54));
		String t12 =  Controller.singleCard(p1, "w");
		String t13 =  Controller.singleCard(p1, "W");
		String t14 =  Controller.singleCard(p1, "W");
		String t15 = t12+t13+t14;
		if(!t15.equals("wW0")) {
			pass = false;
			System.out.println("Fail--7");
		}
		
		
		
		//Task4-2:add here
		
		System.out.println(pass?"Congratulations! You passed!" : "No! there is still some bug!");
	}
	
}
