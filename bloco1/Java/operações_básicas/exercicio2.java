package opera��esB�sica;
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
		
		System.out.println("Voc� tem "+emAnos+" anos, "+emMeses+" meses e "+emDias+" dias");
		

	}

}
