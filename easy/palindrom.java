public class palindrom {
    public static void main(String[] args) {
        System.out.println("PAlindrome number");
        int n=121;
        int o=n;
        int t=0;
        while(n!=0){
            int x=n%10;
            t=t*10+x;
            n=n/10;
        }
        System.out.println(t);
        if(o==t){
            System.out.println("Same");
        }
        else{
            System.out.println("Nope");
        }
    }
}
