public class CaesarCrypto implements Crypto{

private int increment;

  public CaesarCrypto(int aInc){
    increment = aInc;
  }


  public String encrypt(String message){
    String s = "";
    for (int i = 0; i < message.length(); i++){
      s = s + Character.toString(message.charAt(i) + increment);
    }
    return s;
  }
  public String decrypt(String message){
    String s = "";
    for (int i = 0; i < message.length(); i++){
      s = s + Character.toString(message.charAt(i) - increment);
    }
    return s;
  }


}
