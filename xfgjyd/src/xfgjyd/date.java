//Next date
package xfgjyd;

import java.util.Scanner;

public class date {
	static boolean isLeap(int y) {
		if (y % 100 == 0 && y % 400 == 0)
			return true;
		if (y % 100 != 0 && y % 4 == 0)
			return true;
		return false;
	}

	static int month(int m, int y) {
		if (m == 2 && isLeap(y))
			return 29;
		if (m == 2)
			return 28;
		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			return 31;
		return 30;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		d += 1;
		if (d > month(m, y)) {
			d = 1;
			m = m + 1;
			if (m > 12) {
				m = 1;
				y += 1;
			}
		}
		System.out.println(d + " - " + m + " - " + y);

	}

}
