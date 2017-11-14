/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package read_url;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Marwis95
 */
public class Read_url {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        URL oracle = new URL("https://bezpiecznyautobus.gov.pl/strona-glowna");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(oracle.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
    }
    
}
