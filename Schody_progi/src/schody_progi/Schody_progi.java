/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schody_progi;

/**
 *
 * @author uczen
 */
public class Schody_progi {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
int tablica[] = {2,2,2,3,1,1,3,3,1,10,11,7,7,6,7,7,8,9,9,7};
int licznik=0;
int len=tablica.length;
int j;


for (int i=1;i<len;i++){
    if (tablica[i-1]>tablica[i])
    licznik++;
    }

System.out.println("Liczba progów wynosi: " + licznik);
System.out.println("Schody do dolu: ");    
        
for (int i=1; i<len; i=i+j){
    j=0;
    while ((tablica[i-1+j]>=tablica[i+j]) && (j+i<len-1)) j++;
            
    if(j>=1){
        for (int x=0;x<=j;x++) System.out.print(tablica[i-1+x]+" ");
                System.out.println("");
        } else j++;
    }
}
}