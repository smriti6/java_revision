import java.nio.charset.Charset;
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

        // System.out.println("Count diff");
        // String s1="Sam is cool";
        // int total=s1.length();
        // int space=0;
        // for(int i=0;i<s1.length()-1;i++){
        //     if(s1.charAt(i)==' '){
        //         space++;
        //     }
        // }
        // System.out.println("Total : "+total+"  space : "+space);

        //available character set
        // System.out.println("List of available character set");
        // for(String str:Charset.availableCharsets().keySet()){
        //     System.out.println(str);
        // }


        //print ASCII value of character;
        // int c='a';
        // System.out.println(c);
        

        //print current time
        //System.out.format("Current Date & Time : %tc%n\n",System.currentTimeMillis());

        //convert string to int

        String a="34";
        int an=Integer.parseInt(a);
        System.out.println(an);
    }
}
