/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package Model;
import java.util.*;

// line 15 "../../model.ump"
public class Game
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Game Associations
  private List<Player> dealer;
  private List<Card> cards;
  private Board board;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Game(Board aBoard)
  {
    dealer = new ArrayList<Player>();
    cards = new ArrayList<Card>();
    if (aBoard == null || aBoard.getGame() != null)
    {
      throw new RuntimeException("Unable to create Game due to aBoard");
    }
    board = aBoard;
  }

  public Game(String aCurrentCardTpyeForBoard)
  {
    dealer = new ArrayList<Player>();
    cards = new ArrayList<Card>();
    board = new Board(aCurrentCardTpyeForBoard, this);
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetMany */
  public Player getDealer(int index)
  {
    Player aDealer = dealer.get(index);
    return aDealer;
  }

  public List<Player> getDealer()
  {
    List<Player> newDealer = Collections.unmodifiableList(dealer);
    return newDealer;
  }

  public int numberOfDealer()
  {
    int number = dealer.size();
    return number;
  }

  public boolean hasDealer()
  {
    boolean has = dealer.size() > 0;
    return has;
  }

  public int indexOfDealer(Player aDealer)
  {
    int index = dealer.indexOf(aDealer);
    return index;
  }
  /* Code from template association_GetMany */
  public Card getCard(int index)
  {
    Card aCard = cards.get(index);
    return aCard;
  }

  public List<Card> getCards()
  {
    List<Card> newCards = Collections.unmodifiableList(cards);
    return newCards;
  }

  public int numberOfCards()
  {
    int number = cards.size();
    return number;
  }

  public boolean hasCards()
  {
    boolean has = cards.size() > 0;
    return has;
  }

  public int indexOfCard(Card aCard)
  {
    int index = cards.indexOf(aCard);
    return index;
  }
  /* Code from template association_GetOne */
  public Board getBoard()
  {
    return board;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfDealer()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addDealer(Player aDealer)
  {
    boolean wasAdded = false;
    if (dealer.contains(aDealer)) { return false; }
    Game existingGame = aDealer.getGame();
    if (existingGame == null)
    {
      aDealer.setGame(this);
    }
    else if (!this.equals(existingGame))
    {
      existingGame.removeDealer(aDealer);
      addDealer(aDealer);
    }
    else
    {
      dealer.add(aDealer);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeDealer(Player aDealer)
  {
    boolean wasRemoved = false;
    if (dealer.contains(aDealer))
    {
      dealer.remove(aDealer);
      aDealer.setGame(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addDealerAt(Player aDealer, int index)
  {  
    boolean wasAdded = false;
    if(addDealer(aDealer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDealer()) { index = numberOfDealer() - 1; }
      dealer.remove(aDealer);
      dealer.add(index, aDealer);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveDealerAt(Player aDealer, int index)
  {
    boolean wasAdded = false;
    if(dealer.contains(aDealer))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfDealer()) { index = numberOfDealer() - 1; }
      dealer.remove(aDealer);
      dealer.add(index, aDealer);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addDealerAt(aDealer, index);
    }
    return wasAdded;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfCards()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addCard(Card aCard)
  {
    boolean wasAdded = false;
    if (cards.contains(aCard)) { return false; }
    Game existingGame = aCard.getGame();
    if (existingGame == null)
    {
      aCard.setGame(this);
    }
    else if (!this.equals(existingGame))
    {
      existingGame.removeCard(aCard);
      addCard(aCard);
    }
    else
    {
      cards.add(aCard);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeCard(Card aCard)
  {
    boolean wasRemoved = false;
    if (cards.contains(aCard))
    {
      cards.remove(aCard);
      aCard.setGame(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addCardAt(Card aCard, int index)
  {  
    boolean wasAdded = false;
    if(addCard(aCard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCards()) { index = numberOfCards() - 1; }
      cards.remove(aCard);
      cards.add(index, aCard);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveCardAt(Card aCard, int index)
  {
    boolean wasAdded = false;
    if(cards.contains(aCard))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfCards()) { index = numberOfCards() - 1; }
      cards.remove(aCard);
      cards.add(index, aCard);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addCardAt(aCard, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while( !dealer.isEmpty() )
    {
      dealer.get(0).setGame(null);
    }
    while( !cards.isEmpty() )
    {
      cards.get(0).setGame(null);
    }
    Board existingBoard = board;
    board = null;
    if (existingBoard != null)
    {
      existingBoard.delete();
    }
  }

}