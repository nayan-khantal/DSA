class code {
    static int fibonacci(int n) {
        if (n == 0) return 0; // 0th term
        if (n == 1) return 1; // 1st term

        int a = 0, b = 1; // Start with 0,1
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(0));  // Output: 0
        System.out.println(fibonacci(5));  // Output: 5
        System.out.println(fibonacci(10)); // Output: 55
    }
}
