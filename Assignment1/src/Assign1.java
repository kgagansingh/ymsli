import java.util.Scanner;

public class Assign1 {
	static void q1() {
		int last = 1, slast = 0;
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int n=20;
		System.out.print(last + " ");
		int sum = 1;
		for (int i = 0; i < n - 1; i++) {
			int curr = last + slast;
			sum += curr;
			System.out.print(curr + " ");
			slast = last;
			last = curr;
		}
		System.out.println("\n" + (float) sum / n);

	}
	static void q2() {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
	
	static void q3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		int arr[]=new int [n];
		int j=0,sum=0;
		for(int i=0;i<n;i++) {
			System.out.print("Enter the grade for student" +(i+1)+": ");
			int x = sc.nextInt();
			if(x<0 || x>100) {
				System.out.println("Invalid grade, try again...");
				i--;
			}
			else{
				arr[j++]=x;
				sum+=x;
			}
		}
		System.out.println("The average is:"+ (float)sum/j);
		
		
	}
	public static void main(String[] args) {
//		q1();
//		q2();
		q3();
	}

}
