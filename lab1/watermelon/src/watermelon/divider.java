package watermelon;

import java.util.Scanner;

public class divider {
	
	public static boolean can_be_divided(int num) {
		return num%2==0 && num != 2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int weight = sc.nextInt();
		System.out.print( can_be_divided(weight)? "YES" : "NO" );

	}

}