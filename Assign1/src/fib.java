//package assign1;
public class fib {

	public static void main(String[] args) {

		int a = 0, b = 1;
		int i = 0;
		int sum=1;
//		int n
		System.out.println(a + " ");
		while (i < 5) {
			int curr = a + b;
			System.out.println(curr+" ");
			a = b;
			b = curr;
			sum+=curr;
			i++;
		}
		

	}
}
