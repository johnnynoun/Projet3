package projet3;

import java.util.Date;

public abstract class Transactionf extends Transaction {

    private Fournisseur fourn;

    Transactionf(String mp, int ns, String d, Date dt, int nt, double m, Fournisseur f) {

        super(mp, ns, nt, d, dt, m);

        fourn = f;
    }
}
