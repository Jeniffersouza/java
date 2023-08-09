package projeto_java;

import java.util.Scanner;

public class numero_randomico {

	public static void main(String[] args) {
		int palpite = 0;
		 double rand = Math.random()*10;
		 
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Random Number:" + Math.round(rand));
		
		 System.out.println("Adivinhe o numero de 1 a 10");
		 System.out.println("Caso queira encerrar o programa digite -1");
	 	
		 while (palpite != Math.round(rand)) {
	 System.out.print("Digite seu palpite: ");
	 palpite = teclado.nextInt();
	
	 if (palpite == -1) {
	 System.out.println("Jogo encerrado");
	 break;
	 } else if (palpite == Math.round(rand)){
	 System.out.println("Parabens! Você acertou!");
	 break;
	 } else if (palpite < Math.round(rand)) {
	 System.out.println("Tente um numero maior.");
	 } else if (palpite > Math.round(rand)) {
	 System.out.println("Tente um numero menor.");
	 } else if (palpite == Math.round(rand)){
	 System.out.println("Parabens! Voce acertou!");
	 break;
	 } else {
	 	System.out.println("digite um numero entre 1 e 10.");
	 }

	}

}
}