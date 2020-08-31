public class SecureNote extends SecureItem{

public String text;

  public SecureNote(String aName, String someText){
    super(aName);
    text = someText;
  }
  public String reveal(){
    return name + ": " + text;
  }
  public String display(){
    return name + ": " + "******";
  }
  public String encrypted(){
    return name + ": " + crypto.encrypt(text);
  }
  public int compareTo(SecureItem compareTo){
    //System.out.println("Comparing " + this.name + " to " + compareTo.name);
    return this.name.compareTo(compareTo.name);
  }

}
