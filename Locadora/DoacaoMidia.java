package Locadora;

import java.util.Random;

public class DoacaoMidia {

    // essa classe deve conter:
    // método pegarMidiaAleatoria() que devolve uma midia aleatória já criada na biblioteca

    public static Midia pegarMidiaAleatoria() {
        Dvd dvd1 = new Dvd("A30112007", 27.8, "A Vida dos Outros", Idioma.ALEMAO, true, IdiomaLegenda.PORTUGUES);
        Dvd dvd2 = new Dvd("J30102008", 23.12, "A Partida", Idioma.JAPONES, true, IdiomaLegenda.PORTUGUES);
        Dvd dvd3 = new Dvd("B23012004", 19.90, "Narradores de Javé", Idioma.PORTUGUES, false, IdiomaLegenda.SEMLEGENDA);
        Dvd dvd4 = new Dvd("F31082012", 33.50, "Intocáveis", Idioma.FRANCES, true, IdiomaLegenda.ESPANHOL);
        Dvd dvd5 = new Dvd("A23102014", 19.90, "Relatos Selvagens", Idioma.ESPANHOL, true, IdiomaLegenda.PORTUGUES);
        Dvd dvd6 = new Dvd("C07112019", 43.0, "Parasita", Idioma.COREANO, true, IdiomaLegenda.PORTUGUES);
        Cd cd1 = new Cd("CCD2022BTS", 80.20, "Proof", "BTS", 35);
        Cd cd2 = new Cd("ECD2022BEY", 45.50, "Renaissance", "Beyoncé", 16);

        Random midiaAleatoria = new Random();

        int midiaEscolhida = midiaAleatoria.nextInt(8);

        switch (midiaEscolhida) {
            case 0:
                return dvd1;

            case 1:
                return dvd2;

            case 2:
                return dvd3;

            case 3:
                return dvd4;

            case 4:
                return dvd5;

            case 5:
                return dvd6;

            case 6:
                return cd1;

            default:
                return cd2;
        }

    }

    //Essa classe deve conter método assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda

    public static void assistirFilme(Dvd dvd) {
        boolean legenda = dvd.isPossuiLegenda();
        dvd.legenda(legenda);
        IdiomaLegenda idiomaLegenda = dvd.getIdiomaLegenda();
        dvd.legenda(legenda, idiomaLegenda);

    }


    //Método main: O main deve pegar uma midia aleatoria e dar o play
    public static void main(String[] args) {


        Midia midiaDoacao = pegarMidiaAleatoria();
        System.out.println("A mídia escolhida é " + midiaDoacao);
        midiaDoacao.darPlay();

    }
}
