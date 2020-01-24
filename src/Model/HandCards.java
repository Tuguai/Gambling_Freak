package Model;


public class HandCards {

	private int numberOfCards;
	private boolean hasWon;
	private int[] card;
	// how to represent color?
	// using an 2D 4rx18c size table? 黑桃 int[0][c] = 1; 红心 int[1][c] = 1; 对应花色位置行为1
	
	public HandCards() {	
		hasWon = false;
		card = new int[18];
		for(int i=0; i<=17; i++) {
			card[i] = 0;
		}
	}
	
	
	public int getNumberOfCards() {
		return numberOfCards;
	}

	public void setNumberOfCards(int numberOfCards) {
		this.numberOfCards = numberOfCards;
	}

	public boolean isHasWon() {
		return hasWon;
	}

	public void setHasWon(boolean hasWon) {
		this.hasWon = hasWon;
	}

	public int[] getCard() {
		return card;
	}

	public void setCard(int[] card) {
		this.card = card;
	}

	
	
	
}
