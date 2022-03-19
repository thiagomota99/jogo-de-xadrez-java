package application;

import xadrez.PecaXadrez;

public class UI {
	
	public static void printTabuleiro(PecaXadrez[][] pecas) {
		int linhasTabuleiro = 8;
		for(int i=0; i<pecas.length; i++) {
			System.out.print((linhasTabuleiro - i) + " ");
			for(int j=0; j<pecas.length; j++) {
				printPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	public static void printPeca(PecaXadrez pecaXadrez) {
		if(pecaXadrez == null) {
			System.out.print("-");
		}
		else {
			System.out.print(pecaXadrez);
		}
		System.out.print(" ");
	}
}
