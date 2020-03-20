package projet3;

import java.io.Serializable;

public class Article implements Serializable, Comparable {

    private static int noSerie;
    private int noArticle;
    private String nomArticle;
    private int qteStock;
    private Double prixVenteParUnite;
    private Double coutAchatParUnite;
    private Double tauxProfit;

    public Article(int ns, int na, String noma, int qus, Double pv, Double ca, Double tpf) {
        ns = noSerie;
        na = noArticle;
        noma = nomArticle;
        qus = qteStock;
        pv = prixVenteParUnite;
        ca = coutAchatParUnite;
        tpf = tauxProfit;
    }

    public String toString() {
        return ("Numero de Serie: "    + noSerie    + "\n" + "\r"
                + "Numero d'Article: " + noArticle  + "\n" + "\r"
                + "Nom de L'Article: " + nomArticle + "\n" + "\r"
                + "Quantite en Stock: "+ qteStock   + "\n" + "\r"
                + "Prix de Ventre: "   + prixVenteParUnite + "\n" + "\r"
                + "Cout d'Achat: "     + coutAchatParUnite + "\n" + "\r"
                + "Taux de Profit"     + tauxProfit);
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void entreeStock() {

    }

    public void sortieStock() {

    }

}
