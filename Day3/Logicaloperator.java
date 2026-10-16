import java.util.Scanner;
public class Logicaloperator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age >=18 && age<=60){
            System.out.println("Eligible");
        }
    }
}