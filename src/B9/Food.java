package B9;

import java.util.Objects;

//-----------------------------------------------------------------//
public class Food {
  //---------------------------------------------------------------//
  private String type;
  private String name;

  public Food(String type, String name) {
    this.type = type;
    this.name = name;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public String getName() {
    return name;
  }

  //---------------------------------------------------------------//
  public int hashCode() {

    return Objects.hash(getName(), getType());
  }

  //---------------------------------------------------------------//
  public String toString() {
    // TODO: implementation
    String str = "";

    str.concat("Food={");
    str.concat("%s ," + getName());

    str.concat("%s }" + getType());
    return str;
  }
}
