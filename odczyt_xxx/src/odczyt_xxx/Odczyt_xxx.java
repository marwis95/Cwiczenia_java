/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odczyt_xxx;
import java.util.StringTokenizer;
import java.io.*;

/**
 *
 * @author Marwis95
 */
public class Odczyt_xxx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("xyz.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("out.txt");
            
            String s,a,b;
            
            while ((s = br.readLine())!=null){
                StringTokenizer wiersz = new StringTokenizer(s, " ");
                a = wiersz.nextToken();
                b = wiersz.nextToken();
                System.out.println(a + " " + b);
                fw.write(a + "    " + b + "\r\n");
            }
            fr.close();
            fw.close();
            
        }catch (IOException e){System.out.println("err");}
        
    }
    
}
