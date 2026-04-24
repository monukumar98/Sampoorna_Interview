package Lce2;

import java.util.*;
public class Two_Arrays_and_Sum_of_Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		Integer[] b = new Integer[n];
		long mod = 998244353;
		for (int i = 0; i < n; i++) {
			long x = sc.nextLong();
			a[i] = x * (i + 1) * (n - i);
		}
		for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		long ans = 0;
		for (int i = 0; i < n; i++) {
			ans = (ans + (a[i] % mod) * b[i]) % mod;
		}
		System.out.println(ans);

	}

}
