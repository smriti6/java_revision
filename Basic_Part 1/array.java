import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=4;
        // int arr[]={1,2,3,5,6};
        // System.out.println("Before swap array");
        // for(int i=0;i<=n;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.println();
        // System.out.println("After swap");
        // int t=arr[0];
        // arr[0]=arr[arr.length-1];
        // arr[arr.length-1]=t;
        // for(int i=0;i<=n;i++){
        //     System.out.println(arr[i]);
        // }

        // int arr[]={2,3,4,5};
        // System.out.println("original array");
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // int t[]=new int[4];
        // int j=0;
        // for(int i=arr.length-1;i>=0;i--){
        //     t[j]=arr[i];
        //     j++;
        // }
        // System.out.println("After reverse");
        // for(int i=0;i<t.length;i++){
        //     System.out.println(t[i]);
        // }

        //min max element 
        // int arr[]={4,5,6,3,2};
        // int n=arr.length-1;
        // int min=100,max=0;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //     if(arr[i]<min){
        //         min=arr[i];
        //     }
        // }
        // System.out.println("Min = "+min+" max = "+max);

        //find a missing number in array;

        int arr[]=new int [4];
        System.out.println("Enter number in array");
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        int n=arr.length;
        System.out.println();
        System.out.println("Length of array : "+n);
        // int t=((n+1)*(n+2))/2;
        int sum = ((n + 1) * (n + 2)) / 2;
        System.out.println("\n\n total sum of array "+sum);
        for(int i=0;i<n;i++){
            sum-=arr[i];
        }
        System.out.println("Missing number : "+sum);

    }
}
