
/*@Author ChittiBabu - Number Guessing Game Project
 The program will generate a random number between 1 and 100.
 The player inputs his/her guess and the program will respond with "Too higher",
 "Too lower" or "Congratulations! You got it.." accordingly.
 */

import java.util.*;

public class NumberGuessingGame {
	public static int number() {
		Random random = new Random();
		int n = random.nextInt(100) + 1;
		return n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		int genNo = number();
		for (i = 0; i < 5; i++) {
			System.out.print("Enter a number from (1-100): ");
			int n = sc.nextInt();
			if (n > genNo)
				System.out.println("Too High!");
			else if (n < genNo)
				System.out.println("Too Low!");
			else if (n == genNo) {
				System.out.println("Congratulations! You got it!");
				break;
			}
			System.out.println((4 - i) + " tries remaining");
		}
		sc.close(); // Closing Scanner class

		if (i == 5)

			System.out.println("You have exhausted your 5 trials.");
		System.out.println("-----Game Over-Try Again-----");
		System.out.println("The number was :" + genNo);
	}

}
