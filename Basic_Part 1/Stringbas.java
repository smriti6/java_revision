import java.util.Scanner;

public class Stringbas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //reverse string 

        // System.out.println("REverse String");
        // System.out.println("Enter String to reverse");
        // String input1=sc.nextLine();
        // String ans="";
        // for(int i=input1.length()-1;i>=0;i--){
        //     ans+=input1.charAt(i);
        // }
        // System.out.println(ans);

        //count

        System.out.println("Count diff");
        String s1="Sam is cool";
        int total=s1.length();
        int space=0;
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)==' '){
                space++;
            }
        }
        System.out.println("Total : "+total+"  space : "+space);
    }
}
