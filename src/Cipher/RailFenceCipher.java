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
public class RailFenceCipher {
    
    public static String encode(String enc, int rails) {
        StringBuilder sb = new StringBuilder();     
        char[][] rail = new char[rails][enc.length()];
        boolean up = true;
        int row = 0;
        for (int i = 0; i < enc.length(); i++) {
            if (row == 0) {
                up = true;
            }
            else if (row == rails - 1) {
                up = false;
            }

            rail[row][i] = enc.charAt(i);
            
            if (up) {
                row++;
            }
            else {
                row--;
            }
            
        }
        
        for(int i = 0; i < rails; i++) {
            for (int j = 0; j < enc.length(); j++) {
                if (rail[i][j] != '\n') {
                    sb.append(rail[i][j]);
                }
            }
        }
        
        return sb.toString();
    }
    
    public static String decode(String dec, int rails) {
        StringBuilder sb = new StringBuilder();
        char[][] rail = new char[rails][dec.length()];
        boolean up = true;
        int row = 0, col = 0;
        
        for (int i = 0; i < dec.length(); i++) {
            if (row == 0) {
                up = true;
            }
            else if (row == rails - 1) {
                up = false;
            }
            
            rail[row][col++] = '*';
            
            if (up) {
                row++;
            }
            else {
                row--;
            }
        }
        
        int index = 0;
        for (int i = 0; i < rails; i++) {
            for (int j = 0; j < dec.length(); j++) {
                if (rail[i][j] == '*' && index < dec.length()) {
                    rail[i][j] = dec.charAt(index++);
                }
            }
        }
        
        row = 0;
        col = 0;
        for(int i = 0; i < dec.length(); i++) {
            if (row == 0) {
                up = true;
            }
            else if (row == rails - 1) {
                up = false;
            }
            
            if (rail[row][col] != '\n') {
                sb.append(rail[row][col++]);
            }
            
            if (up) {
                row++;
            }
            else {
                row--;
            }
        }
        
        return sb.toString();
    }
}
