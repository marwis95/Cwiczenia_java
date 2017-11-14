package potega;


public class Potega {

    public static int potega(int a, int b){
        if(b<0) return 1;
        else return a*potega(a,b-1);
    }
    
    public static int potega_it(int a, int b){
        int wynik=1;
        if(b<0) return 1;
        else while(b>=0){
            wynik = wynik * a;
            b=b-1;
        }
        return wynik;
    }
    
    public static void main(String[] args) {

        System.out.println(potega(3,3));
        System.out.println(potega_it(3,3));
        
    }
    
}
