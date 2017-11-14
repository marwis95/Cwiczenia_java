package wzniesienia;
import java.util.Random;
 
/**
 *
 * @author Dedo
 */
public class Wzniesienia {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tablica[]=new int [20] ;
        Random random = new Random();
        int i=0;
        int j=0;
        int x=0;
        int licznik=0;
        
        
        for (i=0;i<tablica.length;i++){
            tablica[i] = random.nextInt(10);
        }/////////////////////////////////////////Wypelnienie tab losowymi liczbami
        
        for (i=0;i<tablica.length;i++){
            System.out.print(tablica[i]+" ");
        }////////////////////////////////////////Wypisuje tab dla testu
        
        System.out.println();
        System.out.println();
         
        while(j<tablica.length-2){//Pętla przeleci całą tablice
            i=j+1;// i-obecny element,  j-następny element
            if(tablica[j]<tablica[i]){//sprawdzam czy wystąpiło wzniesienie
                while((i<tablica.length-2)&&(tablica[i]==tablica[i+1])) i++;//sprawdzam "szczyt wzniesienia" takie same cyfry
                if(tablica[i]>tablica[i+1]){//wykrywam koniec wzniesienia
                    licznik=licznik+1;//licznik do numeracji wzniesien
                    System.out.print("Wzniesienie" + licznik + ": ");
                    for(x=j;x<=i+1;x++) System.out.print(tablica[x]+" ");//wypisuje wzniesienie
                    System.out.println();
                    i++;//przesuwam sie o krok dalej w tablicy
                }
            }
        j=i;//przesuwam sie po indeksie
        }
    }
}