package projet3;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

public class mainmenu extends JFrame {

    JFrame frame;
    private JMenuBar b;
    private JMenu m1, m11, m12, m13, m14, m2, m21, m22, m3, m31, m4, m5;
    private JMenuItem i11, i12, i13, i14, i15, i16, i17, i18, m23, i21, i22, i23, i24, m32, i31, i32, m41, m42, m51, m52;

    public mainmenu() {
        frame = new JFrame("Gestions de transactions comerciales");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        m1 = new JMenu("Transactions");
        m1.setMnemonic(KeyEvent.VK_T);
        m11 = new JMenu("Ventes");
        m11.setMnemonic(KeyEvent.VK_V);
        i11 = new JMenuItem("Creer/Modifier");
        i11.setMnemonic(KeyEvent.VK_C);
        i12 = new JMenuItem("Rapports");
        i12.setMnemonic(KeyEvent.VK_R);
        m11.add(i11);
        m11.add(i12);
        i11.addActionListener(new MenuListener());
        i12.addActionListener(new MenuListener());
        m12 = new JMenu("Achats");
        m12.setMnemonic(KeyEvent.VK_A);
        i13 = new JMenuItem("Creer/Modifier");
        i13.setMnemonic(KeyEvent.VK_C);
        i14 = new JMenuItem("Rapports");
        i14.setMnemonic(KeyEvent.VK_R);
        m12.add(i13);
        m12.add(i14);
        i13.addActionListener(new MenuListener());
        i14.addActionListener(new MenuListener());
        m13 = new JMenu("Recus");
        m13.setMnemonic(KeyEvent.VK_R);
        i15 = new JMenuItem("Creer/Modifier");
        i15.setMnemonic(KeyEvent.VK_C);
        i16 = new JMenuItem("Rapports");
        i16.setMnemonic(KeyEvent.VK_R);
        m13.add(i15);
        m13.add(i16);
        i15.addActionListener(new MenuListener());
        i16.addActionListener(new MenuListener());
        m14 = new JMenu("Paiement");
        m14.setMnemonic(KeyEvent.VK_P);
        i17 = new JMenuItem("Creer/Modifier");
        i17.setMnemonic(KeyEvent.VK_C);
        i18 = new JMenuItem("Rapports");
        i18.setMnemonic(KeyEvent.VK_R);
        m14.add(i17);
        m14.add(i18);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        i17.addActionListener(new MenuListener());
        i18.addActionListener(new MenuListener());
        m2 = new JMenu("Comptes");
        m2.setMnemonic(KeyEvent.VK_C);
        m21 = new JMenu("Clients");
        m21.setMnemonic(KeyEvent.VK_C);
        i21 = new JMenuItem("Creer/Modifier");
        i21.setMnemonic(KeyEvent.VK_C);
        i22 = new JMenuItem("Rapports");
        i22.setMnemonic(KeyEvent.VK_R);
        m21.add(i21);
        m21.add(i22);
        i21.addActionListener(new MenuListener());
        i22.addActionListener(new MenuListener());
        m22 = new JMenu("Fournisseurs");
        m22.setMnemonic(KeyEvent.VK_F);
        i23 = new JMenuItem("Creer/Modifier");
        i23.setMnemonic(KeyEvent.VK_C);
        i24 = new JMenuItem("Rapports");
        i24.setMnemonic(KeyEvent.VK_R);
        m22.add(i23);
        m22.add(i24);
        i23.addActionListener(new MenuListener());
        i24.addActionListener(new MenuListener());
        m23 = new JMenuItem("Villes");
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);

        m3 = new JMenu("Stock");
        m3.setMnemonic(KeyEvent.VK_S);
        m31 = new JMenu("Articles");
        m31.setMnemonic(KeyEvent.VK_A);
        i31 = new JMenuItem("Creer/Modifier");
        i31.setMnemonic(KeyEvent.VK_C);
        i32 = new JMenuItem("Rapports");
        i32.setMnemonic(KeyEvent.VK_R);
        m31.add(i31);
        m31.add(i32);
        i31.addActionListener(new MenuListener());
        i32.addActionListener(new MenuListener());
        m32 = new JMenuItem("Categories Articles");
        m32.setMnemonic(KeyEvent.VK_C);
        m3.add(m31);
        m3.add(m32);
        m32.addActionListener(new MenuListener());
        m4 = new JMenu("Outils");
        m4.setMnemonic(KeyEvent.VK_O);
        m41 = new JMenuItem("Charger du disque");
        m41.setMnemonic(KeyEvent.VK_C);
        m42 = new JMenuItem("Sauvegarder sur disque");
        m42.setMnemonic(KeyEvent.VK_S);
        m4.add(m41);
        m4.add(m42);
        m5 = new JMenu("Quitter");
        m5.setMnemonic(KeyEvent.VK_Q);
        m51 = new JMenuItem("Version");
        m51.setMnemonic(KeyEvent.VK_V);
        m52 = new JMenuItem("Quitter");
        m52.setMnemonic(KeyEvent.VK_Q);
        m5.add(m51);
        m5.add(m52);
        m51.addActionListener(new MenuListener());
        m52.addActionListener(new MenuListener());
        b = new JMenuBar();
        b.add(m1);
        b.add(m2);
        b.add(m3);
        b.add(m4);
        b.add(m5);
        frame.setJMenuBar(b);
        frame.setSize(850, 650);
        frame.setVisible(true);
    }

    public class MenuListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();
            
            // *********************************************************  
            // *********************************************************    
            // VENTES     
            if (ob == i11) {
               
               String dt = null ;
                String cln = null;
                creemodv cmv = new creemodv(frame, dt, cln);

            }

            // *********************************************************  
            // *********************************************************    
            // ACHATS     
            if (ob == i13) {
                String dt = null ;
                String frn = null;      
                creemoda cma = new creemoda(frame, dt, frn);
                        
            }

            // *********************************************************          
            // *********************************************************  
            // *********************************************************    
            // RECUS    
            if (ob == i15) {
                String dt = null ;
                String cln = null;
                creemodr cmr = new creemodr(frame, dt, cln);

            }

            // *********************************************************  
            // *********************************************************    
            // *********************************************************  
            // Paiement
            if (ob == i17) {
                String dt = null ;
                String frn = null;      
                creemodp cmp = new creemodp(frame, dt, frn);

            }

            // *********************************************************  
            // *********************************************************    
            //Comptes Clients  
            if (ob == i21) {
                String s,ss;
                s= "";
                ss="";
                creemodcl cmcl = new creemodcl(frame, s, ss);
                
               
                
            }

            // *********************************************************  
            // *********************************************************    
            //Comptes Fournisseurs
            if (ob == i23) {
                String s,ss;
                s= "";
                ss="";
                creemodf cmf = new creemodf(frame, s, ss);

            }

            // *********************************************************  
            // *********************************************************    
            //Stock
            //INFO Articles
            if (ob == i31) {
            int ns = 0,na = 0,qus = 0;
            String nmart = null;
            Double pv = null,ca = null,tpf = null;
  
                creemodsa cmsa = new creemodsa(frame,ns ,na ,nmart ,qus  ,pv ,ca ,tpf);

            }

            // *********************************************************  
            // *********************************************************    
            //Stock
            //Categories
            if (ob == m32) {
            int ns = 0,na = 0,qus = 0;
            String nmart = null;
            Double pv = null,ca = null,tpf = null;
            
                catartstock cas = new catartstock(frame,ns ,na ,nmart ,qus  ,pv ,ca ,tpf);

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

            
            if(m51 ==ob) {
                
                System.out.println("Welcome! You are using the latest version v 1.0.1 of our test program");
            }
            
            
            
            if (m52 == ob) {
                
                 int result = JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirm Exit",
                                JOptionPane.YES_NO_OPTION);
                        if (result == JOptionPane.YES_OPTION)
                            System.exit(0);
            }

            
        }
        
        
    }
}

