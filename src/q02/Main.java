// TODO: Print Pascal's Triangle for n rows :
import java.util.Scanner;
public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (n): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // Print spaces for alignment
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            // Print numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
        sc.close();
    }
}
        //       Values on each row separated by single space
        //       No leading or trailing spaces
        //
        // Input: 5
        // Output:
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1

    }
}
