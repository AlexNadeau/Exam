public class PasswordCrypto extends CaesarCrypto{

  public PasswordCrypto(String message){
    super(calculateOffset(message));
  }
  public static int calculateOffset(String message){
    int sum = 0;
    for (int i = 0; i < message.length(); i++){
      sum = sum + (int) (message.charAt(i) - 96);
    }
    if (sum == 0){
      return 10;
    }
    return sum;
  }


}
