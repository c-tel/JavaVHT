/**
 * @author Dasha Tyshchenko
 * @category practice 1.2
 * @File Rabbit.java
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class Rabbit {
	private static int rabb;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		while (in.hasNextInt()) {
			int i = in.nextInt(); // month
			int j = in.nextInt(); // eaten rabbits
			// out.println(count(i, j));
			rabb = 1;
			rabb = count(i, j);
			out.println(rabb);
		}
	}

	private static int count(int i, int j) {
		for (int m = 0; m <= i; m++) {
			if (j < rabb) {
				rabb -= j;
			}
			// System.out.println(rabb + "after");
			if (m > 0) {
				rabb *= 2;
			}
			// System.out.println(rabb + "before");
		}

		return rabb;
	}

}
