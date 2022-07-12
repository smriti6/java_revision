import java.util.Scanner;

public class result {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        // System.out.println("REsult of following operation");
        // System.out.println( -5 + 8 * 6);
        // System.out.println( (55+9) % 9);
        // System.out.println(20 + -3*5 / 8);
        // System.out.println(5 + 15 / 3 * 2 - 8 % 3);

        // int x=-5 + 8 * 6;
        // int y=(55+9) % 9;
        // int z=20 + -3*5 / 8;
        // int a=5 + 15 / 3 * 2 - 8 % 3;


        //Display product 
        // System.out.println("Display product ");
        // System.out.println(25*5);
        
        // System.out.println("Enter 1st number");
        // int input1=sc.nextInt();
        // System.out.println("Enter 2nd number");
        // int input2=sc.nextInt();
        // int ans=input1*input2;
        // System.out.println("Ans : "+ans);


        //Arthmatic operation 

        // System.out.println("Arthmatinc operations ");
        // System.out.println("Enter 1st number");
        // int input1 = sc.nextInt();
        // System.out.println("Enter 2nd number");
        // int input2 = sc.nextInt();
        // System.out.println(input1+" + "+input2+" = "+(input1+input2));
        // System.out.println(input1+" - "+input2+" = "+(input1-input2));
        // System.out.println(input1+" * "+input2+" = "+(input1*input2));
        // System.out.println(input1+" / "+input2+" = "+(input1/input2));
        // System.out.println(input1+" % "+input2+" = "+(input1%input2));


        //Multiplication table 
        
        // System.out.println("Multiplication table\n");
        // System.out.println();
        // System.out.println("Enter a number of which you want to print table ");
        // int input1 = sc.nextInt();
        
        // for(int i=1;i<=10;i++){
        //     int ans;
        //     ans=input1*i;
        //     System.out.println(input1+" x "+i+" = "+ans);
        // }

        //comparision

        //System.out.println("Comparision between 2 numbers ");
        // System.out.println("Enter 1st number");
        // int input1 =sc.nextInt();
        // System.out.println("Enter 2nd number");
        // int input2 = sc.nextInt();
        // if(input1==input2){
        //     System.out.printf("%d == %d",input1,input2);
        // }
        // if(input1!=input2){
        //     System.out.println(input1+" != "+input2);
        // }
        // if(input1>input2){
        //     System.out.println(input1+" > "+input2);
        // }
        // if(input1<input2){
        //     System.out.printf("%d < %d",input1,input2);
        // }

        //comput sum of digit of integer Eg. int n1=123; ans=1+2+3=6;

        // System.out.println("Add integer");
        // System.out.println("Enter integer ");
        // int input1 =sc.nextInt();
        // int ans=0;
        // while(input1!=0){
        //     ans+=input1%10;
        //     input1/=10;
        // }
        // System.out.println(ans);


        //Print odd numbers from 1 to 100

        for(int i=0;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }



        
    }
}
