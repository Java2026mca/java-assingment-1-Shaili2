import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) return;

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            // Print current Fibonacci number
            System.out.print(a);

            // Avoid trailing space
            if (i < n - 1) {
                System.out.print(" ");
            }

            // Generate next number
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}