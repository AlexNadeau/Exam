public abstract class SecureItem {
 public String name;
 protected Crypto crypto;
 public SecureItem(String aName) {
 name = aName;
 }
 public void setEncryption(Crypto aCrypto) {
 crypto = aCrypto;
 }
 public abstract String display();
 public abstract String reveal();
 public abstract String encrypted();
 public abstract int compareTo(SecureItem compareTo);
}
