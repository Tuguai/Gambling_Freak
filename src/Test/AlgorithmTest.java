package Test;

import java.util.ArrayList;
import java.util.List;

public class AlgorithmTest {

	private static int checkWin(int[] a, int[] b, int standard) {
		//array a and b have no null space
		//a first play
		//"4558J"--> int[0]==4, int[1]==5, int[2]==5, int[3]==8, int[4]==11 length==5
			
		if(a.length==0) {
			throw new IllegalArgumentException("IllegalArgumentException");
			//return 99999;//exception
		}
		boolean aHasBigger = false;
		for(int i=0; i<a.length; i++) {
			if(a[i]>standard)
				aHasBigger = true;	
		}
		if(!aHasBigger) {
			int result = checkWin(b, a, -1);
			if(result==0) return 999;//999 means array a should pass in this turn.
		}
		if(a.length==1 && a[0]>standard) {
			return a[0];
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]<=standard) continue;
			int[] ARmv = removeCard(a, a[i]);
			
			int result1 = checkWin(ARmv, b, -1);//b pass
			//if(result1!=0) return a[i];
			int result2 = checkWin(b, ARmv, a[i]);//b don't pass and b plays a bigger card
			if(result2==0 && result1!=0) return a[i];
			
		}	
		return 0;	
	}
	
	private static int[] removeCard(int[] oldHands, int card) {		
		int[] newHands = new int[oldHands.length-1];
		int j=0;
		for(int i=0; i<oldHands.length; i++) {
			if(oldHands[i]!=card) {
				newHands[j] = oldHands[i];
				j++;
			}	else {
				card = 99;//to avoid remove twice.
			}			
		}	
		return newHands;	
	}
	
	
	public static void main(String args[]) {
		
		int[] human = {3,5,5,5,7,7,9,8,9,9};
		int[] computer = {2,4,6,6,15};

	
		long t1 = System.currentTimeMillis();
		int answer = checkWin(human,computer,4);
		long t2 = System.currentTimeMillis();
		System.out.println("You should play: "+answer);
		System.out.print("Time: "+(t2-t1));
	}
}
