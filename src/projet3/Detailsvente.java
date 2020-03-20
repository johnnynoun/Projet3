package projet3;

public class Detailsvente {

    private Vente vente;
    private Article article;
    private int quantite;

    Detailsvente(Vente v, Article art, int qu) {
        v = vente;
        art = article;
        qu = quantite;
    }

    public String toString() {
        return ("Vente: "      + vente     + "\n" + "\r"
                + "Article: "  + article   + "\n" + "\r"
                + "Quantite: " + quantite);
    }

    public void compareTo() {

    }

    public void calculerMontant() {

    }
}
