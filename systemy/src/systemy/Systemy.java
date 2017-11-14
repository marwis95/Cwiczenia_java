/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemy;

import java.util.Random;


/**
 *
 * @author Marwis95
 */
public class Systemy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Random random = new Random();
                int tablica[]=new int [20] ;
                
                int liczba = random.nextInt(255);
                System.out.println(liczba);
                
                String liczba_str;
                liczba_str = Integer.toString(liczba,2);
                System.out.println(liczba_str);////////////DEC TO BIN
                
                liczba = Integer.parseInt(liczba_str, 2);
                System.out.println(liczba);////////////////BIN TO DEC
    }
    
}
