import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.*;
public class GenerateDigitalSignature {
    public static void main(String[] args) {
        try {
            //Get instance and initialize a keyPairGenerator object
            KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
            SecureRandom random = SecureRandom.getInstance("SHA1PRING", "SUN");
            keyGen.initialize(1024, random);

            //get a private key from the generated key pair
            KeyPair keyPair = keyGen.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            
            //get instance of signature andinitialize it
            Signature signature = Signature.getInstance("SHA1withDSA", "SUN");
            signature.initSign(privateKey);

            //supply the data to be signed into the signsture object
            //using the update() method and generate the digital signature
            byte[] bytes = Files.readAllBytes(Paths.get("README"));
            signature.update(bytes);
            byte[] digitalSignature = signature.sign();

            //save digital signature and public key to a file
            Files.write(Paths.get("signature"), digitalSignature);
            Files.write(Paths.get("publickey"), keyPair.getPublic().getEncoded());
        } catch (Exception e) {
            //handle exception
            e.printStackTrace();
        }
    }
}
