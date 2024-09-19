package Cartografia;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class clauSimetricaDES {
    public static void main(String[] args) {
        SecretKey sKey = keygenKeyGeneration("AES", 256);
        String encodedKey = Base64.getEncoder().encodeToString(sKey.getEncoded());
        System.out.println("Clau AES 256 bits generada: "+encodedKey);

        System.out.println("Calu DES 56 bits generada: "+Base64.getEncoder().encodeToString(keygenKeyGeneration("DES",56).getEncoded()));

    }

    public static SecretKey keygenKeyGeneration(String algoritme, int keySize) {
        SecretKey sKey = null;
            try {
                KeyGenerator kgen = KeyGenerator.getInstance(algoritme);
                kgen.init(keySize);
                sKey = kgen.generateKey();
            }catch (NoSuchAlgorithmException ex){
                System.err.println("Error al generar clau: "+ex.getMessage());
            }

        return sKey;
    }
}
