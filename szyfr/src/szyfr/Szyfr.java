/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szyfr;

/**
 *
 * @author Marwis95
 */
public class Szyfr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String slowo = "KRYPTOGRAFIA";
        int len = slowo.length();
        int i;
        char[] t1 = new char[16];
        char[] t2 = new char[16];
        char[] t3 = new char[16];
        int licznik1=0;
        int licznik2=0;
        int licznik3=0;
        
        for (i=0; i<len; i=i+4){
        t1[licznik1]=slowo.charAt(i);
        licznik1=licznik1+1;
        }
        
        for (i=1; i<len; i=i+2){
        t2[licznik2]=slowo.charAt(i);
        licznik2=licznik2+1;
        }
        
        for (i=2; i<len; i=i+4){
        t3[licznik3]=slowo.charAt(i);
        licznik3=licznik3+1;
        }
        
        
        for (i=0; i<licznik1; i++){
            System.out.print(t1[i]);
        }
        
        //System.out.println("");
        
        for (i=0; i<licznik2; i++){
            System.out.print(t2[i]);
        }
        
        //System.out.println("");
        
        for (i=0; i<licznik3; i++){
            System.out.print(t3[i]);
        }
        
                    
        
        
        
    }
    
}
