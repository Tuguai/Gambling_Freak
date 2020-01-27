package Application;

import Model.*;

public class FightTheLandlordApplication {
	
	private static FL fl;
	
	
	
	
	public static FL getFL() {
		if (fl == null) {
			fl = new FL();
		}
 		return fl;
	}

}
