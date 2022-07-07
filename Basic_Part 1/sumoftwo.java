import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args) {
        System.out.println("Add 2 numbers");
        System.out.println(2+1);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int input1=sc.nextInt();
        System.out.println("Enter 2nd number");
        int input2=sc.nextInt();
        System.out.println("Ans : "+(input1+input2));
    }
}
