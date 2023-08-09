package projeto_java;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		float salario, total = 0, media = 0;;
		 int i;
		
		 Scanner ler = new Scanner(System.in);
		 
		 for(i=1; i < 11; i++) {
		 	System.out.println("Digite o "+i+ " salario");
		 	salario = ler.nextFloat();
		 	total = salario + total;
		 	System.out.println("Salario " +i+ " e R$"+salario);
		 }
		 media = total / 10;
		 System.out.println("A soma total dos salarios e "+total+ " e a media dos salarios e "+media);
	}

}
