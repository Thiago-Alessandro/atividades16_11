package atividade16_11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		int matriz [][] = new int [3][3];
		int arraySomas [] = new int [3];
		int matrizMultiplicada[][] = new int [3][3];
		
		Scanner teclado = new Scanner (System.in);
		
		for(int l = 0;l< matriz.length;l++) {
			
			for(int c = 0;c<3;c++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				matriz[l][c] = teclado.nextInt();
			}
		}
		
		for(int c = 0; c< 3; c++) {
			
			for(int l = 0; l<matriz.length; l++) {
				
				arraySomas[c] += matriz[l][c];

			}
		}
		
		for (int c = 0; c < arraySomas.length;c++) {
			
		System.out.println(arraySomas[c]);
		}
		
		for(int c = 0; c < 3;c++) {
			
			for (int l = 0;l < 3; l++) {
				
				matrizMultiplicada[l][c] = matriz[l][c] * arraySomas[c];
			}
		}
		for(int l = 0; l < 3;l++) {
			
			for (int c = 0;c < 3; c++) {
				
				System.out.println("O valor da linha: " + l + " coluna: " + c +" é: " + matrizMultiplicada[l][c]);
			}
		}
		
	}

}
