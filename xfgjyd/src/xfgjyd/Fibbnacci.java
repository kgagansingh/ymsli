package xfgjyd;

import java.util.Scanner;

public class Fibbnacci {
	static int sum=0;
	static int fib(int n) {
		if(n<=1) return n;
		int res=fib(n-1)+fib(n-2);
		System.out.println(res);
		return res;
	}
	public static void main() {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=fib(n);
		System.out.println(p);
		
	}

}
