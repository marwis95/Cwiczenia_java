package silnia;

public class Silnia {
    
    public static int silnia(int n){
        if (n<=1) return 1;
            else return n*silnia(n-1);
    }   
    
    public static int silnia_it(int n){
        int wynik=1;
        if (n<=1) return 1;
        else for(int i=1; i<=n; i++){
            wynik=wynik*i;
        } 
        return wynik;
    }
    
    public static void main(String[] args) {
        
        System.out.println(silnia(5));
        System.out.println(silnia_it(5));

    }
    
}
