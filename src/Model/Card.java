/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package Model;

// line 3 "../../model.ump"
public class Card
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Card Attributes
  private String suit;
  private char rank;

  //Card Associations
  private Player player;
  private Game game;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Card(String aSuit, char aRank)
  {
    suit = aSuit;
    rank = aRank;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setSuit(String aSuit)
  {
    boolean wasSet = false;
    suit = aSuit;
    wasSet = true;
    return wasSet;
  }

  public boolean setRank(char aRank)
  {
    boolean wasSet = false;
    rank = aRank;
    wasSet = true;
    return wasSet;
  }

  /**
   * "hearts", "clubs", "diamonds", "spades"
   */
  public String getSuit()
  {
    return suit;
  }

  /**
   * 3456789JQKA2NM
   */
  public char getRank()
  {
    return rank;
  }
  /* Code from template association_GetOne */
  public Player getPlayer()
  {
    return player;
  }

  public boolean hasPlayer()
  {
    boolean has = player != null;
    return has;
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
  /* Code from template association_SetOptionalOneToMany */
  public boolean setPlayer(Player aPlayer)
  {
    boolean wasSet = false;
    Player existingPlayer = player;
    player = aPlayer;
    if (existingPlayer != null && !existingPlayer.equals(aPlayer))
    {
      existingPlayer.removeHand(this);
    }
    if (aPlayer != null)
    {
      aPlayer.addHand(this);
    }
    wasSet = true;
    return wasSet;
  }
  /* Code from template association_SetOptionalOneToMany */
  public boolean setGame(Game aGame)
  {
    boolean wasSet = false;
    Game existingGame = game;
    game = aGame;
    if (existingGame != null && !existingGame.equals(aGame))
    {
      existingGame.removeCard(this);
    }
    if (aGame != null)
    {
      aGame.addCard(this);
    }
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    if (player != null)
    {
      Player placeholderPlayer = player;
      this.player = null;
      placeholderPlayer.removeHand(this);
    }
    if (game != null)
    {
      Game placeholderGame = game;
      this.game = null;
      placeholderGame.removeCard(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "suit" + ":" + getSuit()+ "," +
            "rank" + ":" + getRank()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "player = "+(getPlayer()!=null?Integer.toHexString(System.identityHashCode(getPlayer())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "game = "+(getGame()!=null?Integer.toHexString(System.identityHashCode(getGame())):"null");
  }
}