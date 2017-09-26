import java.security.MessageDigest;
import java.util.Scanner;

public class GetHashString {
    // s3,14zhzheno
    public static String encrypt(String base, String alg) {
        try{
            MessageDigest digest = MessageDigest.getInstance(alg);
            byte[] hash = digest.digest(base.getBytes("UTF-8"));
            StringBuffer hexString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }

    public static void hashcode() {
        System.out.println("Enter your string to encrypt: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Enter preferred algorithm(SHA-256/MD5): ");
        String hashAlg = scanner.nextLine();

        System.out.println(encrypt(text, hashAlg));
    }
}
