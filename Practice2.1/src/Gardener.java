/**
 * @author Dasha Tyshchenko
 * @category practice 1.2
 * @File Gardener.java
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class Gardener {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out, true);
		while (in.hasNextInt()) {
			int i = in.nextInt(); // к-ть €рус≥в
			out.println(count(i));
		}
	}

	private static int count(int j) {
		return (j * (j + 1) + 1);
	}

}
