package projet3;

import java.util.Date;

public abstract class Transactioncl extends Transaction {

    private Client client;

    public Transactioncl(String mp, int ns, String d, Date dt, int nt, double m, Client cl) {
        super(mp, ns, nt, d, dt, m);

        this.client = cl;
    }

    public String toString() {
        return super.toString();

    }
}
