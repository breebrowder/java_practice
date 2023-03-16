import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, I'd like to learn more about you!");

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.print("Please enter your age: ");
        String age = scan.nextLine();
        System.out.println("I understand that you are " + age);
        System.out.print("Are you a software developer?: ");
        String answer = scan.nextLine();
        System.out.println("That is great, I love your answer of " + answer);
        System.out.print("What are your favorite coding languages?: ");
        String lang = scan.nextLine();
        System.out.println("With practice, you'll master these in no time... " + lang);
        System.out.println("Goodbye!");
        scan.nextLine();
        scan.close();
    }
}