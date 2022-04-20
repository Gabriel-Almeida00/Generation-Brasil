package operaçõesBásica;
import java.util.Scanner;

public class exercico1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias, emDias;
		
		System.out.println("PROGRAMA QUE TRANSFORMA SUA IDADE EM DIAS");
		System.out.println("Digite suas idade em Anos, meses e dias: ");
		anos = ler.nextInt();
		meses = ler.nextInt();
		dias = ler.nextInt();
		
		emDias = anos*365+meses*30+dias;
		System.out.println("Sua idade em dias é: "+emDias);
		
	}

}
