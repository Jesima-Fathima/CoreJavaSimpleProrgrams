package adjacentElementsProduct;
import java.util.Scanner;
public class AdjacentElementsProduct {
	static int adjacentElementsProduct(int[] arr) {
		int result = -10000;
		int curProduct;
		for(int i =0;i<arr.length -1;i++) {
			curProduct = arr[i]*arr[i+1];
			if(curProduct>result) {
				result=curProduct;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(adjacentElementsProduct(arr));
    }

}
