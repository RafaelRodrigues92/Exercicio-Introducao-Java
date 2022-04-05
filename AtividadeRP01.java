//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
package releituraPortugol;

import java.util.Scanner;

public class AtividadeRP01 {

			public static void main(String[] args) {
			
			Scanner	leia = new Scanner(System.in);
			
			int anos, meses, dias, totalDias, diasAnos, diasMeses;
			
			System.out.println("Digite quantos anos você tem em anos, meses, e dias.");
			System.out.println("Anos: ");
			anos = leia.nextInt();
			
			System.out.println("Meses: ");
			meses = leia.nextInt();
			
			System.out.println("Dias: ");
			dias = leia.nextInt();
			
			diasAnos = anos * 365;
			diasMeses = meses * 30;
			totalDias = diasAnos + diasMeses + dias;
			
			System.out.println("Você tem " + totalDias + " dias de vida!");
		}

	}
