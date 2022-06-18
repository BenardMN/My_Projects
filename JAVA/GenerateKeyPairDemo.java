import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

public class GenerateKeyPairDemo {
    public static void main(String[] args) throws NoSuchProviderException {
        try {
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");

            SecureRandom random = SecureRandom.getInstance("SHA1PRING", "SUN");
            keyGen.initialize(1024, random);

            KeyPair keyPair = keyGen.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            Base64.Encoder encoder = Base64.getEncoder();
            System.out.println("privateKey: " + encoder.encodeToString(privateKey.getEncoded()));
            System.out.println("publicKey: " + encoder.encodeToString(publicKey.getEncoded()));
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
    }
}
