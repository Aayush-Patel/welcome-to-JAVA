package Chapter9;

import java.util.Random;

/**
 * Name Aayush Patel
 * Date August 21 2023
 * *9.4 (Use the Random class) Write a program that creates a Random object with seed
 * 1000 and displays the first 50 random integers between 0 and 100 using the
 * nextInt(100) method.
 */
public class C9P4 {
	private static final int seed = 1000;
    private static final int n = 100;

    public static void main(String[] args) {
        Random random = new Random(seed);
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0) System.out.println();

            System.out.print(random.nextInt(n) + " ");

}
}
}