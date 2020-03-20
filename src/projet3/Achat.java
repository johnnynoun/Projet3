package projet3;

import java.util.Date;

public class Achat extends Transactionf {

    public Achat(String mp, int ns, String des, Date dt, int nt, double m, Fournisseur f) {

        super(mp, ns, des, dt, nt, m, f);

    }

    public String toString() {
        return super.toString();
    }

    public void miseAJourCompte() {
        super.miseAJourCompte();
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
