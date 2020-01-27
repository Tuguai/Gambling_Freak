/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package Model;
import java.util.*;

// line 34 "../../model.ump"
public class User
{

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Map<String, User> usersByName = new HashMap<String, User>();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //User Attributes
  private String name;

  //User Associations
  private FL fL;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public User(String aName, FL aFL)
  {
    if (!setName(aName))
    {
      throw new RuntimeException("Cannot create due to duplicate name");
    }
    boolean didAddFL = setFL(aFL);
    if (!didAddFL)
    {
      throw new RuntimeException("Unable to create user due to fL");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    String anOldName = getName();
    if (hasWithName(aName)) {
      return wasSet;
    }
    name = aName;
    wasSet = true;
    if (anOldName != null) {
      usersByName.remove(anOldName);
    }
    usersByName.put(aName, this);
    return wasSet;
  }

  public String getName()
  {
    return name;
  }
  /* Code from template attribute_GetUnique */
  public static User getWithName(String aName)
  {
    return usersByName.get(aName);
  }
  /* Code from template attribute_HasUnique */
  public static boolean hasWithName(String aName)
  {
    return getWithName(aName) != null;
  }
  /* Code from template association_GetOne */
  public FL getFL()
  {
    return fL;
  }
  /* Code from template association_SetOneToMany */
  public boolean setFL(FL aFL)
  {
    boolean wasSet = false;
    if (aFL == null)
    {
      return wasSet;
    }

    FL existingFL = fL;
    fL = aFL;
    if (existingFL != null && !existingFL.equals(aFL))
    {
      existingFL.removeUser(this);
    }
    fL.addUser(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    usersByName.remove(getName());
    FL placeholderFL = fL;
    this.fL = null;
    if(placeholderFL != null)
    {
      placeholderFL.removeUser(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "name" + ":" + getName()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "fL = "+(getFL()!=null?Integer.toHexString(System.identityHashCode(getFL())):"null");
  }
}