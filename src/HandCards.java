
public class HandCards {


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

	private int numberOfCards;
	private boolean hasWon;
	private int[] card;
	
	public HandCards() {
		
		hasWon = false;
		card = new int[18];
		for(int i=0; i<=17; i++) {
			card[i] = 0;
		}
		
	}
	
	
	
}
