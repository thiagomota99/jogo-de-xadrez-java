package application;

import boardgame.Posicao;

public class Program {

	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		
		System.out.println("Testando a classe Posicao");
		Posicao posicao = new Posicao(3,5);
		
		System.out.println(posicao);
	}

}
