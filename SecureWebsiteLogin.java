public class SecureWebsiteLogin extends SecureItem{

private String username;
private String password;

  public SecureWebsiteLogin(String aURL, String aUsername,String aPassword){
    super(aURL);
    username = aUsername;
    password = aPassword;
  }
  public String reveal(){
    return "\n" + "Website: " + name + "\n" + "Username: " + username + "\n" + "Password: " + password;
  }
  public String display(){
    return "\n" + "Website: " + name + "\n" + "Username: " + username + "\n" + "Password: ******";
  }
  public String encrypted(){
    return "\n" + "Website: " + name + "\n" + "Username: " + username + "\n" + "Password: " + crypto.encrypt(password);
  }
  public int compareTo(SecureItem compareTo){
    //System.out.println("Comparing " + this.name + " to " + compareTo.name);
    return this.name.compareTo(compareTo.name);
  }


}
