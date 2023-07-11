import java.util.Random; // import java.util.Random;: This line imports the Random class from the java.util package. The Random class allows us to generate random numbers.

public class CoinFlip { //public class CoinFlip {: This line defines a new class called CoinFlip. Classes are used to encapsulate related data and functions.
    public static void flipNHeads(int n) {
        Random random = new Random();
        int flips = 0;
        int headsInARow = 0;

        while (headsInARow < n) {
            double flip = random.nextDouble();  

            if (flip >= 0.5) {
                System.out.println("Heads");
                headsInARow++;
            } else {
                System.out.println("Tails");
                headsInARow = 0;
            }

            flips++;
        }

        System.out.printf("It took %d flips to flip %d heads in a row.%n", flips, n);
    }

    public static void main(String[] args) {
        flipNHeads(2);
    }
}