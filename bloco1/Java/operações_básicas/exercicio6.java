package operaçõesBásica;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, dist;
		
		System.out.println("Digite as coordenadas do ponto de partida: ");
		x1 = ler.nextDouble();
		x2 =ler.nextDouble();
		System.out.println("Digite as coordenadas do ponto de destino: ");
		y1 = ler.nextDouble();
		y2 = ler.nextDouble();
		
		dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)+2);
		System.out.println("A distância entre os dois pontos é: "+dist);
		
		
	}

}
