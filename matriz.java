package atividade16_11;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		int array [][] = { {2,7,9},{3,6,1},{7,4,2} };
		//ou então
		int array2 [][] = new int [3][3];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int l=0;l<3;l++) {
			
			for (int c = 0; c<3; c++) {
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				array2[l][c] = teclado.nextInt();
			}
		}
		for (int l=0;l<3;l++) {
			
			for (int c = 0; c<3; c++) {
				
				System.out.print("\nO valor da linha: " + l + array2[l] + " coluna: " + array2[c]);
			}
		}
		
	}

}
