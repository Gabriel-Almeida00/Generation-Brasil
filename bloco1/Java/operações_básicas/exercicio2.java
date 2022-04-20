package operaçõesBásica;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int dias, emAnos, emMeses, emDias, resto;
		
		System.out.println("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		emAnos = dias/365;
		resto = dias%365;
		emMeses = resto/30;
		emDias = resto%30;
		
		System.out.println("Você tem "+emAnos+" anos, "+emMeses+" meses e "+emDias+" dias");
		

	}

}
