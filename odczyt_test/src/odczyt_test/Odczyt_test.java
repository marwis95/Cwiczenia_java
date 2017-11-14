/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odczyt_test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
/**
 *
 * @author Marwis95
 */
public class Odczyt_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        try{//Całą procedurę odczytu "obejmuję" w TRY CATCH (jeżeli plik nie istnieje to otrzymam bląd)
        
            FileReader fr  = new FileReader("xyz.txt");//Ładowanie pliku
            BufferedReader br = new BufferedReader(fr);//Ładowanie pliku
            FileWriter fwb = new FileWriter("inicjal.txt");  //Zapis do pliku
            FileWriter fwb2 = new FileWriter("rosnace.txt");  //Zapis do pliku
            FileWriter fwb3 = new FileWriter("duze.txt");  //Zapis do pliku
            
            String s,a,b;//Stringi potrzebne do wczytywania z pliku
            String a_lower,inicjal;//Stringi pomocnicze które używam w zadaniach
            int i,licznik=0;
            boolean czy_asci = false;//Zmienna do zapamiętania czy imie jest rosnace
            
            while((s = br.readLine()) != null ){//Pętla przeleci cały plik textowy i pojedynczą linijkę wstawia do zmiennej "S"
                StringTokenizer wiersz = new StringTokenizer(s, " ");//Funkcja rozdziela string "S" po spacji ---> " "
                a = wiersz.nextToken();//Wczytuje pierwszy wyraz (imie)
                b = wiersz.nextToken();//Wczytuje drugi wyraz(nazwisko)
                
                a_lower = a.toLowerCase();//Zmieniam imie na pisane małymi literami alby porównać pierwszą i ostatnią 
                                          //("Anna" -> "anna" gdybym nie zmienił porównało by sie "A" i "a" czyli FALSE)
                
                if(a_lower.charAt(0) == a_lower.charAt(a_lower.length()-1)) System.out.println(a + " " +b);
                //Sprawdzam pierwsza literę i ostatnią (pamiętaj że znaki numeruje sie od zera więc długość-1 to ostatni znak)
                
                
                inicjal = (a.charAt(0) + "." + b.charAt(0) + ".");
                //Sklejam stringa z inicjałem (ZEROWY znak imienia + kropka + ZEROWY znak nazwiska + kropka)
                
                fwb.write(inicjal+"\r\n");//Zapis do pliku strnga "inicjał" (r\n\ oznacza przejście do nowej linijki)
                
                
                for (i=0; i<a.length()-1; i++){ //Sprawdzam całe imie litera po literze
                    if ( (int) a.charAt(i) < (int) a.charAt(i+1)) czy_asci = true; //Sprawdzam czy poprzedni znak jest mniejszy od obecnego
                    else {//Jak jest mniejszy to zwracam TRUE
                            czy_asci = false;//Jeżeli nie jest to zwracam FALSE i już dalej nie sprawdzam (break)
                            break;
                            }
                }
                
                if (czy_asci == true) fwb2.write(s+"\r\n");
                 
                fwb3.write(s.toUpperCase() + "\r\n");//Zapisuje imie dużymi znakami (zad5)
                
                if (a.length() == 5) licznik=licznik+1;//Zliczam imiona 5-cio literowe (zad 6)
                
            }
             
            System.out.println("Ilosc imion 5-cio literowych: " + licznik);
            
            
            br.close();
            fwb3.close();
            fwb2.close();
            fwb.close();//PAMIĘTAJ O ZAMKNIĘCIU PLIKÓW
  
        }catch (IOException e){System.out.println("ERROR KURWA");}//Łapanie błędu odczytu
     
}
}