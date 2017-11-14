/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matura_2012;
import java.util.StringTokenizer;
import java.io.*;


public class Matura_2012 {

    public static void main(String[] args) {
        
        String[] slowa = new String[120];
        String[] klucze = new String[120];
        int licznik_tab=0;
        
        try{
            FileReader fr = new FileReader("tj.txt");
            BufferedReader br = new BufferedReader(fr);
            FileReader fr2 = new FileReader("klucze1.txt");
            BufferedReader br2 = new BufferedReader(fr2);
            
            String s,a,b;
            
            while((s = br.readLine())!=null){
                StringTokenizer wiersz = new StringTokenizer(s, " ");
                a = wiersz.nextToken();
                slowa[licznik_tab] = a;
                licznik_tab++;
                //System.out.println(a);
            }
            licznik_tab = 0;
            while((s = br2.readLine())!=null){
                StringTokenizer wiersz = new StringTokenizer(s, " ");
                a = wiersz.nextToken();
                klucze[licznik_tab] = a;
                licznik_tab++;
                //System.out.println(a);
            }
               
            
        }catch (IOException e){System.out.println("ERROR");}
        
        char litera_slowo, litera_klucz;
        int ascii_slowo, ascii_klucz, ascii_out;
        String slowo_out="";
        String klucz_temp;
        
        for (int i = 0; i<120 ; i++){
            for(int j=0; j<slowa[i].length(); j++){
                
                klucz_temp = klucze[i] + klucze[i] + klucze[i] + klucze[i] + klucze[i] + klucze[i] + klucze[i]; 
                litera_slowo = slowa[i].charAt(j);
                ascii_slowo = litera_slowo;
                
        
                litera_klucz = klucz_temp.charAt(j);
                ascii_klucz = litera_slowo;
                
                ascii_out = ascii_slowo + (litera_klucz-64);
                if(ascii_out > 90) ascii_out = ascii_out -26;
                
                char znak_out = (char) ascii_out;
                
                slowo_out = slowo_out + znak_out;
                
            }
            System.out.println(slowo_out);
            slowo_out = "";
        } 
        
        /*char litera='A';
        int numer = litera;
        System.out.println(numer-);*/
        
    }
    
}
