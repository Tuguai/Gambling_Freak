package Controller;

import java.util.ArrayList;
import Controller.*;

public class Controller2 {
	/**
	 * ArrayList a stands for your handCards(increasing order)
	 * For example
	 * a==3,4,5,12,14,14 means you have 3,4,5,Q,A,A in your hand
	 * 
	 * Your objective is to check whether you have bigger cards given a certain type.
	 * For example 
	 * If cardsType is "threeDOne" and standardType is "999A" and your arrayList is 3,4,5,12,14,14, so you do not have bigger card, return false!
	 * If cardsType is "fourDTwo" and standardType is "777746" and your arrayList is 3,4,5,5,5,5,12,14,14, so you have bigger card("5555"), return true!
	 * author Jianmo_Li
	 * want to use a new array<int> to store the number of each kind of card
	 */
	public static boolean checkHasBigger(int[] a, String cardsType, String standard) {
		if(standard.equals("-1")) return true;
		int[] count_array=a;
		int bomb=0;
//		for(int i=a.size()-1;i>=0;i--){
//			count_array[a.get(i)]+=1;
//			if(count_array[a.get(i)]==4) bomb=a.get(i);//construct the count _array and return the maximum bomb  at the same time
//		}
		for(int i=0; i<18; i++) {
			if(a[i]==4) bomb = i;//Bomb
		}
		if(count_array[16]==1&&count_array[17]==1){//represent the kingbomb 
			bomb=18;
		}
		
		if(cardsType.equalsIgnoreCase("single")) {
			if(bomb!=0) return true;
			for(int i=Controller.convertCharToInt(standard.charAt(0))+1;i<=17;i++) {
				if(count_array[i]>0) return true;
				//else return false;
			}
		}
		else if(cardsType.equalsIgnoreCase("double")) {
			if(bomb!=0) return true;
			for(int i=Controller.convertCharToInt(standard.charAt(0))+1;i<15;i++){
				if(!(count_array[i]<2)) return true;
				//else return false;
			}		
		}
		else if(cardsType.equalsIgnoreCase("triple")) {
			if(bomb!=0) return true;
			for(int i=Controller.convertCharToInt(standard.charAt(0))+1;i<15;i++){
				if(!(count_array[i]<3)) return true;
				//else return false;
			}		
		}
		else if(cardsType.equalsIgnoreCase("threeDOne")) {
			if(bomb!=0) return true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<15;i++){
				if(!(count_array[i]<3)) count_array[i]-=3;
				//else return false;
			}
			for(int j=3;j<18;j++){
				if(!(count_array[i]<1)) return true;
			}
			return false;
		}		
		else if(cardsType.equalsIgnoreCase("threeDTwo")) {
			if(bomb!=0) return true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<15;i++){
				if(!(count_array[i]<3)) count_array[i]-=3;
				//else return false;
			}
			for(int j=3;j<18;j++){
				if(!(count_array[i]<2)) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards5")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=10;i++){
				for(int j=i;j<i+5;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards6")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=9;i++){
				for(int j=i;j<i+6;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards7")) {
			if(bomb!=0) return true;	
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=8;i++){
				for(int j=i;j<i+7;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards8")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=7;i++){
				for(int j=i;j<i+8;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards9")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=6;i++){
				for(int j=i;j<i+9;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards10")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=5;i++){
				for(int j=i;j<i+10;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards11")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=4;i++){
				for(int j=i;j<i+11;j++){
					if(count_array[j]==0){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("StraightCards12")) {
			if(bomb!=0) return true;
			return false;
		}
		
		else if(cardsType.equalsIgnoreCase("DoubleStraight3")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=12;i++){
				for(int j=i;j<i+3;j++){
					if(count_array[j]<2){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight4")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=11;i++){
				for(int j=i;j<i+4;j++){
					if(count_array[j]<2){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight5")) {
			if(bomb!=0) return true;		
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=10;i++){
				for(int j=i;j<i+5;j++){
					if(count_array[j]<2){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight6")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=9;i++){
				for(int j=i;j<i+6;j++){
					if(count_array[j]<2){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight7")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=8;i++){
				for(int j=i;j<i+7;j++){
					if(count_array[j]<2){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight8")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=7;i++){
				for(int j=i;j<i+8;j++){
					if(count_array[j]<2){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBB")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=13;i++){
				for(int j=i;j<i+2;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCC")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=12;i++){
				for(int j=i;j<i+3;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
			
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDD")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=11;i++){
				for(int j=i;j<i+4;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEE")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=10;i++){
				for(int j=i;j<i+5;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag) return true;
			}
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=13;i++){
				for(int j=i;j<i+2;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag){
					for(int k=0;k<2;k++){
						count_array[i+k]-=3;
					}
					break;
				}
				
			}
			if(!flag) return false;
			
			int count=0;
			for(int k=0;k<2;k++) {
				for(int j=3;j<18;j++){
					if((count_array[j]>0)){
						count_array[j]-=1;
						count+=1;
					}
				}
			}
			if(count>1) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=12;i++){
				for(int j=i;j<i+3;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag){
					for(int k=0;k<2;k++){
						count_array[i+k]-=3;
					}
					break;
				}
				
			}
			if(!flag) return false;
			
			int count=0;
			for(int k=0;k<3;k++) {
				for(int j=3;j<18;j++){
					if((count_array[j]>0)){
						count_array[j]-=1;
						count+=1;
					}
				}
			}
			if(count>2) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=11;i++){
				for(int j=i;j<i+4;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag){
					for(int k=0;k<4;k++){
						count_array[i+k]-=3;
					}
					break;
				}
				
			}
			if(!flag) return false;
			
			int count=0;
			for(int k=0;k<4;k++) {
				for(int j=3;j<18;j++){
					if((count_array[j]>0)){
						count_array[j]-=1;
						count+=1;
					}
				}
			}
			if(count>3) return true;
			return false;
		}
		
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=13;i++){
				for(int j=i;j<i+2;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag){
					for(int k=0;k<2;k++){
						count_array[i+k]-=3;
					}
					break;
				}
				
			}
			if(!flag) return false;
			
			int count=0;
			for(int k=0;k<2;k++) {
				for(int j=3;j<18;j++){
					if((count_array[j]>1)){
						count_array[j]-=2;
						count+=1;
					}
				}
			}
			if(count>1) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22CCC22")) {
			if(bomb!=0) return true;
			boolean flag=true;
			int i=Controller.convertCharToInt(standard.charAt(0))+1;
			for(;i<=12;i++){
				for(int j=i;j<i+3;j++){
					if(count_array[j]<3){
						i=j+1;
						flag=false;
						break;
					}
				}
				if(flag){
					for(int k=0;k<2;k++){
						count_array[i+k]-=3;
					}
					break;
				}
				
			}
			if(!flag) return false;
			
			int count=0;
			for(int k=0;k<3;k++) {
				for(int j=3;j<18;j++){
					if((count_array[j]>1)){
						count_array[j]-=2;
						count+=1;
					}
				}
			}
			if(count>2) return true;
			return false;
		}
		
		else if(cardsType.equalsIgnoreCase("DoubleStraight9")) {
			if(bomb!=0) return true;	
			return false;
		}
		else if(cardsType.equalsIgnoreCase("DoubleStraight10")) {
			if(bomb!=0) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("FourDTwo")) {
			if(bomb!=0) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("FourDTwoPair")) {
			if(bomb!=0) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("FourBomb")) {
			int i=Controller.convertCharToInt(standard.charAt(0));
			if(bomb>i) return true;		
			return false;
		}
		else if(cardsType.equalsIgnoreCase("KingBomb")) {
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA22BBB22CCC22DDD22")) {
			if(bomb!=0) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAABBBCCCDDDEEEFFF")) {
			if(bomb!=0) return true;
			return false;
		}
		else if(cardsType.equalsIgnoreCase("PlaneAAA1BBB1CCC1DDD1EEE1")) {
			if(bomb!=0) return true;
			return false;
		}
		else {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		return false;
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
	public static ArrayList<String> biggerOptions(int[] a, String cardsType, String standard) {
		ArrayList<String> result = new ArrayList<String>();
		int stand0 = Controller.convertCharToInt(standard.charAt(0));
		if(!cardsType.equalsIgnoreCase("fourBomb") && !cardsType.equalsIgnoreCase("kingBomb")) {
			if(a[16]==1 && a[17]==1) result.add("wW");//KingBomb
			for(int i=0; i<18; i++) {
				if(a[i]==4) result.add(Controller.convertIntToString(i)+Controller.convertIntToString(i)+
						Controller.convertIntToString(i)+Controller.convertIntToString(i));//Bomb
			}
		}
		if(cardsType.equalsIgnoreCase("single")) {	
			for(int i=stand0; i<a.length; i++) {
				if(a[i]>0) {
					result.add(Controller.convertIntToString(i));
				}
			}
		}
		else if(cardsType.equalsIgnoreCase("double")) {
			for(int i=stand0; i<18; i++) {
				if(a[i]>=2) {
					result.add(Controller.convertIntToString(i)+
							Controller.convertIntToString(i));
				}
			}
		}
		else if(cardsType.equalsIgnoreCase("triple")) {
			for(int i=stand0; i<18; i++) {
				if(a[i]>=3) {
					result.add(Controller.convertIntToString(i)+
							Controller.convertIntToString(i)
					+Controller.convertIntToString(i));
				}
			}
		}
		else if(cardsType.equalsIgnoreCase("threeDOne")) {
			for(int i=stand0; i<18; i++) {
				if(a[i]>=3) {
					String three = Controller.convertIntToString(i)+
							Controller.convertIntToString(i)
					+Controller.convertIntToString(i);
					for(int j=3; j<18; j++) {
						if(j!=i && a[j]>0) {
							result.add(three+Controller.convertIntToString(j));
						}
					}
				}
			}
		}
		else if(cardsType.equalsIgnoreCase("threeDTwo")) {
			for(int i=stand0; i<18; i++) {
				if(a[i]>=3) {
					String three = Controller.convertIntToString(i)+
							Controller.convertIntToString(i)
					+Controller.convertIntToString(i);
					for(int j=3; j<18; j++) {
						if(j!=i && a[j]>=2) {
							result.add(three+Controller.convertIntToString(j)+Controller.convertIntToString(j));
						}
					}
				}
			}		
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
					return result;
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
		else if(cardsType.equalsIgnoreCase("-1")) {
			for(int i=stand0; i<18; i++) {
				if(a[i]>=3) {
					String three = Controller.convertIntToString(i)+
							Controller.convertIntToString(i)
					+Controller.convertIntToString(i);
					for(int j=3; j<18; j++) {
						if(j!=i && a[j]>=2) {
							result.add(three+Controller.convertIntToString(j)+Controller.convertIntToString(j));
						}
					}
				}
			}		//threeDtwo
			for(int i=stand0; i<18; i++) {
				if(a[i]>=3) {
					String three = Controller.convertIntToString(i)+
							Controller.convertIntToString(i)
					+Controller.convertIntToString(i);
					for(int j=3; j<18; j++) {
						if(j!=i && a[j]>0) {
							result.add(three+Controller.convertIntToString(j));
						}
					}
				}
			}
			for(int i=stand0; i<18; i++) {
				if(a[i]>=3) {
					result.add(Controller.convertIntToString(i)+
							Controller.convertIntToString(i)
					+Controller.convertIntToString(i));
				}
			}
			for(int i=stand0; i<18; i++) {
				if(a[i]>=2) {
					result.add(Controller.convertIntToString(i)+
							Controller.convertIntToString(i));
				}
			}
			for(int i=stand0; i<a.length; i++) {
				if(a[i]>0) {
					result.add(Controller.convertIntToString(i));
				}
			}

		}
		else {
			throw new IllegalArgumentException("IllegalArgumentException");
		}
		return result;
	}

}
