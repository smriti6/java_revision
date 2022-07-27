import java.util.Scanner;

import javax.swing.InputMap;

public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter 2 integer");
        // int input1=sc.nextInt();
        // int input2=sc.nextInt();
        // //int t=?input1:input2(input1,input2);
        // if(input1==input2){
        //     System.out.println(0); //if both number are same return 0;
        // }
        // else if(input1%6==input2%6){
        //     System.out.println((input1<input2)?input1:input2); //return smallest number 
        // }
        // else{
        //     System.out.println((input1>input2)?input1:input2); //return largest value 
        // }

        // System.out.println("Positive or negative number");
        // int input1=sc.nextInt();
        // if(input1>0){
        //     System.out.println("Number is positive");
        // }
        // else {
        //     System.out.println("Number is negative");
        // }

        // System.out.println("Even or odd ");
        // int input1 =sc.nextInt();
        // if(input1%2==0){
        //     System.out.println("Even number");
        // }
        // else {
        //     System.out.println("Odd number");
        // }

        // System.out.println("Sum of natural number");
        // int input1=sc.nextInt();
        // int ans=0;
        // for(int i=1;i<=input1;i++){
        //     ans+=i;
        // }
        // System.out.println("Sum is : "+ans);

        System.out.println("Sum of all in given ranga");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int ans=0;
        for(int i=input1;i<=input2;i++){
            ans+=i;
        }
        System.out.println("Sum is : "+ans);

        //method 2
        int num1=12;
        int num2=15;
        int s=num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
        System.out.println(s);

    }
}
