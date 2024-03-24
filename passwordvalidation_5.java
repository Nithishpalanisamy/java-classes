import java.util.Scanner;

public class passwordvalidation_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;
        boolean isValid;

        do {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
            isValid = isValidPassword(password);

            if (!isValid) {
                System.out.println("Invalid password. Please try again.");
            }
        } while (!isValid);

        System.out.println("Password accepted.");
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 7) {
            return false;
        }

        boolean hasUpper = !password.equals(password.toLowerCase());
        boolean hasLower = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");

        return hasUpper && hasLower && hasDigit;
    }
}
