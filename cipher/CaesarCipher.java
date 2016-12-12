package cipher;
import function.Caesarfunction;


public class CaesarCipher {

    public static void main(String[] args) {
      Caesarfunction a = new Caesarfunction();
      System.out.println(a.replace("Computer science", 6));
    }
}