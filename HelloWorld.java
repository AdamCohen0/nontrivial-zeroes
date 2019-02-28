public class HelloWorld {
    
    public static void main(String[] args) {
        String message = "Hello, world!";
        System.out.println(message);
    }

    public static void divideOut(int a, int n) {
       if (a % n == 0)
           return 0;
           return 1 + divideOut(a / n, n);
    }
}
