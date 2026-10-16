import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum=i+sum;

        }

        System.out.println("Sum = " + sum);
    }
}