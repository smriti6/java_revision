public class swap {
    public static void main(String[] args) {
        int n1=5;
        int n2=10;
        System.out.println("Before swap");
        System.out.println(n1+" "+n2);
        int t=n1;
        n1=n2;
        n2=t;
        System.out.println("After swap");
        System.out.println(n1+" "+n2);
    }
}
