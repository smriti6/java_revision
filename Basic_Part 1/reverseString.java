import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("REverse String");
        System.out.println("Enter String to reverse");
        String input1=sc.nextLine();

        String ans="";
        for(int i=input1.length()-1;i>=0;i--){
            ans+=input1.charAt(i);
        }
        System.out.println(ans);
    }
}
