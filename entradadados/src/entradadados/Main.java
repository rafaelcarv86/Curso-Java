package entradadados;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1;
		String x;
		int y;
		double z;
		
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		sc.nextLine();
		s1 = sc.nextLine();
		
		System.out.println("Voce digitou:");
		System.out.println(s1);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	

		
		sc.close();

	}

}
