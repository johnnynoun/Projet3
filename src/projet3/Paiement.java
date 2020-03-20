package projet3;

import java.util.Date;

public class Paiement extends Transactionf {

    public Paiement(String mp, int ns, String des, Date dt, int nt, double m, Fournisseur f) {

        super(mp, ns, des, dt, nt, m, f);

    }

    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
