public class reverse {
    public static void main(String[] args) {
        System.out.println("hi");
        int n=1234;
        int a=0;
        while(n!=0){
           int t=n%10;
            a=a*10+t;
            n=n/10;
        }
        System.out.println(a);


    }
}
