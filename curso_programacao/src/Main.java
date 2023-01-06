import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		double b, B, h, area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B)/ 2.0 * h;
		
		System.out.println(area);
		
		
		int a;
		double c;
		a = 5;
		c = 2 * a;
		
		System.out.println(a);
		System.out.println(c);
		
		
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		


		
	}

}
