package org.jogorpg.com.model;

public class Contexto {

	private static Contexto instancia;
	private Jogador jogador;
	private int[][] mapa;
	
	private Contexto(Jogador jogador) {
		super();
		this.jogador = jogador;
		reiniciaMapa();
	}
	
	public static Contexto getInstancia(Jogador jogador) {
		if(instancia == null) {
			instancia = new Contexto(jogador);
		}
		return instancia;
	}
	
	public Jogador getJogador() {
		return this.jogador;
	}
	
	public int[][] getMapa() {
		return this.mapa;
	}
	
	public void printMapa() {
		System.out.print("Mapa atual:\n");
		for(int i=0; i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(mapa[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}
	
	//Carrega o jogador sempre na posição [0][0] do mapa
	public void renderizaJogador() {
		mapa[0][0] = 1;
	}
	
	private void reiniciaMapa() {
		this.mapa = new int[10][10];
	}
	
	//Atualiza o mapa com a nova posicao do jogador após o movimento
	public void atualizaMapa() {
		reiniciaMapa();
		mapa[jogador.getPosicaoV()][jogador.getPosicaoH()] = 1;
	}
}
