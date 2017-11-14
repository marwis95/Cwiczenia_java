package odczytzapis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;


public class Odczytzapis {

public static void main(String[] args) {
try {
    FileReader fr = new FileReader("slowa1.txt");
    BufferedReader br = new BufferedReader(fr);
    FileWriter fwb = new FileWriter("b.txt");
			
    String s;
			
    while ((s = br.readLine()) != null) {
        System.out.println(s);
        fwb.write(s+"\r\n");
        }
    br.close();
    fwb.close();
			
    } catch (Exception e) {
                            System.out.println("blad w odczycie pliku");
                            }
        
        
    }
    
    
    public static String cezar(String a,int k){
        String b="";
        int zakod;
        for (int i=0;i<a.length();i++){
            if((int)a.charAt(i)+k>(int)'Z') zakod=(int)a.charAt(i)+k-(int)'Z'+(int)'A'-1;
            else zakod=(int)a.charAt(i)+k;
            
            b=b+(char)zakod;
        }
        
        return b;
    }
}
