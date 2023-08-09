package projeto_java;
import java.util.Scanner;
import lang;


public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, adicao, multiplicacao, divisao, subtracao;
		double potenciacao = (double) Math.pow(2, 2);
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo numero");
		b = ler.nextInt();
		
		adicao = a + b;
		multiplicacao = a * b;
		divisao = a / b;
		subtracao = a - b;
		
		System.out.println("A soma dos numeros e "+adicao);
		System.out.println("A subtracao dos numeros e "+subtracao);
		System.out.println("A multiplicacao dos numeros e "+multiplicacao);
		System.out.println("A divisao dos numeros e "+divisao);
		System.out.println("A potenciacao :"+potenciacao);

	}

}
