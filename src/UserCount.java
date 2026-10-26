import java.util.Scanner;

public class UserCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();

        System.out.print("Type a positive integer: ");
        int n = input.nextInt();

        System.out.println("\nUp count: ");
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

        System.out.println("\nCountdown:");
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println("\nName exhibition:");

        if (name.length() > 6) {
            for (int i = 0; i < n; i++) {
                System.out.println(name);
            }
        } else {
            System.out.println(name);
        }

        input.close();
    }
}