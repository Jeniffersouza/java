package projeto_java;

import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		float base, altura, a, b, c;
		
		Scanner teclado = new Scanner(System.in);
		 System.out.println("Digite o tamanho dos 3 lados");
		 a = teclado.nextFloat();
		 b = teclado.nextFloat();
		 c = teclado.nextFloat();
		
		 if (a>=b+c || b>=c+a || c>=a+b) {
	 System.out.println("Nao e triangulo.");
	 }
		 else if (a==b && b==c) {
	 System.out.println("Triangulo equilatero.");
		 }else if (a==b || b==c || c==a) {
	 System.out.println("Triangulo isosceles.");
		 }else {
	 System.out.println("Triangulo escaleno.");
		 }

	}

}
