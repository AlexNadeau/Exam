import java.util.*;
public class TestMain{
  public static void main(String[] args){
    Crypto c = new ZeroCrypto();
// Devrait sortir "Hello World"
System.out.println(c.encrypt("Hello World"));
// Devrait également sortir "Hello World"
System.out.println(c.decrypt("Hello World"));
 c = new CaesarCrypto(1);
// Devrait sortir "Ifmmp!Xpsme"
System.out.println(c.encrypt("Hello World"));
// Devrait sortir "Hello World"
System.out.println(c.decrypt("Ifmmp!Xpsme"));
// Devrait sortir 1
System.out.println(PasswordCrypto.calculateOffset("a"));
// Devrait sortir 26
System.out.println(PasswordCrypto.calculateOffset("z"));
// Devrait sortir 3 (car 'a' est 1 et 'b' est 2)
System.out.println(PasswordCrypto.calculateOffset("ab"));
// Devrait sortir 286
System.out.println(PasswordCrypto.calculateOffset("zzzzzzzzzzz"));
// Oui, les incréments peuvent être négatifs, devrait sortir -31
System.out.println(PasswordCrypto.calculateOffset("A"));
 c = new PasswordCrypto("zzzzzzzzzzz");
// Devrait sortir "ŲƆƃľƄƍƖľƒƐƍƒľƅƍƃƑľƐƍƒ"
System.out.println(c.encrypt("The fox trot goes rot"));
// Devrait sortir "The fox trot goes rot"
System.out.println(c.decrypt("ŲƆƃľƄƍƖľƒƐƍƒľƅƍƃƑľƐƍƒ"));
// Instancier un SecureItem avec l'instance SecureNote
SecureItem item = new SecureNote("private thoughts", "I love programming");
// La méthode reveal() doit afficher le nom / texte décrypté
// Devrait sortir "private thoughts: I love programming"
System.out.println(item.reveal());
// L'item peut être crypté à l'aide de _n'importe quelle_ implementation Crypto
// Ici, nous allons utiliser un CaesarCrypto avec un incrément de 1
item.setEncryption(new CaesarCrypto(1));
// La méthode display() doit afficher le nom
// mais la note est ****** (tourjour 6 *s)
// Devrait sortir "private thoughts: ******"
System.out.println(item.display());
// La méthode encrypted() est utilisée pour déboguer votre code et
// doit afficher la note cryptée
// Devrait sortir "private thoughts: J!mpwf!qsphsbnnjoh"
System.out.println(item.encrypted());
// Instancier un SecureItem avec l'instance SecureWebsiteLogin
 item = new SecureWebsiteLogin("hey.com", "aforward", "ilovecheese");
// La méthode reveal() doit afficher le URL, username et password décrypté
// Devrait sortir (sur plusieurs lignes)
//
// Website: hey.com
// Username: aforward
// Password: ilovecheese
System.out.println(item.reveal());
// L'item peut être crypté à l'aide de _n'importe quelle_ implementation Crypto
// Ici, nous allons utiliser un CaesarCrypto avec un incrément de 1
item.setEncryption(new CaesarCrypto(1));
// La méthode display() doit afficher toutes les informations
// mais le mot de passe doit être ****** (toujours 6 *s)
// Devrait sortir (sur plusieurs lignes)
//
// Website: hey.com
// Username: aforward
// Password: ******
System.out.println(item.display());
// La méthode encrypted() est utilisée pour déboguer votre code et
// doit afficher le mot de passe cryptée
// Devrait sortir (sur plusieurs lignes)
//
// Website: hey.com
// Username: aforward
// Password: jmpwfdifftf
System.out.println(item.encrypted());
SecureItem heyWebsite =
 new SecureWebsiteLogin("hey.com", "aforward", "ilovecheese");
SecureItem privateThoughts =
 new SecureNote("private thoughts", "I love programming");
Account a = new Account("mypassword");
a.addSecureItem(heyWebsite);
a.addSecureItem(privateThoughts);
// Devrait sortir
//
// Website: hey.com
// Username: aforward
// Password: ĂąĈďþüāþþČþ
System.out.println(a.getItem(1).encrypted());
// Devrait sortir
//
// private thoughts: â¹ąĈďþ¹ĉċĈĀċúĆĆĂćĀ
System.out.println(a.getItem(2).encrypted());
a.changePassword("supersecure");
// Devrait sortir de text crypté basé sur le nouveau mot de passe globals
//
// Website: hey.com
// Username: aforward
// Password: ÿĂąČûùþûûĉû
System.out.println(a.getItem(1).encrypted());
// On devrait révéler les secrets en utilisant le nouveau mot de passe global
//
// Website: hey.com
// Username: aforward
// Password: ilovecheese
System.out.println(a.getItem(1).reveal());
// Devrait sortir
//
// private thoughts: ß¶ĂąČû¶ĆĈąýĈ÷ăăÿĄý
System.out.println(a.getItem(2).encrypted());
 heyWebsite =
 new SecureWebsiteLogin("hey.com", "aforward", "ilovecheese");
 privateThoughts =
 new SecureNote("private thoughts", "I love programming");
SecureItem morePrivateThoughts =
 new SecureNote("private thoughts", "I love biking too");
// doit sortir un nombre négatif,
// parceque "h" dans "hey.com" est avant "p" dans "private thoughts"
System.out.println(heyWebsite.compareTo(privateThoughts));
// doit sortir un nombre positif,
// parceque "p" dans "private thoughts" est après "h" dans "hey.com"
System.out.println(privateThoughts.compareTo(heyWebsite));
// doit sortir zero,
// parceque "private thoughts" est le même dans les deux items
System.out.println(privateThoughts.compareTo(morePrivateThoughts));
  }


}
