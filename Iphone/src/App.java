import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        Ipod ipod = iphone.getIpod();
        Telefone telefone = iphone.getTelefone();
        Browser browser = iphone.getBrowser();

        browser.setPagina("home");
        telefone.ligar(11111);
        telefone.ligar("1111222");
        telefone.ligar("aaaaaaa");

        ipod.selecionaMusica("Luiz Gonzaga - Asa Branca");
        ipod.tocar();
    }

}
