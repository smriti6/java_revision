public class pattern {
    public static void main(String[] args) {
        int t=0,z;
        for(int i=0;i<5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            z=t;
            for(int k=0;k<i;k++){
                
                System.out.print(z+" ");
                z++;
            }
            System.out.println();
            t++;
        }
    }
}
