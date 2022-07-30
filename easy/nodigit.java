public class nodigit {
    public static void main(String[] args) {
        System.out.println("Count number of digit in a number");
        int n=1234;
        int a=0;
        while(n!=0){
            int x=n%10;
            a++;
            n=n/10;
        }
        System.out.println(a);
    }
}
