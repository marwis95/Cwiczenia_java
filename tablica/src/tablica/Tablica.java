/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tablica;
import java.util.Random;

        
 
/**
 *
 * @author Marwis95
 */
public class Tablica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int stopien = 8;/////////////////////////TU PODAJ STOPIEN WIEŻY
        int wieza[][] = new int[stopien][];
        int i,j,i_max=0,j_max=0;
        Random random = new Random();
        int suma=0, ilosc=0, max=0;
        
        for(i = 0 ; i < wieza.length ; i++ ){
            wieza[i] = new int[i + 1];
        }//tworzę wieze
        
        

        for(i = 0 ; i < wieza.length; i++){
            for(j = 0 ; j < wieza[i].length; j++){
                wieza[i][j] = 0;
            }
        }//Wypełniam zerami 
        
        for(i = 0 ; i < wieza.length; i++){
            for(j = 0 ; j < wieza[i].length; j++){
                wieza[i][j] = random.nextInt(10);//Wypełniam losowymi
                suma=suma+wieza[i][j]; ////////////SUMOWANIE ELEMENTÓW
                ilosc=ilosc+1;/////////////////////ZLICZAM ILOSC ELEMENTOW
                if(wieza[i][j]>max){///////////////SZUKAM MAXA I JEGO POZYCJI
                    max=wieza[i][j];
                    i_max=i;
                    j_max=j;
                }
            }
        }
        
        
        for(i = 0 ; i < wieza.length; i++){
            for(j = 0 ; j < wieza[i].length; j++){
                System.out.print(wieza[i][j] + " ");
            }
        System.out.println();
        }////////////////////////////////////////////WYPISYWANIE TABLICY
        
        System.out.println();
        System.out.println();
        System.out.println("Średnia: " + suma/ilosc);
        System.out.println("Najwiekszy element to: " + max + " jest on na pozycji: " + i_max + " " + j_max);
         
        
    }
    
}
