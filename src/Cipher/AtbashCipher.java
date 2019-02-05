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
public class AtbashCipher {
    
    public static String encode(String enc) {
        StringBuilder sb = new StringBuilder();
        for (char ch : enc.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    sb.append((char) ('A' + ('Z' - ch)));
                }
                else {
                    sb.append((char) ('a' + ('z' - ch)));
                }
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    
    public static String decode(String dec) {
        return encode(dec);
    }
}
