package operaçõesBásica;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num1, num2, num3, media;
		
		System.out.println("Digite suas notas: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		media = (num1*2+num2*3+num3*5)/10;
		
		System.out.println("Sua média é "+media);
		

	}

}
