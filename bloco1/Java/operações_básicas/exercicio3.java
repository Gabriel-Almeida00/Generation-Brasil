package operaçõesBásica;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tempo, hr, min, seg, rest;
		
		System.out.println("Qual o tempo do evento em segundos: ");
		tempo = ler.nextInt();
		
		hr = tempo/3600;
		rest = tempo%3600;
		min = rest/60;
		seg = rest%60;
		
		System.out.println("O tempo do evento é "+hr+" horas "+min+" minutos e "+seg+" segundos");
		

	}

}
