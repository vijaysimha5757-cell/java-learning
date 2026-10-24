import java.util.Scanner;
public class Inputandoperator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        System.out.println("sum="+(a+b));
        System.out.println("difference="+(a-b));
        System.out.println("multiplication="+(a*b));
        System.out.println("division="+(a/b));
        System.out.println("reminder="+(a%b));
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a==b);
        System.out.println(a != b);
    }
}