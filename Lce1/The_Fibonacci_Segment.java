package Lce1;

import java.util.Scanner;

public class The_Fibonacci_Segment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(maximum_length(arr));
	}

	public static int maximum_length(int[] arr) {
		int n = arr.length;
		if (n <= 2) {
			return n;

		}
		int ans = 2;
		int curr_Segment = 2;
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] == arr[i - 1] + arr[i - 2]) {
				curr_Segment++;
			} else {
				curr_Segment = 2;
			}
			ans = Math.max(ans, curr_Segment);
		}
		return ans;

	}

}
