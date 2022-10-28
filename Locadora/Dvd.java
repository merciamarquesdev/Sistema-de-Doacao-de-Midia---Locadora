package Locadora;
// Criar classe Filha chamada Dvd
//
//        * Atributos:
//        - idioma : String ----- TRANSFORMEI EM ENUM

//        - idiomaLegenda : String ------- TRANSFORMEI EM ENUM
public class Dvd extends Midia {

    private Idioma idioma;
    private boolean possuiLegenda;
    private IdiomaLegenda idiomaLegenda;

    public void darPlay(){
        System.out.println("Filme iniciado!");
    }

    public Dvd(String codigo, Double preco, String nome, Idioma idioma, boolean possuiLegenda, IdiomaLegenda idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
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
        if (!possuiLegenda){
            System.out.println("Este filme não tem legenda!");
        }
    }

    public void legenda(boolean ligarDesligar){
        setPossuiLegenda(ligarDesligar);
        if (!possuiLegenda) {
            System.out.println("Este filme não tem legenda!");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", em "
                + idioma + ". Escolha da legenda: " +
                idiomaLegenda ;
    }
}
