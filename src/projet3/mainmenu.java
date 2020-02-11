package projet3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class mainmenu extends JFrame {

    private JFrame frame;
    private JMenuBar b;
    private JMenu m1, m11, m12, m13, m14, m2, m21, m22, m3, m31, m4, m5;
    private JMenuItem i11, i12, i13, i14, i15, i16, i17, i18, m23, i21, i22, i23, i24, m32, i31, i32, m41, m42, m51, m52;

    public mainmenu() {
        frame = new JFrame("Gestions de transactions comerciales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        m1 = new JMenu("Transactions");
        m11 = new JMenu("Ventes");
        i11 = new JMenuItem("Creer/Modifier");
        i12 = new JMenuItem("Rapports");
        m11.add(i11);
        m11.add(i12);
        i11.addActionListener(new MenuListener());
        i12.addActionListener(new MenuListener());
        m12 = new JMenu("Achats");
        i13 = new JMenuItem("Creer/Modifier");
        i14 = new JMenuItem("Rapports");
        m12.add(i13);
        m12.add(i14);
        i13.addActionListener(new MenuListener());
        i14.addActionListener(new MenuListener());
        m13 = new JMenu("Recus");
        i15 = new JMenuItem("Creer/Modifier");
        i16 = new JMenuItem("Rapports");
        m13.add(i15);
        m13.add(i16);
        i15.addActionListener(new MenuListener());
        i16.addActionListener(new MenuListener());
        m14 = new JMenu("Paiement");
        i17 = new JMenuItem("Creer/Modifier");
        i18 = new JMenuItem("Rapports");
        m14.add(i17);
        m14.add(i18);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        i17.addActionListener(new MenuListener());
        i18.addActionListener(new MenuListener());
        m2 = new JMenu("Comptes");
        m21 = new JMenu("Clients");
        i21 = new JMenuItem("Creer/Modifier");
        i22 = new JMenuItem("Rapports");
        m21.add(i21);
        m21.add(i22);
        i21.addActionListener(new MenuListener());
        i22.addActionListener(new MenuListener());
        m22 = new JMenu("Fournisseurs");
        i23 = new JMenuItem("Creer/Modifier");
        i24 = new JMenuItem("Rapports");
        m22.add(i23);
        m22.add(i24);
        i23.addActionListener(new MenuListener());
        i24.addActionListener(new MenuListener());
        m23 = new JMenuItem("Villes");
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);

        m3 = new JMenu("Stock");
        m31 = new JMenu("Articles");
        i31 = new JMenuItem("Creer/Modifier");
        i32 = new JMenuItem("Rapports");
        m31.add(i31);
        m31.add(i32);
        i31.addActionListener(new MenuListener());
        i32.addActionListener(new MenuListener());
        m32 = new JMenuItem("Categories Articles");
        m3.add(m31);
        m3.add(m32);
        m32.addActionListener(new MenuListener());
        m4 = new JMenu("Outils");
        m41 = new JMenuItem("Charger du disque");
        m42 = new JMenuItem("Sauvegarder sur disque");
        m4.add(m41);
        m4.add(m42);
        m5 = new JMenu("Quitter");
        m51 = new JMenuItem("Version");
        m52 = new JMenuItem("Quitter");
        m5.add(m51);
        m5.add(m52);
        m52.addActionListener(new MenuListener());
        b = new JMenuBar();
        b.add(m1);
        b.add(m2);
        b.add(m3);
        b.add(m4);
        b.add(m5);
        frame.setJMenuBar(b);
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    public class MenuListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();

            if (ob == i11) {

                creemodv cmv = new creemodv(frame);

            }

            // *********************************************************  
            // *********************************************************    
            // ACHATS     
            if (ob == i13) {

                creemoda cma = new creemoda(frame);

            }

            // *********************************************************          
            // *********************************************************  
            // *********************************************************    
            // RECUS    
            if (ob == i15) {

                creemodr cmr = new creemodr(frame);

            }

            // *********************************************************  
            // *********************************************************    
            // *********************************************************  
            // Paiement
            if (ob == i17) {

                creemodp cmp = new creemodp(frame);

            }

            // *********************************************************  
            // *********************************************************    
            //Comptes Clients  
            if (ob == i21) {

                creemodcl cmcl = new creemodcl(frame);

            }

            // *********************************************************  
            // *********************************************************    
            //Comptes Fournisseurs
            if (ob == i23) {

                creemodf cmf = new creemodf(frame);

            }

            // *********************************************************  
            // *********************************************************    
            //Stock
            //INFO Articles
            if (ob == i31) {

                creemodsa cmsa = new creemodsa(frame);

            }

            // *********************************************************  
            // *********************************************************    
            //Stock
            //Categories
            if (ob == m32) {

                catartstock cas = new catartstock(frame);

            }

            // *********************************************************  
            // *********************************************************   
            // *********************************************************  
            // Rapport Ventes
            if (i12 == ob) {

                rappv rv = new rappv(frame);

            }

            // *********************************************************  
            // *********************************************************  
            // *********************************************************  
            //Rapport Achats
            if (i14 == ob) {

                rappach rach = new rappach(frame);

            }

            // *********************************************************  
            // *********************************************************  
            // *********************************************************  
            // Rapport Recus
            if (i16 == ob) {

                rappr rr = new rappr(frame);

            }

            // *********************************************************  
            // *********************************************************  
            // *********************************************************  
            // Rapports Paiement
            if (i18 == ob) {

                rapppa rp = new rapppa(frame);

            }

            //********************************************************
            // *********************************************************  
            // *********************************************************    
            //Comptes Rapports Clients 
            if (i22 == ob) {

                rappcl rcl = new rappcl(frame);

            }

            // *********************************************************  
            // *********************************************************  
            // *********************************************************  
            // Rapports Comptes Fournisseurs
            if (i24 == ob) {

                rappf rf = new rappf(frame);

            }

            // *********************************************************  
            // *********************************************************  
            // *********************************************************  
            // Rapport Stock Articles
            if (i32 == ob) {

                rappsa rsa = new rappsa(frame);

            }

            if (m52 == ob) {

                System.exit(0);
            }

        }
    }
}
