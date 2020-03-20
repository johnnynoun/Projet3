package projet3;

import java.util.Date;

public class Recu extends Transactioncl {

    public Recu(String mp, int ns, String des, Date dt, int nt, double m, Client cl) {

        super(mp, ns, des, dt, nt, m, cl);

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
