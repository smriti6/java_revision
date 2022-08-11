public class sumarr {
    public static void main(String[] args) {
        System.out.println("Sum of all array");
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int a=0;
        for(int i=0;i<n;i++){
            a+=arr[i];
        }
        System.out.println(a);

        int f=3;
        for(int i=0;i<n;i++){
            if(f==arr[i]){
                System.out.println("found at "+i);
            }
            
        }
    }
}
