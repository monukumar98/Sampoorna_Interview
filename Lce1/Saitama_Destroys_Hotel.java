package Lce1;

import java.util.Scanner;

public class Saitama_Destroys_Hotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int s=sc.nextInt();
		int AT[]= new int [s+1];
		for (int i = 0; i < n; i++) {
			int fi=sc.nextInt();
			int ti=sc.nextInt();
			AT[fi]=Math.max(AT[i], ti);
		}
		int curr_time=0;
		for(int i=s; i>0; i--) {
			curr_time=Math.max(curr_time, AT[i]);
			curr_time++;// left down me gya hai 
		}
		System.out.println(curr_time);
	}

}
