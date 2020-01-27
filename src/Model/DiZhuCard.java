/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package src.Model;
import java.util.*;

// line 18 "../../model.ump"
public class DiZhuCard extends CardSet
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //DiZhuCard Attributes
  private int remainNum;
  private boolean isDone;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public DiZhuCard(int aRemainNum, boolean aIsDone)
  {
    super();
    remainNum = aRemainNum;
    isDone = aIsDone;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setRemainNum(int aRemainNum)
  {
    boolean wasSet = false;
    remainNum = aRemainNum;
    wasSet = true;
    return wasSet;
  }

  public boolean setIsDone(boolean aIsDone)
  {
    boolean wasSet = false;
    isDone = aIsDone;
    wasSet = true;
    return wasSet;
  }

  public int getRemainNum()
  {
    return remainNum;
  }

  public boolean getIsDone()
  {
    return isDone;
  }
  /* Code from template attribute_IsBoolean */
  public boolean isIsDone()
  {
    return isDone;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "remainNum" + ":" + getRemainNum()+ "," +
            "isDone" + ":" + getIsDone()+ "]";
  }
}