package org.jogorpg.com.model;

public class Jogador {
	
	private static Jogador instancia;
	private int posicaoH = 0;
	private int posicaoV = 0;
	
	private Jogador() {
		super();
	}
	
	public static Jogador getInstancia() {
		if(instancia == null) {
			instancia = new Jogador();
		}
		return instancia;
	}
	
	public void andaPraDireita() {
		if(posicaoH == 9) {
			posicaoH = 0;
		}else {
			posicaoH++;
		}
		
	}
	
	public void andaPraBaixo() {
		if(posicaoV == 9) {
			posicaoV = 0;
		}else {
			posicaoV++;
		}
		
	}
	
	public int getPosicaoH() {
		return posicaoH;
	}
	
	public int getPosicaoV() {
		return posicaoV;
	}

}
