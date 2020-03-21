package projet3;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JTextField;

public abstract class Vente implements Serializable, Comparable {

   
    private static int novente=-1;
    private String description;
    private Date dateVente;
    private double montant;

    public Vente(String dt, String cln) {
    novente++;
    description=dt;
    montant=0.0;
       
       

    }

    public void toString(JTextField nv, JTextField dt, JTextField s) {
        nv.setText(novente+ "");
       dt.setText(description+"Product number "+"<<"+novente+">>");
        s.setText(montant + "");
    }

    
    public void miseAJourCompte() {
        
    }

   
    public void compareTo() {
        
    }

}
