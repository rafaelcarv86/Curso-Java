package enquanto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		while(x != 0) {
			System.out.println("Não era zero");	
			soma = soma + x;
			x = sc.nextInt();
			
		}
		
		System.out.println(soma);	
		
		sc.close();
		

	}

}
