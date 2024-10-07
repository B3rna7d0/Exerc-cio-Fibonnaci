package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número para ver se contem na lista de fibonacci: ");
		int n = sc.nextInt();
		
		int a = 0, b = 1, c = 0;
		boolean pertence = false;
		
		if (n == a || n == b) {
			pertence = true;
		}
		else {
			while(c < n) {
				
				c = a + b;
				a = b;
				b = c;
				
				if( n == c ) {
					pertence = true;
				}
			}
		}
		if( pertence ) {
			System.out.println("O número informado pertence aos números de fibonacci!");
		} else {
			System.out.println("O número nao pertence aos numeros de fibonacci!");
		}
		sc.close();
	}
}
