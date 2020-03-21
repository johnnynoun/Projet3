package projet3;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JTextField;

public abstract class Achat implements Serializable, Comparable {

   
    private static int noachat=-1;
    private String description;
    private Date dateAchat;
    private double montant;

    public Achat(String dt, String frn) {
    noachat++;
    description=dt;
    montant=0.0;
       
       

    }

    public void toString(JTextField nv, JTextField dt, JTextField s) {
        nv.setText(noachat + "");
       dt.setText(description+"Product number "+"<<"+noachat+">>");
        s.setText(montant + "");
    }

    
    public void miseAJourCompte() {
        
    }

   
    public void compareTo() {
        
    }

}
