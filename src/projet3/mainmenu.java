
package projet3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainmenu extends JFrame  {
    private JMenuBar b;
    private JMenu m1,m11,m12,m13,m14,m2,m21,m22,m3,m31,m4,m5;
    private JMenuItem i11,i12,i13,i14,i15,i16,i17,i18,m23,i21,i22,i23,i24,m32,i31,i32,m41,m42,m51,m52;
    private JPanel panel;
    
    
    public mainmenu(){
        
        setTitle("Gestions de transactions comerciales");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout( new BorderLayout());
        
         m1= new JMenu ("Transactions");
         
         m11= new JMenu("Ventes");
        i11=new JMenuItem("Creer/Modifier");
        i12=new JMenuItem("Rapports");
         m11.add(i11);m11.add(i12);
         
                   
         
         
         
         m12= new JMenu("Achats");
         i13=new JMenuItem("Creer/Modifier");
        i14=new JMenuItem("Rapports");
         m12.add(i13);m12.add(i14);
         
         m13= new JMenu("Recus");
         i15=new JMenuItem("Creer/Modifier");
        i16=new JMenuItem("Rapports");
         m13.add(i15);m13.add(i16);
         
         m14= new JMenu("Paiement");
         i17=new JMenuItem("Creer/Modifier");
        i18=new JMenuItem("Rapports");
        m14.add(i17);m14.add(i18);
        
        
         m1.add(m11);m1.add(m12);     m1.add(m13);m1.add(m14);
         
         m2= new JMenu("Comptes");
         
         m21= new JMenu("Clients");
          i21=new JMenuItem("Creer/Modifier");
        i22=new JMenuItem("Rapports");
        m21.add(i21);m21.add(i22);
         
         m22= new JMenu("Fournisseurs");
          i23=new JMenuItem("Creer/Modifier");
        i24=new JMenuItem("Rapports");
        m22.add(i23);m22.add(i24);
        
         m23= new JMenuItem("Villes");
      
        
        
    m2.add(m21);m2.add(m22);m2.add(m23);
                  
         m3= new JMenu("Stock");
         
          m31= new JMenu("Articles");
        i31=new JMenuItem("Creer/Modifier");
        i32=new JMenuItem("Rapports");
        
           m31.add(i31);m31.add(i32);
      
           m32= new JMenuItem("Categories Articles");
        
              m3.add(m31);m3.add(m32);
        
        
         m4= new JMenu("Outils");
         
         
         m41=new JMenuItem("Charger du disque");
        m42=new JMenuItem("Sauvegarder sur disque");
         m4.add(m41);m4.add(m42);
         
         m5= new JMenu("Quitter");
         m51=new JMenuItem("Version");
        m52=new JMenuItem("Quitter");
         m5.add(m51);m5.add(m52);
         
         
        b= new JMenuBar();
        
        b.add(m1); b.add(m2);b.add(m3);    b.add(m4); b.add(m5);

        setJMenuBar(b);
        
         panel= new JPanel();
        add(panel);
        
     
        
      panel.setBackground(Color.decode("#C6C6C6"));
         setSize(400, 300);
        setVisible(true);
        
        
    }
}
