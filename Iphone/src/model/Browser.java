package model;

public class Browser {

    private Integer abas = 0;
    private String pagina;

    public Browser() {

    }

    public void exibirPagina(String pagina) {
        setPagina(pagina);
        System.out.println(String.format("Exibindo página %s", pagina));
    }

    public void adicionarNovaAba() {
        this.abas++;
    }

    public Integer getAbas() {
        return this.abas;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public String getPagina() {
        if(this.pagina == null){
            setPagina("home");
        }
        return this.pagina;
    }

    public void atualizarPagina() {
        System.out.println(String.format("Página %s recarregada", getPagina()));
    }

}
