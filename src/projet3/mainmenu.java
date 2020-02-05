
package projet3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.table.TableModel;

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
         
        i11.addActionListener(new MenuListener());
                   
         
         
         
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
        
      
       
        setSize(600, 400);
        setVisible(true);
        
        
    
    }
    
    
    
    
   public class MenuListener implements ActionListener {
        public void actionPerformed (ActionEvent event){
             Object ob = event.getSource();
           
            if (ob == i11 ){
       
            JPanel p,ep,wp,np,pnp,sp;
            JScrollBar pn;
            JLabel l1,l2,l3,l4,cl; 
            JButton b1,b2,b3;
            JComboBox c;
            JTextArea t;
            JTable table;
            JTextField f1,f2,f3,f4;
  
   p= new JPanel(new FlowLayout(8,8,8));         
         np= new JPanel(new BorderLayout());
         pnp= new JPanel(new GridLayout(1,5));
         wp = new JPanel(new GridLayout(4,1));
         ep= new JPanel();
         sp= new JPanel(new FlowLayout(1,1,1));
          
        String[][] rec = {
            { "", "","", ""},
                { "", "","", ""},
                    { "", "","", ""},
                        { "", "","",""},
                        { "", "","", ""},
      };
      String[] h = { "Article", "Quantite", "Prix Unit", "Prix Total" };
      
     table = new JTable(rec,h);
    table.setEnabled(false);
                TitledBorder title3;
                title3= BorderFactory.createTitledBorder("Details Ventes");
                title3.setTitleJustification(TitledBorder.ABOVE_TOP);
               sp.setBorder(title3);
 

       pn = new JScrollBar();
        pn.setOpaque(true);
                 
       String[] clients = {"                                            " };
       cl= new JLabel("choisir client");
       c = new JComboBox(clients);
         //c.setSelectedIndex(4);
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Ventes");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
         
        
        l1= new JLabel("No Vente");
        l2= new JLabel("Description");
        l3= new JLabel("Date Vente");
        l4= new JLabel("Montant Vente");
        
        f1= new JTextField(18);
        f2= new JTextField(18);
        f3= new JTextField(18);
        f4= new JTextField(18);
        
        
       TitledBorder title2;
        title2= BorderFactory.createTitledBorder("Infos Ventes");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      add(p); 
        
//       add(np,BorderLayout.NORTH);
//       add(wp,BorderLayout.WEST);
//       add(ep,BorderLayout.EAST);
//       add(sp, BorderLayout.SOUTH);
//       
//              np.add(b1);
//              np.add(b2);
//              np.add(b3);
//              
//              np.add(c);
//              ep.add(t);
//              
//              sp.add(table);
              
           p.setPreferredSize(new Dimension(850,700));
           
              pnp.add(b1);
              pnp.add(b2);
              pnp.add(b3);
              
              pnp.add(cl);pnp.add(c); 
              np.add(pnp);
              
                      
              
              
              
              wp.add(l1);wp.add(f1);
              wp.add(l2);wp.add(f2);
              wp.add(l3);wp.add(f3);
              wp.add(l4);wp.add(f4);
            
              ep.add(t);
              
            p.add(np,BorderLayout.NORTH);
            p.add(wp,BorderLayout.WEST);
            p.add(ep,BorderLayout.EAST);
            
            sp.add(table,BorderLayout.SOUTH);
            p.add(new JScrollPane(table));
            

              setVisible(true);
              pack();
        
            }
            
            
        }
   }
}
