import java.util.Scanner;
public class Input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String name = sc.next();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        System.out.println("Enter the cgpa :");
        double cgpa = sc.nextDouble();
        System.out.println("Enter the grade :");
        char grade = sc.next().charAt(0);

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Cgpa:"+cgpa);
        System.out.println("Grade:"+grade);
        

    }
}