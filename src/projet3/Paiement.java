package projet3;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JTextField;

public abstract class Paiement implements Serializable, Comparable {

   
    private static int nopaie=-1;
    private String description;
    private Date datePaiement;
    private double montant;

    public Paiement(String dt, String frn) {
    nopaie++;
    description=dt;
    montant=0.0;
       
       

    }

    public void toString(JTextField nv, JTextField dt, JTextField s) {
        nv.setText(nopaie + "");
       dt.setText(description+"Recu pour numero "+"<<"+nopaie+">>");
        s.setText(montant + "");
    }

    
    public void miseAJourCompte() {
        
    }

   
    public void compareTo() {
        
    }

}
