
package projet3;

import java.io.Serializable;
import java.util.*;
import javax.swing.JTextField;

public abstract class Transaction implements Serializable, Comparable{
    
 private static String ModePaie;
    private static int noSerie;
    private int noTransaction;
    private String description;
    private Date dateTransaction;
    private double montant;
    
    Transaction(String mp, int ns, int nt, String d, Date dt, double m){
        ModePaie = mp;
        noSerie = ns;
        noSerie++;
        noTransaction = nt;
        description = d;
        dateTransaction = dt;
        montant = m;
    }
    public void toString(JTextField nv , JTextField de, JTextField dv, JTextField mv){
        nv.setText(noSerie + "");
        de.setText(description);
        dv.setText(dateTransaction + "");
        mv.setText(montant + "");   
}
    public void compareTo(){
        
    }
    public void miseAJourCompte(){
        
    }
}
