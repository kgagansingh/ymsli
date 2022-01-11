//pascal triangle

package xfgjyd;

import java.util.Scanner;

class Gagan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n + 1][n + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0) {
					a[i][j] = 1;
				} else if (j == 0) {
					a[i][j] = 1;
				} else if (i == j) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
				}

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

}
