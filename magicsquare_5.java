import java.util.Scanner;

public class magicsquare_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the magic square (N must be odd): ");
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println("N must be odd");
            return;
        }

        int[][] magic = new int[N][N];

        int row = N - 1;
        int col = N / 2;
        magic[row][col] = 1;

        for (int i = 2; i <= N * N; i++) {
            if (magic[(row + 1) % N][(col + 1) % N] == 0) {
                row = (row + 1) % N;
                col = (col + 1) % N;
            } else {
                row = (row - 1 + N) % N;
            }
            magic[row][col] = i;
        }

        // Find the maximum number to determine the number of digits
        int maxNumber = N * N;
        int maxDigits = String.valueOf(maxNumber).length();

        // Print the magic square with proper formatting
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int numDigits = String.valueOf(magic[i][j]).length();
                int spacesToAdd = maxDigits - numDigits;
                for (int k = 0; k < spacesToAdd; k++) {
                    System.out.print(" ");
                }
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
