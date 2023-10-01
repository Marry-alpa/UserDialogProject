import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fullName;
        int age;
        char sex;
        String email;
        boolean isWorking;
        String work;
        String profession;
        double salary;
        int yearsOfWorking;
        String company;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, input your full name: ");
        fullName = scanner.nextLine();

        System.out.print("How old are you: ");
        age = scanner.nextInt();

        System.out.print("Your sex (M/F): ");
        sex = scanner.next().charAt(0);

        System.out.print("Please, input your email: ");
        email = scanner.next();

        System.out.print("Do you work? (true/false): ");
        isWorking = scanner.nextBoolean();

        System.out.println("In what area do you work or have worked?: ");
        work = scanner.next();

        System.out.print("What is your profession?: ");
        profession = scanner.next();

        System.out.print("Your salary?: ");
        salary = scanner.nextDouble();

        System.out.print("How many fulls years you work or have worked?: ");
        yearsOfWorking = scanner.nextInt();

        System.out.print("Name of this company is: ");
        company = scanner.next();

        System.out.println(" ");
        System.out.printf("Hello, %s%n", fullName);
        System.out.println("You are: " + sex);
        System.out.println("Your age is: " + age);
        System.out.printf("%s%n", "You work/worked in ".concat(work));
        System.out.println("You work/worked in " + company);
        System.out.println("You are "+profession);
        System.out.println("Email for contact is "+email);
        System.out.println("You have a job: " + isWorking);
        System.out.println("You have been working for "+ yearsOfWorking+" years");
        System.out.println("Your salary is "+ salary);

        System.out.println(" ");
        boolean got = email.contains("@gmail.com");

        String str = new String("Welcome to the system");
        System.out.println(str);
        System.out.println(str.startsWith("Welcome"));
        int index = str.indexOf("l");
        System.out.println(index);
    }
}