package model;

import enums.Status;

public class Ipod {

    private String musicaAtual;
    private Status status;

    public Ipod(){

        this.status=Status.Desligado;

    }

    public void selecionaMusica(String nomeMusica){

        this.musicaAtual=nomeMusica;
        System.out.println("Música selecionada: "+ nomeMusica);

    }

    public void tocar(){

        this.status=Status.Ligado;
        getMusicaAtual();
    }

    private String getMusicaAtual() {

        if(this.musicaAtual == null){
            return "Fila de músicas vazia";
        }

        return this.musicaAtual;
    }

    public void pausar(){

        if(this.status == Status.Ligado){

            this.status=Status.Pausado;
            System.out.println("Reprodutor pausado");
        }

    }

    public String getStatus(){
        return this.status.toString();
    }
}
