
import java.util.Scanner;

public  class Problem6{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int sum=0;
        for (int i=0; i<=n; i++){
            if(i%2==0){
            sum +=i;
            }
        }
        System.out.println("Sum="+sum);
    }
}