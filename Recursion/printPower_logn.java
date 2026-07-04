public class printPower_logn {
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(n%2==0){
            int x_ = printPower(x,n/2);
            return x_*x_;
        }
        else{
            int x_ = printPower(x,n/2);
            return x_*x_*x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int output = printPower(x,n);
        System.out.println(output);
    }
}
