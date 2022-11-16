package atividade16_11;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		
		int valores[][] = new int [5][5];
		int valorPesquisa = 0;
		boolean verificador = false;
		
		Scanner teclado = new Scanner (System.in);
		
		for(int c = 0; c < 5; c++) {
			
			for (int l = 0; l < 5; l++) {
				
				System.out.println("Insira o valor da linha: " + l + " coluna: " + c);
				valores[l][c] = teclado.nextInt();
				
			}
		}
		
		System.out.println("\n\nPor qual valor você procura?");
		valorPesquisa = teclado.nextInt();
		
		for (int c = 0; c < 5; c++) {
			
			for (int l = 0; l < 5; l++) {
				
				if (valores [l][c] == valorPesquisa) {
					
					System.out.println("O valor pode ser encontrado na linha: " + l + " coluna: " + c);
					verificador = true;
				}
			}
		}
		if (verificador == false){
			
			System.out.print("\nValor não encontrado");
				
		}
	}

}
