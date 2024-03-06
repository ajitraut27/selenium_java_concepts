package password_encryption;


import org.apache.hc.client5.http.utils.Base64;

public class encrypt_password {
    public static void main(String[] args) {
        String passw = "admin123";

        byte[] encodedPass = Base64.encodeBase64(passw.getBytes());
        System.out.println("Encoded password: " + new String(encodedPass));

        byte[] decodedPass = Base64.decodeBase64(encodedPass);
        System.out.println("Decoded password: " + new String(decodedPass));
    }
}
