import java.io.*;
import java.util.StringTokenizer;

public class odczyt{
public static void main (String args[]){
	
try {
    FileReader fr = new FileReader("a.txt");
    BufferedReader br = new BufferedReader(fr);
			
    FileWriter fw = new FileWriter("b.txt");
			
    String s;
    String a,b;
			
    while ((s = br.readLine()) != null) {
        StringTokenizer wiersz = new StringTokenizer(s," ");
	a=wiersz.nextToken();
	b=wiersz.nextToken();
        System.out.println(b+" "+a);
        fw.write(s+"\r\n"); //zapis z enterem - musza byc oba
        }
    br.close();
    fw.close();
			
    } catch (IOException e) {
                            System.out.println("blad w odczycie pliku");
                            }
	
	
	}
}