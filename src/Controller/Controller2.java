package Controller;

import java.util.ArrayList;

public class Controller2 {
	/**
	 * ArrayList a stands for your handCards(increasing order)
	 * For example
	 * a==3,4,5,12,14,14 means you have 3,4,5,Q,A,A in your hand
	 * 
	 * Your objective is to check whether you have bigger cards given a certain type.
	 * For example 
	 * If cardsType is "999A" and your arrayList is 3,4,5,12,14,14, so you do not have bigger card, return false!
	 * If cardsType is "777746" and your arrayList is 3,4,5,5,5,5,12,14,14, so you have bigger card("555534"), return true!
	 */
	public static boolean checkHasBigger(ArrayList a, String cardsType, String standard) {
		if(cardsType.equalsIgnoreCase("single")) {
			
		}
		else if(cardsType.equalsIgnoreCase("double")) {
					
		}
		else if(cardsType.equalsIgnoreCase("triple")) {
			
		}
		else if(cardsType.equalsIgnoreCase("threeDOne")) {
			
		}
		else if(cardsType.equalsIgnoreCase("threeDTwo")) {
					
		}
		else if(cardsType.equalsIgnoreCase("StraightCards5")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards6")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards7")) {
					
		}
		else if(cardsType.equalsIgnoreCase("StraightCards8")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards9")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards10")) {
					
		}
		else if(cardsType.equalsIgnoreCase("StraightCards11")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards12")) {
			
		}
		else if(cardsType.equalsIgnoreCase("FourBomb")) {
					
		}
		else if(cardsType.equalsIgnoreCase("FourDTwo")) {
			
		}
		else if(cardsType.equalsIgnoreCase("FourDTwoPair")) {
			
		}
		else if(cardsType.equalsIgnoreCase("KingBomb")) {
					
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight3")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight4")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight5")) {
					
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight6")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight7")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight8")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight9")) {
					
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight10")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBB")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCC")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDD")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEE")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEEFFF")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1EEE1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22CCC22")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22CCC22DDD22")) {
			
		}
		else {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
	}
	
	
	
	/**
	 *
	 * For example 
	 * If cardsType is "tt" and your arrayList is 3,4,5,12,12,14,14,16, 
	 * There are two options you can play "jj" and "aa", so you have to return String{"jj","aa"}.
	 * 
	 * If cardsType is "34567" and your arrayList is 4,5,6,7,8,9,10,12,12,14,14,16, 
	 * There are 3 options you can play "45678","56789" and "6789t", so you have to return String{"45678","56789", "6789t"}.
	 */
	private static ArrayList<String> biggerOptions(ArrayList a, String cardsType) {
		ArrayList<String> result = new ArrayList<String>();
		if(cardsType.equalsIgnoreCase("single")) {
			
		}
		else if(cardsType.equalsIgnoreCase("double")) {
					
		}
		else if(cardsType.equalsIgnoreCase("triple")) {
			
		}
		else if(cardsType.equalsIgnoreCase("threeDOne")) {
			
		}
		else if(cardsType.equalsIgnoreCase("threeDTwo")) {
					
		}
		else if(cardsType.equalsIgnoreCase("StraightCards5")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards6")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards7")) {
					
		}
		else if(cardsType.equalsIgnoreCase("StraightCards8")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards9")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards10")) {
					
		}
		else if(cardsType.equalsIgnoreCase("StraightCards11")) {
			
		}
		else if(cardsType.equalsIgnoreCase("StraightCards12")) {
			
		}
		else if(cardsType.equalsIgnoreCase("FourBomb")) {
					
		}
		else if(cardsType.equalsIgnoreCase("FourDTwo")) {
			
		}
		else if(cardsType.equalsIgnoreCase("FourDTwoPair")) {
			
		}
		else if(cardsType.equalsIgnoreCase("KingBomb")) {
					
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight3")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight4")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight5")) {
					
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight6")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight7")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight8")) {
			
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight9")) {
					
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight10")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBB")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCC")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDD")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEE")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEEFFF")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1EEE1")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22CCC22")) {
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22CCC22DDD22")) {
			
		}
		else {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
	}

}
