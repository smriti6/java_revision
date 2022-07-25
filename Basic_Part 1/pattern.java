public class pattern {
    public static void main(String[] args) {
        // int t=0,z;
        // for(int i=0;i<5;i++){
        //     for(int j=i;j<5;j++){
        //         System.out.print(" ");
        //     }
        //     z=t;
        //     for(int k=0;k<i;k++){
                
        //         System.out.print(z+" ");
        //         z++;
        //     }
        //     System.out.println();
        //     t++;
        // }

        System.out.println();

        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||i==n-1||j==n-1||j==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println("\n\n\n");

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                if(i==n-1||j==0){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }


        System.out.println("\n\n\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


       
    }
}
