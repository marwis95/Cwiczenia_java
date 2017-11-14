package liczby_pierwsze;


public class Liczby_pierwsze {

    public static boolean l_p (int n){
        if(n<2) return false;
        else for(int i=2; i*i<=n; i++){
            if(n%2==0) return false;
        }
    return true; 
    }
    
    public static void main(String[] args) {

        System.out.println(l_p(1));
        
    }
    
}
