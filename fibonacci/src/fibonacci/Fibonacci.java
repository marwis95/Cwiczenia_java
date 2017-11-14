package fibonacci;

public class Fibonacci {
    
    public static int fibon (int n){
        if (n<=2) return 1;
        else return (fibon(n-2)+fibon(n-1));
    }
    
    public static int fibon_it (int n){
        int f1=1;
        int f2=1;
        int temp=0;
        if (n<=2) return 1;
        else{
            for(int i=3; i<=n; i++){
                temp = f1 + f2;
                f1 = f2;
                f2 = temp;
            }
        }
    return f2;
    }

    public static void main(String[] args) {
        
        System.out.println(fibon(9));
        System.out.println(fibon_it(9));
    }
    
}
