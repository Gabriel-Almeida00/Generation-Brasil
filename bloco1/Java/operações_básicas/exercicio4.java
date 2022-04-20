package operaçõesBásica;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double num1, num2, num3, d, r, s;
		
		System.out.println("Digite três números: ");
		num1 = ler.nextDouble();
		num2 = ler.nextDouble();
		num3 = ler.nextDouble();
		
		r = Math.pow(num1+num2, 2);		
		s = Math.pow(num2+num3, 2);
		d = (r + s) / 2;
		
		System.out.println(d);
		
	}
}
