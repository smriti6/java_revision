import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 integer");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        //int t=?input1:input2(input1,input2);
        if(input1==input2){
            System.out.println(0); //if both number are same return 0;
        }
        else if(input1%6==input2%6){
            System.out.println((input1<input2)?input1:input2); //return smallest number 
        }
        else{
            System.out.println((input1>input2)?input1:input2); //return largest value 
        }
    }
}
