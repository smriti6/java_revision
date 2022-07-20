public class array {
    public static void main(String[] args) {
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

        int arr[]={2,3,4,5};
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        int t[]=new int[4];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            t[j]=arr[i];
            j++;
        }
        System.out.println("After reverse");
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }
    }
}
