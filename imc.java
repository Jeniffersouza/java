package projeto_java;

import java.util.Scanner;

public class imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome: ");
		String nome = ler.next();
		
		
		System.out.println("Digite seu peso: ");
		float peso = ler.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = ler.nextFloat();
		
		
		float imc = peso / (altura * altura);
	
		
		if(imc <= 18.5) {
			System.out.println(nome + " voce esta abaixo do peso");
		} else if(imc >= 18.6 && imc <= 24.9) {
			System.out.println( nome +" voce esta com o peso ideal");
		}else if(imc >= 25.0 && imc <= 29.9 ) {
			System.out.println( nome +" voce esta levemente acima do peso");
		}else if(imc >= 30.0 && imc <= 34.9) {
			 System.out.println(nome + " voce esta com obesidade grau 1");
		}else if(imc >= 35.0 && imc <= 39.9) {
			 System.out.println( nome +" voce esta com obesidade grau 2");
		}else if(imc > 40) {
			System.out.println(" voce está com obesidade grau 3");
		}else {
			System.out.println("digite seus dados");
		}
		
  }
}
