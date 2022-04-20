package operaçõesBásica;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a,b,c,d,e,f,x,y;
		
		System.out.println("Entre com os valores de A, B, C, D, E e F: ");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		d = ler.nextDouble();
		e = ler.nextDouble();
		f = ler.nextDouble();
		
		x=(c*e-b*f)/(a*e-b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.println("Os valores de X e Y são respectivamente: "+x+" e "+y);
	}

}
