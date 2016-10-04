import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please input a number as your seed:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.replaceAll("(([^-]+)|(-[^-]+)|(-){2,})([\\D])", "").trim().length() == input.length()) {
            int seed = Integer.valueOf(input);
            Display display = new Display(seed);
            display.ShowMessages();
        } else
            System.out.println("Please enter one integer argument, seed");
    }
}
