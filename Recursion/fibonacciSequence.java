public class fibonacciSequence {
    public static void printFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(a + " ");
        int c = a + b;
        printFibonacci(b, c,n-1);
    }
    public static void main(String[] args) {
        printFibonacci(0, 1, 5);
    }
}
