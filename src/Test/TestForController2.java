package Test;

import java.util.ArrayList;

import Controller.Controller;
import Controller.Controller2;
import Controller.Controller2.*;

public class TestForController2 {
	public static void main(String args[]) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(12);
		a.add(14);
		a.add(14);
		boolean resultA = Controller2.checkHasBigger(a, "threeDOne", "999A");
		System.out.println(resultA);
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(3);
		b.add(4);
		b.add(5);
		b.add(5);
		b.add(16);
		b.add(14);
		boolean resultB = Controller2.checkHasBigger(b, "PlaneAAABBBCCC", "777888999");
		System.out.println(resultB);
		
	}
}
