package schody_i_progi;
 
/**
 *
 * @author Dedo
 */
public class Schody_i_progi {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int t[] = {2,2,2,3,1,1,3,3,1,10,11,7,7,6,7,7,8,9,9,7};
        int licznik=0;
        int r=t.length;
        for (int i=1;i<r;i++)
        {
            if (t[i-1]>t[i])
                licznik++;
        }
        System.out.println("Liczba progów wynosi: "+licznik);
         
        int j=0;
        int i=0;
        
        while(j<t.length-2){//Pętla przeleci całą tablice
            i=j+1;// i-obecny element,  j-następny element
            if(t[j]>t[i]){//sprawdzam czy wystąpił spadek
                while((i<t.length-2)&&(t[i]>=t[i+1])) i++;//sprawdzam "szczyt wzniesienia" takie same cyfry
                if(t[i]<t[i+1]){//wykrywam koniec wzniesienia
                    licznik=licznik+1;//licznik do numeracji wzniesien
                    System.out.print("Wzniesienie" + licznik + ": ");
                    for(int x=j;x<=i+1;x++) System.out.print(t[x]+" ");//wypisuje wzniesienie
                    System.out.println();
                    i++;//przesuwam sie o krok dalej w tablicy
                }
            }
        j=i;//przesuwam sie po indeksie
        }
        
        
       /* for (int i=1;i<r;i=i+j){
            j=0;
            while (t[i-1+j]>=t[i+j] && j+i<r-1) j++;
             
            if(j>=1){
                System.out.print("Schody do dolu: ");
                for (int x=0;x<=j+1;x++) System.out.print(t[i-1+x]+" ");
                System.out.println("");
            }
            else j++;
            
        }*/
        
        
    
    }  
}