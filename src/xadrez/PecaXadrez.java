package xadrez;

import boardgame.Peca;
import boardgame.Tabuleiro;

public class PecaXadrez extends Peca {
	
	private Color color;
	
	public PecaXadrez(Tabuleiro tabuleiro, Color color) {
		super(tabuleiro);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
