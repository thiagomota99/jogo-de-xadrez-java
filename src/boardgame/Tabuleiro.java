package boardgame;

public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca[][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if(linhas < 1 || colunas < 1)
			throw new TabuleiroException("Erro ao criar o tabuleiro: � necess�rio que haja pelo menos uma linha e uma coluna");
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca[linhas][colunas];
	}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	//retorna uma pe�a a partir da linha e coluna
	public Peca peca(int linha, int coluna) {
		if (!existePosicao(linha, coluna))
			throw new TabuleiroException("N�o existe esta posi��o no tabuleiro");
		return pecas[linha][coluna];
	}
	
	//retorna uma pe�a a partir da posicao
	public Peca peca(Posicao posicao) {
		if (!existePosicao(posicao))
			throw new TabuleiroException("N�o existe esta posi��o no tabuleiro");
		return pecas[posicao.getLinha()][posicao.getColuna()];
	}
	
	public void colocarPeca(Peca peca, Posicao posicao) {
		if (temUmaPeca(posicao))
			throw new TabuleiroException("J� existe uma pe�a nesta posi��o " + posicao);
		pecas[posicao.getLinha()][posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	
	private boolean existePosicao(int linha, int coluna) {
		return linha >= 0 && linha < this.linhas && coluna >=0 && coluna < this.colunas;
	}
	
	public boolean existePosicao(Posicao posicao) {
		return existePosicao(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temUmaPeca(Posicao posicao) {
		if(!existePosicao(posicao))
			throw new TabuleiroException("N�o existe esta posi��o no tabuleiro");
		return peca(posicao) != null;
	}
}
