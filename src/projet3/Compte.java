package projet3;

import java.io.Serializable;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public abstract class Compte implements Serializable, Comparable {

    private static String etatcompte;
    private static int noserie = 0;
    private int nocompte;
    private String nomcompte;
    private Double solde;
    private String ville;
    private EtatCompte etat;

    Compte(String nmc, String v) {
        etatcompte = "Actif";
        noserie++;
        nomcompte = nmc;
        ville = v;
        solde = 0.0;

    }

    public void toString(JTextField nc, JTextField nmc, JTextField s) {
        nc.setText(noserie + "");
        nmc.setText(nomcompte);
        s.setText(solde + "");
    }

    public void compareTo() {
    }

    public void setEtat(EtatCompte ec) {

    }

    public void debiter() {
    }

    public void crediter() {
    }
}
