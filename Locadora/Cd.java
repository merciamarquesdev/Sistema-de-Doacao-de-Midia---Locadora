package Locadora;

public class Cd extends Midia {
    private String artista;
    private int quantidadedeFaixas ;

    //sobrescrever darPlay : Exibir a msg "Primeira faixa tocando"
    public void darPlay(){
        System.out.println("Primeira faixa tocando!");
    }

    //constructor
    public Cd (String codigo, Double preco, String nome, String artista, int quantidadedeFaixas  ){
        super(codigo, preco, nome);
        this.artista = artista;
        this.quantidadedeFaixas = quantidadedeFaixas;
    }

    //get e set
    public String getArtista(){
        return artista;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public int getQuantidadedeFaixas(){
        return quantidadedeFaixas;
    }

    public void setQuantidadedeFaixas(int quantidadedeFaixas){
        this.quantidadedeFaixas = quantidadedeFaixas;
    }


    @Override
    public String toString(){
        return super.toString() + ", de "
                + artista + ", com "
                + quantidadedeFaixas + " faixas.";
    }
}
