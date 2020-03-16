package projet3;

public class Fournisseur extends Compte {

    public Fournisseur(String nmc, String v) {
        super(nmc, v);

    }

    public void debiter() {
        super.debiter();
    }

    public void crediter() {
        super.crediter();
    }

    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
