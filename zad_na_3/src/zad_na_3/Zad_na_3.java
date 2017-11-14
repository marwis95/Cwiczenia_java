/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad_na_3;




public class Zad_na_3 {

    public static int fibon (int n){
        int f1=1, f2=1, temp=0, suma=2;
        if (n<=2) return 1;
        else{
            for(int i=3; i<=n; i++){
                temp = f1 + f2;
                f1 = f2;
                f2 = temp;
                suma = suma + f2;
            }
        }
    return suma;
    }
    
    public static boolean l_p (int n){
        if(n<2) return false;
        else for(int i=2; i*i<=n; i++){
            if(n%2==0) return false;
        }
    return true; 
    }
    
    public static int potega(int a, int b){
        if(b<=0) return 1;
        else return a*potega(a,b-1);
    }


    
    public static void main(String[] args) {
        int pierwsze=0, int_x, a=5, b=3;
        String x = "23660135";
        
        System.out.print("Liczby pierwsze: ");
        for(int i=0; i<x.length(); i++){
            int_x = Character.getNumericValue(x.charAt(i));
            if (l_p(int_x)==true){
                System.out.print(int_x);
                pierwsze = pierwsze + 1;
            }  
        }
       System.out.println(" (" + pierwsze + ")");
       System.out.println(""); 
       System.out.println("Suma ciagu: " + fibon(10));
       System.out.println("");
       System.out.println("Potega " + a + "^" + b + "=" + potega(a,b));
    }
    
}
