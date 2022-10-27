package Locadora;

public class Dvd extends Midia {
    private Midia midia;

    private Idioma idioma;
    private boolean possuiLegenda;
    private IdiomaLegenda idiomaLegenda;

    public void darPlay(){
        System.out.println("Filme iniciado!");
    }

    public Dvd(Midia midia, Idioma idioma, boolean possuiLegenda, IdiomaLegenda idiomaLegenda) {
        super(midia.getCodigo(), midia.getPreco(), midia.getNome());
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }

    public Midia getMidia() {
        return midia;
    }

    public void setMidia(Midia midia) {
        this.midia = midia;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public void setIdioma(Idioma idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public IdiomaLegenda getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(IdiomaLegenda idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public void legenda(boolean ligar, IdiomaLegenda idiomaLegenda){
        setPossuiLegenda(ligar);
        setIdiomaLegenda(idiomaLegenda);
    }

    public void legenda(boolean ligarDesligar){
        setPossuiLegenda(ligarDesligar);
    }
}
