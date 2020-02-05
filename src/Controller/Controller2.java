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
	 * If standardType is "999A" and your arrayList is 3,4,5,12,14,14, so you do not have bigger card, return false!
	 * If standardType is "777746" and your arrayList is 3,4,5,5,5,5,12,14,14, so you have bigger card("555534"), return true!
	 */
	public static boolean checkHasBigger(ArrayList a, String standardType) {
		if(standardType.equalsIgnoreCase("single")) {
			
		}
		else if(standardType.equalsIgnoreCase("double")) {
					
		}
		else if(standardType.equalsIgnoreCase("triple")) {
			
		}
		else if(standardType.equalsIgnoreCase("threeDOne")) {
			
		}
		else if(standardType.equalsIgnoreCase("threeDTwo")) {
					
		}
		else if(standardType.equalsIgnoreCase("StraightCards5")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards6")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards7")) {
					
		}
		else if(standardType.equalsIgnoreCase("StraightCards8")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards9")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards10")) {
					
		}
		else if(standardType.equalsIgnoreCase("StraightCards11")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards12")) {
			
		}
		else if(standardType.equalsIgnoreCase("FourBomb")) {
					
		}
		else if(standardType.equalsIgnoreCase("FourDTwo")) {
			
		}
		else if(standardType.equalsIgnoreCase("FourDTwoPair")) {
			
		}
		else if(standardType.equalsIgnoreCase("KingBomb")) {
					
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight3")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight4")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight5")) {
					
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight6")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight7")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight8")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight9")) {
					
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight10")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBB")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCC")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCCDDD")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEE")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEEFFF")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1CCC1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1EEE1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA22BBB22")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA22BBB22CCC22")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA22BBB22CCC22DDD22")) {
			
		}
		else {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
	}
	
	
	
	/**
	 *
	 * For example 
	 * If standardType is "tt" and your arrayList is 3,4,5,12,12,14,14,16, 
	 * There are two options you can play "jj" and "aa", so you have to return String{"jj","aa"}.
	 * 
	 * If standardType is "34567" and your arrayList is 4,5,6,7,8,9,10,12,12,14,14,16, 
	 * There are 3 options you can play "45678","56789" and "6789t", so you have to return String{"45678","56789", "6789t"}.
	 */
	private static ArrayList<String> biggerOptions(ArrayList a, String standardType) {
		ArrayList<String> result = new ArrayList<String>();
		if(standardType.equalsIgnoreCase("single")) {
			
		}
		else if(standardType.equalsIgnoreCase("double")) {
					
		}
		else if(standardType.equalsIgnoreCase("triple")) {
			
		}
		else if(standardType.equalsIgnoreCase("threeDOne")) {
			
		}
		else if(standardType.equalsIgnoreCase("threeDTwo")) {
					
		}
		else if(standardType.equalsIgnoreCase("StraightCards5")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards6")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards7")) {
					
		}
		else if(standardType.equalsIgnoreCase("StraightCards8")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards9")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards10")) {
					
		}
		else if(standardType.equalsIgnoreCase("StraightCards11")) {
			
		}
		else if(standardType.equalsIgnoreCase("StraightCards12")) {
			
		}
		else if(standardType.equalsIgnoreCase("FourBomb")) {
					
		}
		else if(standardType.equalsIgnoreCase("FourDTwo")) {
			
		}
		else if(standardType.equalsIgnoreCase("FourDTwoPair")) {
			
		}
		else if(standardType.equalsIgnoreCase("KingBomb")) {
					
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight3")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight4")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight5")) {
					
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight6")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight7")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight8")) {
			
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight9")) {
					
		}
		else if(standardType.equalsIgnoreCase("DoubleStraight10")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBB")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCC")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCCDDD")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEE")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEEFFF")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1CCC1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1EEE1")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA22BBB22")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA22BBB22CCC22")) {
			
		}
		else if(standardType.equalsIgnoreCase("PlaneAAA22BBB22CCC22DDD22")) {
			
		}
		else {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
	}

}
