package org.jogorpg.com;

import org.jogorpg.com.model.Jogador;
import org.jogorpg.com.model.Contexto;

public class Main {

	public static void main(String[] args) {
		Jogador j1 = Jogador.getInstancia();
		
		Contexto contexto = Contexto.getInstancia(j1);
		
		System.out.println(j1);
		System.out.println(contexto);
		System.out.println(contexto.getJogador());
		
		int[][] mapa = contexto.getMapa();
		
		contexto.printMapa();
		contexto.renderizaJogador();
		System.out.println("Jogo iniciado!\n");
		contexto.printMapa();
		
		contexto.getJogador().andaPraDireita();
		contexto.atualizaMapa();
		contexto.printMapa();
		
	}

}
