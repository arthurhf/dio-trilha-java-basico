package model;

public class Telefone {

    public Telefone() {

    }

    public boolean atender() {
        return true;
    }

    public void ligar(String numero) {

        if (validaNumero(numero)) {

            int num = Integer.parseInt(numero);
            System.out.println(String.format("Ligando para %d...", num));

        }

    }

    private boolean validaNumero(String num) {
        try {
            int n = Integer.parseInt(num);
            return true;
        } catch (Exception e) {
            System.out.println("Verificação do número falhou... Digite apenas números inteiros." + e.getMessage());
        }
        return false;
    }

    public void ligar(Integer numero) {
        System.out.println(String.format("Ligando para %d...", numero));
    }

    public void iniciarCorreioVoz() {

    }

}
