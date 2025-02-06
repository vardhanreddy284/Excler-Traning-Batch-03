public class Demo060 {
    public static void main(String[] args) {
        int n = 20;
        long[] fib = new long[n];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        
        System.out.println("Fibonacci Series of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
