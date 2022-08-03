public class fibo {
    public static void main(String[] args) {
        System.out.println("Fibonachi series");
        int n=10;
        int a=0,b=1;
        int t=0;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            t=a+b;
            System.out.print(t+" ");
            // a=b;
            // b=t;
            a=b;
            b=t;
            
        }
        
    }
}
