import java.util.Scanner;

public class divTwo {
    public static void main(String[] args) {
        System.out.println("Divide 2 numbers");
        System.out.println(30/5);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int input1 =sc.nextInt();
        System.out.println("Enter second number");
        int input2=sc.nextInt();
        int ans=input1/input2;
        System.out.println("Ans : "+ans);
    }  
}
