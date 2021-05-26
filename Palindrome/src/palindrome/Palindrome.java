package palindrome;
import java.util.Scanner;

public class Palindrome {
	static boolean isPalindrome(String str) {
		int i=0;
		int j= str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		i++;
		j--;
		}
		return true;
	}
	
	public static void main(String args[]) {
		Scanner myStr = new Scanner(System.in);
		String str = myStr.nextLine();
		if(isPalindrome(str)) {
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not palindrome");
		} 
	}
 }
