/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package src.Model;
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
  private FL fL;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Board(String aCurrentCardTpye, FL aFL)
  {
    currentCardTpye = aCurrentCardTpye;
    released = new ArrayList<String>();
    boolean didAddFL = setFL(aFL);
    if (!didAddFL)
    {
      throw new RuntimeException("Unable to create board due to fL");
    }
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

  public boolean hasGame()
  {
    boolean has = game != null;
    return has;
  }
  /* Code from template association_GetOne */
  public FL getFL()
  {
    return fL;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setGame(Game aNewGame)
  {
    boolean wasSet = false;
    if (game != null && !game.equals(aNewGame) && equals(game.getBoard()))
    {
      //Unable to setGame, as existing game would become an orphan
      return wasSet;
    }

    game = aNewGame;
    Board anOldBoard = aNewGame != null ? aNewGame.getBoard() : null;

    if (!this.equals(anOldBoard))
    {
      if (anOldBoard != null)
      {
        anOldBoard.game = null;
      }
      if (game != null)
      {
        game.setBoard(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOneToOptionalOne */
  public boolean setFL(FL aNewFL)
  {
    boolean wasSet = false;
    if (aNewFL == null)
    {
      //Unable to setFL to null, as board must always be associated to a fL
      return wasSet;
    }
    
    Board existingBoard = aNewFL.getBoard();
    if (existingBoard != null && !equals(existingBoard))
    {
      //Unable to setFL, the current fL already has a board, which would be orphaned if it were re-assigned
      return wasSet;
    }
    
    FL anOldFL = fL;
    fL = aNewFL;
    fL.setBoard(this);

    if (anOldFL != null)
    {
      anOldFL.setBoard(null);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Game existingGame = game;
    game = null;
    if (existingGame != null)
    {
      existingGame.delete();
    }
    FL existingFL = fL;
    fL = null;
    if (existingFL != null)
    {
      existingFL.setBoard(null);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "currentCardTpye" + ":" + getCurrentCardTpye()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "fL = "+(getFL()!=null?Integer.toHexString(System.identityHashCode(getFL())):"null");
  }
}