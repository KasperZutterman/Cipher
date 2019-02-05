/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cipher;

/**
 *
 * @author kaspe
 */
public class CaeserCipher {
    
    public static String encode(String enc, int offset) {
        offset = offset % 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isLowerCase(i)) {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26));
                }
                else {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26));
                }
            }
            else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }
    
    public static String decode(String dec, int offset) {
        return encode(dec, 26 - offset);
    }
}
