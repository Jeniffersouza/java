package projeto_java;

import java.util.Scanner;

public class vida {

	public static void main(String[] args) {
		String nome;
		 int ano, dias, semana, hora, segundo, idade, minutos;
		
		 Scanner teclado = new Scanner(System.in);
		 System.out.println("Qual seu nome?");
		 nome = teclado.next();
		
		 System.out.println("Qual sua idade em anos");
		 idade = teclado.nextInt();
		
		 dias = idade * 365;
		 semana = dias * 52;
		 hora = dias * 24;
		 minutos = hora * 60;
		 segundo = minutos *60;
		
		 System.out.println(nome+ " voce ja viveu " +dias+ " dias " +semana+ " semanas, "
		 +hora+ " horas, " +minutos+ " minutos, " +segundo+ " segundos");


	}

}
