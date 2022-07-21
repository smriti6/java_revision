public class swap {
    public static void main(String[] args) {
        System.out.println("Swap 2 numbers ");
        int n1=4;
        int n2=2;
        System.out.println("Before swaping of number "+n1 +" "+n2);

        //method 1      Using 3rd variable
        // int t=n1;
        // n1=n2;
        // n2=t;
        // System.out.println("After swaping of number "+n1 +" "+n2);

        //method 2      arthmatic operation

        // n1=n1+n2;
        // n2=n1-n2;
        // n1=n1-n2;
        // System.out.println("After swaping of number "+n1 +" "+n2);


        //method 3      bitwise XOR
        // n1=n1^n2;
        // n2=n1^n2;
        // n1=n1^n2;
        // System.out.println("After swaping of number "+n1 +" "+n2);


        //method 4 numeric

        
        n2=n1+n2-(n1=n2);
        System.out.println("After swaping of number "+n1 +" "+n2);
    }
}