import java.util.*;

public class Account {
  Crypto crypto;
  List<SecureItem> items;

  public Account(String aPassword) {
    crypto = new PasswordCrypto(aPassword);
    items = new ArrayList<SecureItem>();
  }

  public SecureItem getItem(int position) {
    int size = items.size();
    if (position > size || position <= 0){
      return null;
    }

    return items.get(position - 1);
  }

  public Iterable<SecureItem> items()
  {
      Iterable<SecureItem> iterable = items;

      /*
      How the iterable would print everything using the iterator.
      
      Iterator<SecureItem> iterator = iterable.iterator();
      while(iterator.hasNext()){
        SecureItem p = (SecureItem) iterator.next();
        System.out.println(p.reveal());
      }
      */
      return iterable;

  }


   //private static Iterable<SecureItem> func(Iterator<SecureItem> stoop)
    //{
        //return new Iterable<SecureItem>(){
          //public Iterator<SecureItem> iterator(){
          //  return stoop;
        //  }
      //  };
    //}



  public void addSecureItem(SecureItem item){
    if (item == null){
      return;
    }
    item.setEncryption(crypto);
    int size = items.size();
    if (size == 0){
      items.add(item);
    }
    else{
      for (int i = 0 ; i < size; i++){

        if (item.compareTo(getItem(i + 1)) <= 0){
          items.add(i,item);
          return;
        }
      }
      items.add(item);
    }

  }
  public void changePassword(String newPassword){
    crypto = new PasswordCrypto(newPassword);
    int size = items.size();
    for (int i = 1; i <= size; i++){
      getItem(i).setEncryption(crypto);
    }
  }
}
