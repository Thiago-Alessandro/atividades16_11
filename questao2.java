package atividade16_11;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
		
		int matriz1 [][] = new int [4][4], matriz2 [][] = new int [4][4];
		int maiorValorMatriz [][] = new int [4] [4];
		
		Scanner teclado = new Scanner (System.in);
		
		for (int l = 0; l < 4; l++) {
			
			for (int c = 0; c < 4; c++) {
				
				System.out.print("Insira o valor da linha: " + l + " coluna: " + c + " da primeira matriz: ");
				matriz1[l][c] = teclado.nextInt();
				
				System.out.print("Insira o valor da linha: " + l + " coluna: " + c + " da primeira matriz: ");
				matriz2[l][c] = teclado.nextInt();
				
			}
		}
		
		for (int l = 0; l < 4; l++) {
			
			for (int c = 0; c < 4; c++) {
				
				
				if (matriz1[l][c] > matriz2[l][c]) {
					
					maiorValorMatriz[l][c] = matriz1[l][c];
				}
				else {
					maiorValorMatriz[l][c] = matriz2[l][c];
				}

				System.out.println("O maior valor da linha: " + l + " coluna: " + c + " dentre as duas matrizes é: " + maiorValorMatriz[l][c]);
				
			}
		}
		
	}

}
