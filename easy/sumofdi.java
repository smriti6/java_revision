public class sumofdi {
    public static void main(String[] args) {
        System.out.println("Sum of digit in a number ");
        int n=1234;
        int t=0;
        while(n!=0){
            int x=n%10;
            t+=x;
            n=n/10;
        }
        System.out.println(t);
    }
}
