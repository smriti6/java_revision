public class array {
    public static void main(String[] args) {
        int n=4;
        int arr[]={1,2,3,5,6};
        System.out.println("Before swap array");
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("After swap");
        int t=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=t;
        for(int i=0;i<=n;i++){
            System.out.println(arr[i]);
        }
    }
}
