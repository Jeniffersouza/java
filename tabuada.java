package projeto_java;
import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int numero, i = 0, multi;
		 
		 System.out.println("Que tabela voce deseja visualizar");
		 
		 Scanner ler = new Scanner(System.in);
		 numero = ler.nextInt();
		
		
		 for(i = 0; i <=10; i++) {
		 	multi= numero * i;
		 	System.out.println("A tabuada do " + numero + " x " + i + " e " + multi);
		 }
	 
	}

}
