/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package Model;
import java.util.*;

// line 20 "../../model.ump"
public class Board
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Board Attributes
  private String currentCardTpye;
  private List<String> released;

  //Board Associations
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Board(String aCurrentCardTpye, Game aGame)
  {
    currentCardTpye = aCurrentCardTpye;
    released = new ArrayList<String>();
    if (aGame == null || aGame.getBoard() != null)
    {
      throw new RuntimeException("Unable to create Board due to aGame");
    }
    game = aGame;
  }

  public Board(String aCurrentCardTpye)
  {
    currentCardTpye = aCurrentCardTpye;
    released = new ArrayList<String>();
    game = new Game(this);
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCurrentCardTpye(String aCurrentCardTpye)
  {
    boolean wasSet = false;
    currentCardTpye = aCurrentCardTpye;
    wasSet = true;
    return wasSet;
  }
  /* Code from template attribute_SetMany */
  public boolean addReleased(String aReleased)
  {
    boolean wasAdded = false;
    wasAdded = released.add(aReleased);
    return wasAdded;
  }

  public boolean removeReleased(String aReleased)
  {
    boolean wasRemoved = false;
    wasRemoved = released.remove(aReleased);
    return wasRemoved;
  }

  public String getCurrentCardTpye()
  {
    return currentCardTpye;
  }
  /* Code from template attribute_GetMany */
  public String getReleased(int index)
  {
    String aReleased = released.get(index);
    return aReleased;
  }

  public String[] getReleased()
  {
    String[] newReleased = released.toArray(new String[released.size()]);
    return newReleased;
  }

  public int numberOfReleased()
  {
    int number = released.size();
    return number;
  }

  public boolean hasReleased()
  {
    boolean has = released.size() > 0;
    return has;
  }

  public int indexOfReleased(String aReleased)
  {
    int index = released.indexOf(aReleased);
    return index;
  }
  /* Code from template association_GetOne */
  public Game getGame()
  {
    return game;
  }

  public void delete()
  {
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentCardTpye" + ":" + getCurrentCardTpye()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }
}