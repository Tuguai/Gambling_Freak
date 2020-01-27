/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package src.Model;

// line 3 "../../model.ump"
public class Card
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Card Attributes
  private String suit;
  private String rank;
  private boolean isBigJoker;
  private boolean isSmallJoker;

  //Card Associations
  private CardSet cardSet;
  private Player player;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Card(String aSuit, String aRank, boolean aIsBigJoker, boolean aIsSmallJoker, CardSet aCardSet)
  {
    suit = aSuit;
    rank = aRank;
    isBigJoker = aIsBigJoker;
    isSmallJoker = aIsSmallJoker;
    boolean didAddCardSet = setCardSet(aCardSet);
    if (!didAddCardSet)
    {
      throw new RuntimeException("Unable to create card due to cardSet");
    }
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

  public boolean setRank(String aRank)
  {
    boolean wasSet = false;
    rank = aRank;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsBigJoker(boolean aIsBigJoker)
  {
    boolean wasSet = false;
    isBigJoker = aIsBigJoker;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsSmallJoker(boolean aIsSmallJoker)
  {
    boolean wasSet = false;
    isSmallJoker = aIsSmallJoker;
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
   * A23456789JQK
   */
  public String getRank()
  {
    return rank;
  }

  public boolean getIsBigJoker()
  {
    return isBigJoker;
  }

  public boolean getIsSmallJoker()
  {
    return isSmallJoker;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsBigJoker()
  {
    return isBigJoker;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsSmallJoker()
  {
    return isSmallJoker;
  }
  /* Code from template association_GetOne */
  public CardSet getCardSet()
  {
    return cardSet;
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
  /* Code from template association_SetOneToMany */
  public boolean setCardSet(CardSet aCardSet)
  {
    boolean wasSet = false;
    if (aCardSet == null)
    {
      return wasSet;
    }

    CardSet existingCardSet = cardSet;
    cardSet = aCardSet;
    if (existingCardSet != null && !existingCardSet.equals(aCardSet))
    {
      existingCardSet.removeCard(this);
    }
    cardSet.addCard(this);
    wasSet = true;
    return wasSet;
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

  public void delete()
  {
    CardSet placeholderCardSet = cardSet;
    this.cardSet = null;
    if(placeholderCardSet != null)
    {
      placeholderCardSet.removeCard(this);
    }
    if (player != null)
    {
      Player placeholderPlayer = player;
      this.player = null;
      placeholderPlayer.removeHand(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "suit" + ":" + getSuit()+ "," +
            "rank" + ":" + getRank()+ "," +
            "isBigJoker" + ":" + getIsBigJoker()+ "," +
            "isSmallJoker" + ":" + getIsSmallJoker()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "cardSet = "+(getCardSet()!=null?Integer.toHexString(System.identityHashCode(getCardSet())):"null") + System.getProperties().getProperty("line.separator") +
            "  " + "player = "+(getPlayer()!=null?Integer.toHexString(System.identityHashCode(getPlayer())):"null");
  }
}