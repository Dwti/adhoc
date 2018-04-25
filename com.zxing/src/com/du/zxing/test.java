package com.du.zxing;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import sun.misc.BASE64Decoder;

public class test {

	public static SecretKey securekey;
	
	public static String DecryptDate(String cryptdata) {
        try {
            byte[] base64 = new BASE64Decoder().decodeBuffer(cryptdata);
            SecureRandom random = new SecureRandom();
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, securekey, random);
            return new String(cipher.doFinal(base64), "UTF-8");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
	public static void main(String[] args) {
		
		String test="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 5MSXyjOh3+2nICiL/vSI+LKWZA3HU1uS";
		try {
			test= test.replace(" ", "");  
			byte[] eckey = "ws3edaw4".getBytes();
			DESKeySpec deskey = new DESKeySpec(eckey); 
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			securekey = keyFactory.generateSecret(deskey);

			String res = DecryptDate(test);
			System.out.println(res);
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
	}
