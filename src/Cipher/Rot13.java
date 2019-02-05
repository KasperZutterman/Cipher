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
public class Rot13 {
    
    public static String rot13(String in) {
        StringBuilder rot = new StringBuilder();
        for (char ch: in.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch >= 'A' && ch <= 'Z') {
                    rot.append((char) ('A' + (ch - 'A' + 13) % 26));
                }
                else {
                    rot.append((char) ('a' + (ch - 'a' + 13) % 26));
                }
            }
            else {
                rot.append(ch);
            }
        }
        return rot.toString();
    }
}
