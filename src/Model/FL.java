/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package Model;
import java.util.*;

// line 27 "../../model.ump"
public class FL
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //FL Associations
  private Game currentGame;
  private Board board;
  private List<User> users;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public FL()
  {
    users = new ArrayList<User>();
  }

  //------------------------
  // INTERFACE
  //------------------------
  /* Code from template association_GetOne */
  public Game getCurrentGame()
  {
    return currentGame;
  }

  public boolean hasCurrentGame()
  {
    boolean has = currentGame != null;
    return has;
  }
  /* Code from template association_GetOne */
  public Board getBoard()
  {
    return board;
  }

  public boolean hasBoard()
  {
    boolean has = board != null;
    return has;
  }
  /* Code from template association_GetMany */
  public User getUser(int index)
  {
    User aUser = users.get(index);
    return aUser;
  }

  public List<User> getUsers()
  {
    List<User> newUsers = Collections.unmodifiableList(users);
    return newUsers;
  }

  public int numberOfUsers()
  {
    int number = users.size();
    return number;
  }

  public boolean hasUsers()
  {
    boolean has = users.size() > 0;
    return has;
  }

  public int indexOfUser(User aUser)
  {
    int index = users.indexOf(aUser);
    return index;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setCurrentGame(Game aNewCurrentGame)
  {
    boolean wasSet = false;
    if (currentGame != null && !currentGame.equals(aNewCurrentGame) && equals(currentGame.getFL()))
    {
      //Unable to setCurrentGame, as existing currentGame would become an orphan
      return wasSet;
    }

    currentGame = aNewCurrentGame;
    FL anOldFL = aNewCurrentGame != null ? aNewCurrentGame.getFL() : null;

    if (!this.equals(anOldFL))
    {
      if (anOldFL != null)
      {
        anOldFL.currentGame = null;
      }
      if (currentGame != null)
      {
        currentGame.setFL(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToOne */
  public boolean setBoard(Board aNewBoard)
  {
    boolean wasSet = false;
    if (board != null && !board.equals(aNewBoard) && equals(board.getFL()))
    {
      //Unable to setBoard, as existing board would become an orphan
      return wasSet;
    }

    board = aNewBoard;
    FL anOldFL = aNewBoard != null ? aNewBoard.getFL() : null;

    if (!this.equals(anOldFL))
    {
      if (anOldFL != null)
      {
        anOldFL.board = null;
      }
      if (board != null)
      {
        board.setFL(this);
      }
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfUsers()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public User addUser(String aName)
  {
    return new User(aName, this);
  }

  public boolean addUser(User aUser)
  {
    boolean wasAdded = false;
    if (users.contains(aUser)) { return false; }
    FL existingFL = aUser.getFL();
    boolean isNewFL = existingFL != null && !this.equals(existingFL);
    if (isNewFL)
    {
      aUser.setFL(this);
    }
    else
    {
      users.add(aUser);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeUser(User aUser)
  {
    boolean wasRemoved = false;
    //Unable to remove aUser, as it must always have a fL
    if (!this.equals(aUser.getFL()))
    {
      users.remove(aUser);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addUserAt(User aUser, int index)
  {  
    boolean wasAdded = false;
    if(addUser(aUser))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsers()) { index = numberOfUsers() - 1; }
      users.remove(aUser);
      users.add(index, aUser);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveUserAt(User aUser, int index)
  {
    boolean wasAdded = false;
    if(users.contains(aUser))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfUsers()) { index = numberOfUsers() - 1; }
      users.remove(aUser);
      users.add(index, aUser);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addUserAt(aUser, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    Game existingCurrentGame = currentGame;
    currentGame = null;
    if (existingCurrentGame != null)
    {
      existingCurrentGame.delete();
      existingCurrentGame.setFL(null);
    }
    Board existingBoard = board;
    board = null;
    if (existingBoard != null)
    {
      existingBoard.delete();
      existingBoard.setFL(null);
    }
    while (users.size() > 0)
    {
      User aUser = users.get(users.size() - 1);
      aUser.delete();
      users.remove(aUser);
    }
    
  }

}