/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package src.Model;
import java.util.*;

// line 36 "../../model.ump"
public class Player
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Player Attributes
  private String name;
  private String id;
  private int score;

  //Player Associations
  private List<Card> hand;
  private ScoringTeam scoringTeam;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Player(String aName, String aId, int aScore, ScoringTeam aScoringTeam)
  {
    name = aName;
    id = aId;
    score = aScore;
    hand = new ArrayList<Card>();
    boolean didAddScoringTeam = setScoringTeam(aScoringTeam);
    if (!didAddScoringTeam)
    {
      throw new RuntimeException("Unable to create player due to scoringTeam");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  public boolean setId(String aId)
  {
    boolean wasSet = false;
    id = aId;
    wasSet = true;
    return wasSet;
  }

  public boolean setScore(int aScore)
  {
    boolean wasSet = false;
    score = aScore;
    wasSet = true;
    return wasSet;
  }

  public String getName()
  {
    return name;
  }

  public String getId()
  {
    return id;
  }

  public int getScore()
  {
    return score;
  }
  /* Code from template association_GetMany */
  public Card getHand(int index)
  {
    Card aHand = hand.get(index);
    return aHand;
  }

  public List<Card> getHand()
  {
    List<Card> newHand = Collections.unmodifiableList(hand);
    return newHand;
  }

  public int numberOfHand()
  {
    int number = hand.size();
    return number;
  }

  public boolean hasHand()
  {
    boolean has = hand.size() > 0;
    return has;
  }

  public int indexOfHand(Card aHand)
  {
    int index = hand.indexOf(aHand);
    return index;
  }
  /* Code from template association_GetOne */
  public ScoringTeam getScoringTeam()
  {
    return scoringTeam;
  }
  /* Code from template association_MinimumNumberOfMethod */
  public static int minimumNumberOfHand()
  {
    return 0;
  }
  /* Code from template association_AddManyToOptionalOne */
  public boolean addHand(Card aHand)
  {
    boolean wasAdded = false;
    if (hand.contains(aHand)) { return false; }
    Player existingPlayer = aHand.getPlayer();
    if (existingPlayer == null)
    {
      aHand.setPlayer(this);
    }
    else if (!this.equals(existingPlayer))
    {
      existingPlayer.removeHand(aHand);
      addHand(aHand);
    }
    else
    {
      hand.add(aHand);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeHand(Card aHand)
  {
    boolean wasRemoved = false;
    if (hand.contains(aHand))
    {
      hand.remove(aHand);
      aHand.setPlayer(null);
      wasRemoved = true;
    }
    return wasRemoved;
  }
  /* Code from template association_AddIndexControlFunctions */
  public boolean addHandAt(Card aHand, int index)
  {  
    boolean wasAdded = false;
    if(addHand(aHand))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHand()) { index = numberOfHand() - 1; }
      hand.remove(aHand);
      hand.add(index, aHand);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveHandAt(Card aHand, int index)
  {
    boolean wasAdded = false;
    if(hand.contains(aHand))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfHand()) { index = numberOfHand() - 1; }
      hand.remove(aHand);
      hand.add(index, aHand);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addHandAt(aHand, index);
    }
    return wasAdded;
  }
  /* Code from template association_SetOneToAtMostN */
  public boolean setScoringTeam(ScoringTeam aScoringTeam)
  {
    boolean wasSet = false;
    //Must provide scoringTeam to player
    if (aScoringTeam == null)
    {
      return wasSet;
    }

    //scoringTeam already at maximum (2)
    if (aScoringTeam.numberOfPlayers() >= ScoringTeam.maximumNumberOfPlayers())
    {
      return wasSet;
    }
    
    ScoringTeam existingScoringTeam = scoringTeam;
    scoringTeam = aScoringTeam;
    if (existingScoringTeam != null && !existingScoringTeam.equals(aScoringTeam))
    {
      boolean didRemove = existingScoringTeam.removePlayer(this);
      if (!didRemove)
      {
        scoringTeam = existingScoringTeam;
        return wasSet;
      }
    }
    scoringTeam.addPlayer(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    while( !hand.isEmpty() )
    {
      hand.get(0).setPlayer(null);
    }
    ScoringTeam placeholderScoringTeam = scoringTeam;
    this.scoringTeam = null;
    if(placeholderScoringTeam != null)
    {
      placeholderScoringTeam.removePlayer(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "," +
            "id" + ":" + getId()+ "," +
            "score" + ":" + getScore()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "scoringTeam = "+(getScoringTeam()!=null?Integer.toHexString(System.identityHashCode(getScoringTeam())):"null");
  }
}