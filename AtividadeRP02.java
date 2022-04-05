//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
package releituraPortugol;

import java.util.Scanner;

public class AtividadeRP02 {

	public static void main(String[] args) {
		
		Scanner	leia = new Scanner(System.in);

		int idadeAnos, idadeMeses, idadeDias, totalDias;
		System.out.println("Digite sua idade em dias: ");
		totalDias = leia.nextInt();
		
		idadeAnos = totalDias / 365;
		totalDias = totalDias % 365;
		
		idadeMeses = totalDias / 30;
		totalDias = totalDias % 30;
		
		idadeDias = totalDias;
		
		System.out.println("A idade é: " + idadeAnos + " anos.");
		System.out.println(idadeMeses + " meses.");
		System.out.println("e " + idadeDias + " dias.");


	}

}


		