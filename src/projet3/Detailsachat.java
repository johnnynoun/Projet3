package projet3;

public class Detailsachat {

    private Achat achat;
    private Article article;
    private int quantite;
    private Double cout;

    Detailsachat(Achat a, Article art, int qu, Double c) {
        a = achat;
        art = article;
        qu = quantite;
        c = cout;
    }

    public String toString() {
        return ("Achat: "      + achat    + "\n" + "\r"
                + "Article: "  + article  + "\n" + "\r"
                + "Quantite: " + quantite + "\n" + "\r"
                + "Cout: "     + cout);
    }

    public void compareTo() {

    }

    public void calculerMontant() {

    }
}
