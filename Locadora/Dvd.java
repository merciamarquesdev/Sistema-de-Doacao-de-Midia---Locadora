package Locadora;

public class Dvd extends Midia {
    private Midia midia;

    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    public void darPlay(){
        System.out.println("Filme iniciado!");
    }

    public Dvd(Midia midia, String idioma, boolean possuiLegenda, String idiomaLegenda) {
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

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public void legenda(boolean ligar, String idioma){
        setPossuiLegenda(ligar);
        setIdiomaLegenda(idioma);
    }

    public void legenda(boolean ligarDesligar){
        setPossuiLegenda(ligarDesligar);
    }
}
