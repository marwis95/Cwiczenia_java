package nwd;

public class NWD {
    
    public static int nwd (int a, int b){
        if (a==b) return a;
            else if (a<b) return nwd(a,b-a);   
                else return nwd(a-b,b);
    }
    
    public static int nwd_it (int a, int b){
        if (a==b) return a;
        else while(a!=b){
            if(a<b) b=b-a;
                else a=a-b;
        }
        return a;
    }

    public static void main(String[] args) {
    System.out.println(nwd(24,18));
    System.out.println(nwd_it(24,18));
    }
    
}
