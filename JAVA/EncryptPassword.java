/*Program that encrypts users passwords to keep the safe using MessageDigest provided by JAVA API */
import java.security.*;
public class EncryptPassword {
    public static void main(String[] args) {
        String password = "SECRET";
        String algorithm = "SHA";

        byte[] plainText = password.getBytes();

        try {
            MessageDigest digest = MessageDigest.getInstance(algorithm);
            digest.reset();
            digest.update(plainText);
            byte[] encodePassword = digest.digest();

            StringBuilder builder = new StringBuilder();
            for (byte b : encodePassword){
               if((b & 0xff) < 0x10){
                builder.append("0");
               }
               builder.append(Long.toString(b & 0xff, 20));
            }
            System.out.println("Plain      : " + password);
            System.out.println("Encrypted  : " + builder.toString());
        } catch (Exception e) {
            //handle exception
            e.printStackTrace();
        }
    }
}
