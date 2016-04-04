package JonasPhilMalte;
/**
 * 
 */

/**
 * @author JonasH
 * Klasse zum Generieren eines Secrets mittels AES 128 Bit.
 */


import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
public class generateSecret {
	
	public SecretKey neuesSecret() throws Exception {
	
	KeyGenerator keyGen = KeyGenerator.getInstance("AES");
	keyGen.init(128);
	SecretKey secKey = keyGen.generateKey();
	byte[] key = secKey.getEncoded();
	System.out.println(key);
	return secKey;
	}
}
