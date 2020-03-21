package projet3;

import java.io.Serializable;
import java.util.Date;
import javax.swing.JTextField;

public abstract class Recu implements Serializable, Comparable {

   
    private static int norecu=-1;
    private String description;
    private Date dateRecu;
    private double montant;

    public Recu(String dt, String cln) {
    norecu++;
    description=dt;
    montant=0.0;
      

    }

    public void toString(JTextField nv, JTextField dt, JTextField s) {
        nv.setText(norecu + "");
       dt.setText(description+"Recu pour numero "+"<<"+norecu+">>");
        s.setText(montant + "");
    }

    
    public void miseAJourCompte() {
        
    }

   
    public void compareTo() {
        
    }

}