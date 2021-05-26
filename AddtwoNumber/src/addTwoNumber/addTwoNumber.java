package addTwoNumber;
import java.util.Scanner;

public class addTwoNumber {
	static int addTwo(int a,int b) {
		int result=a+b;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = addTwo(a,b);
		System.out.println("Sum of Two number is "+ result);
    }

}
