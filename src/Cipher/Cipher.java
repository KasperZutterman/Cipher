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
public class Cipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "The quick brown fox Jumped over the lazy Dog";
 
        System.out.println(CaeserCipher.encode( str, 12 ));
        System.out.println(CaeserCipher.decode(CaeserCipher.encode( str, 12), 12 ));
        
        System.out.println(Rot13.rot13(str));
        System.out.println(Rot13.rot13(Rot13.rot13(str)));
    }
 
}
