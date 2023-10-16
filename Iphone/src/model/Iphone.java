package model;

public class Iphone {
    private Telefone telefone;
    private Ipod ipod;
    private Browser browser;

    public Iphone(){
        this.telefone=new Telefone();
        this.ipod= new Ipod();
        this.browser = new Browser();
    }

    public Iphone(Telefone telefone, Ipod ipod, Browser browser){
        this.telefone=new Telefone();
        this.ipod= new Ipod();
        this.browser = new Browser();
    }

    public Ipod getIpod(){
        return this.ipod;
    }

    public Telefone getTelefone(){
        return this.telefone;
    }

    public Browser getBrowser(){
        return this.browser;
    }
}
