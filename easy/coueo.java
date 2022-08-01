public class coueo {
    public static void main(String[] args) {
        System.out.println("Count number of even odd number in a number ");
        int n=123;
        int t=0,e=0,o=0;
        while(n!=0){
            int x=n%10;
            if(x%2==0){
                e++;
            }
            else{
                o++;
            }
            n=n/10;
        }
        System.out.println("Count of even : "+e+" \tCount of Odd : "+o);

    }
}
