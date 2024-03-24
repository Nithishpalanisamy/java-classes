import java.util.Scanner;

class prime_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] tot_primes = new int[50];
        int count = 0;
        int i = 2;
        while (count < 50) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                tot_primes[count] = i;
                count++;
            }
            i++;
        }
        for (int index = 0; index < tot_primes.length; index++) {
            System.out.println(tot_primes[index]);
        }

    }
}
