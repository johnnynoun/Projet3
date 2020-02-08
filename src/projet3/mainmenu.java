
package projet3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
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
         
         i13.addActionListener(new MenuListener());
         
         m13= new JMenu("Recus");
         i15=new JMenuItem("Creer/Modifier");
        i16=new JMenuItem("Rapports");
         m13.add(i15);m13.add(i16);
         
         i15.addActionListener(new MenuListener());
         
         m14= new JMenu("Paiement");
         i17=new JMenuItem("Creer/Modifier");
        i18=new JMenuItem("Rapports");
        m14.add(i17);m14.add(i18);
        
        i17.addActionListener(new MenuListener());
        
         m1.add(m11);m1.add(m12);     m1.add(m13);m1.add(m14);
         
         m2= new JMenu("Comptes");
         
         m21= new JMenu("Clients");
          i21=new JMenuItem("Creer/Modifier");
        i22=new JMenuItem("Rapports");
        m21.add(i21);m21.add(i22);
        
        i21.addActionListener(new MenuListener());
         
         m22= new JMenu("Fournisseurs");
          i23=new JMenuItem("Creer/Modifier");
        i24=new JMenuItem("Rapports");
        m22.add(i23);m22.add(i24);
        
        i23.addActionListener(new MenuListener());
        
       
        m23= new JMenuItem("Villes");
      
    m2.add(m21);m2.add(m22);m2.add(m23);
                  
         m3= new JMenu("Stock");
         
         m31= new JMenu("Articles");
         i31=new JMenuItem("Creer/Modifier");
         i32=new JMenuItem("Rapports");
         m31.add(i31);m31.add(i32);
         
         i31.addActionListener(new MenuListener());
      
           m32= new JMenuItem("Categories Articles");
        
              m3.add(m31);m3.add(m32);
        
        m32.addActionListener(new MenuListener());
        
        
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
       getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,cl,e,e1,e2,e3,e4; 
            JButton b1,b2,b3;
            JTextArea t;
            JTable table;
            JTextField f1,f2,f3,f4;
          
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());

          tp = new JPanel(new BorderLayout());
         
      
          
           
       int numColoumns=4;
      int numRows=25 ;
     
      String[] h = { "Article", "Quantite", "Prix Unit", "Prix Total" };
      DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
      model.setColumnIdentifiers(h);
  
      
      table = new JTable(model);
     JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
     
      table.setEnabled(false);

        JLabel l = new JLabel("Détails Vente");
        
       cl= new JLabel("Choisir Client");
      
       JComboBox<String> c = new JComboBox<>();
       c.addItem("                                                 ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Ventes");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                      ");
        e1= new JLabel("                                                                                      ");
        e2= new JLabel("                                                                                      ");
        e3= new JLabel("                                                                                      ");
        e4= new JLabel("                                                                                      ");
        l1= new JLabel("No Vente");
        l2= new JLabel("Description");
        l3= new JLabel("Date Vente");
        l4= new JLabel("Montant Vente");
        
        f1= new JTextField(17);
        f2= new JTextField(16);
        f3= new JTextField(16);
        f4= new JTextField(14);
        
        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Ventes");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
            cc.add(cl);
            cc.add(c);
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
              b.add(l3);  b.add(f3);
              b.add(e4);
              b.add(l4);  b.add(f4);
              

        tp.add(l, BorderLayout.WEST);
        tp.add(scrollPane, BorderLayout.SOUTH); 
       scrollPane.setPreferredSize(new Dimension(100,200));
        
        b.setPreferredSize(new Dimension(300,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
        
            }
         
            
    // *********************************************************  
    // *********************************************************    
    // ACHATS     
            
            if (ob == i13 ){
     
       getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,cl,e,e1,e2,e3,e4; 
            JButton b1,b2,b3;
            JTextArea t;
            JTable table;
            JTextField f1,f2,f3,f4;
          
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());

          tp = new JPanel(new BorderLayout());
         
      
          
           
       int numColoumns=4;
      int numRows=25 ;
     
      String[] h = { "Article", "Quantite", "Cout Unit", "Cout Total" };
      DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
      model.setColumnIdentifiers(h);
  
      
      table = new JTable(model);
     JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
     
      table.setEnabled(false);

        JLabel l = new JLabel("Détails Achats");
        
       cl= new JLabel("Choisir Fournisseur");
      
       JComboBox<String> c = new JComboBox<>();
       c.addItem("                                                 ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Achats");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                      ");
        e1= new JLabel("                                                                                      ");
        e2= new JLabel("                                                                                      ");
        e3= new JLabel("                                                                                      ");
        e4= new JLabel("                                                                                      ");
      
        l1= new JLabel("No Achat");
        l2= new JLabel("Description");
        l3= new JLabel("Date Achat");
        l4= new JLabel("Montant Achat");
        
        f1= new JTextField(17);
        f2= new JTextField(16);
        f3= new JTextField(16);
        f4= new JTextField(14);
        
        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Achats");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
            cc.add(cl);
            cc.add(c);
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
              b.add(l3);  b.add(f3);
              b.add(e4);
              b.add(l4);  b.add(f4);
              

        tp.add(l, BorderLayout.WEST);
        tp.add(scrollPane, BorderLayout.SOUTH); 
       scrollPane.setPreferredSize(new Dimension(100,200));
        
        b.setPreferredSize(new Dimension(300,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
        
            }
   
    // *********************************************************          
   // *********************************************************  
    // *********************************************************    
    // RECUS    
            
      if (ob == i15 ){
     
       getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,cl,e,e1,e2,e3,e4,e5,r; 
            JButton b1,b2,b3;
            JTextArea t;
            JRadioButton r1,r2,r3;
            JTextField f1,f2,f3,f4;
          
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());

          tp = new JPanel(new BorderLayout());
         
      
          
    
        
       cl= new JLabel("Choisir Client");
      
       JComboBox<String> c = new JComboBox<>();
       c.addItem("                                                 ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Recus");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                                  ");
        e1= new JLabel("                                                                                                  ");
        e2= new JLabel("                                                                                                 ");
        e3= new JLabel("                                                                                                 ");
        e4= new JLabel("                                                                                                 ");
        e5= new JLabel("                                                                                                 ");
        
        l1= new JLabel("No Recus");
        l2= new JLabel("Description");
        l3= new JLabel("Date Recus");
        l4= new JLabel("Montant Recus");
        
        f1= new JTextField(17);
        f2= new JTextField(16);
        f3= new JTextField(16);
        f4= new JTextField(14);
        
        
         r= new JLabel("Mode Paiement");
        
        
        r1= new JRadioButton("Cash", true);
        r2= new JRadioButton("Cheque");
        r3= new JRadioButton("Transfert");
        ButtonGroup mode = new ButtonGroup();
        mode.add(r1);
        mode.add(r2);
        mode.add(r3);
      

        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Recus");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
            cc.add(cl);
            cc.add(c);
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
              b.add(l3);  b.add(f3);
              b.add(e4);
              b.add(l4);  b.add(f4);
              b.add(e5);
              b.add(r);  b.add(r1);  b.add(r2);  b.add(r3);
              

       
        
        b.setPreferredSize(new Dimension(350,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
        
            }
       
     
            
   // *********************************************************  
   // *********************************************************    
   // *********************************************************  
  // Paiement
     
      
      if(ob == i17){
          
      getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,cl,e,e1,e2,e3,e4,e5,r; 
            JButton b1,b2,b3;
            JTextArea t;
            JRadioButton r1,r2,r3;
            JTextField f1,f2,f3,f4;
          
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());

          tp = new JPanel(new BorderLayout());
         
      
  
        
       cl= new JLabel("Choisir Fournisseur");
      
       JComboBox<String> c = new JComboBox<>();
       c.addItem("                                                 ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Paiements");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                                  ");
        e1= new JLabel("                                                                                                  ");
        e2= new JLabel("                                                                                                 ");
        e3= new JLabel("                                                                                                 ");
        e4= new JLabel("                                                                                                 ");
        e5= new JLabel("                                                                                                 ");
        
        l1= new JLabel("No Paiement");
        l2= new JLabel("Description");
        l3= new JLabel("Date Paiement");
        l4= new JLabel("Montant Paiement");
        
        f1= new JTextField(17);
        f2= new JTextField(18);
        f3= new JTextField(16);
        f4= new JTextField(14);
        
        
         r= new JLabel("Mode Paiement");
        
        
        r1= new JRadioButton("Cash", true);
        r2= new JRadioButton("Cheque");
        r3= new JRadioButton("Transfert");
        ButtonGroup mode = new ButtonGroup();
        mode.add(r1);
        mode.add(r2);
        mode.add(r3);
      

        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Paiements");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
            cc.add(cl);
            cc.add(c);
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
              b.add(l3);  b.add(f3);
              b.add(e4);
              b.add(l4);  b.add(f4);
              b.add(e5);
              b.add(r);  b.add(r1);  b.add(r2);  b.add(r3);
              

      
        
        b.setPreferredSize(new Dimension(350,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
        
            }
 
      
      
  
    // *********************************************************  
    // *********************************************************    
    //Comptes Clients  
      
            
    if( ob == i21) {   
    getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,e,e1,e2,e3,e4,e5,r; 
            JButton b1,b2,b3;
            JTextArea t;
            JRadioButton r1,r2,r3;
            JTextField f1,f2,f4;
             JTable table;
             
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());
          
          tp = new JPanel(new BorderLayout());
         
      
          
           
       int numColoumns=4;
      int numRows=25 ;
     
      String[] h = { "No Trs", "Type Trs", "Date Trs", "Montant Trs" };
      DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
      model.setColumnIdentifiers(h);
  
    table = new JTable(model);
     JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
     
      table.setEnabled(false);

        
       l3= new JLabel("Ville");
      
       JComboBox<String> f3 = new JComboBox<>();
       f3.addItem("                                                                 ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Clients");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                                  ");
        e1= new JLabel("                                                                                                  ");
        e2= new JLabel("                                                                                                 ");
        e3= new JLabel("                                                                                                                           ");
        e4= new JLabel("                                                                                                                                                      ");
        e5= new JLabel("                                                                                                 ");
        
        l1= new JLabel("No Client");
        l2= new JLabel("Nom Client");
     
        
        l4= new JLabel("Solde");
        
        f1= new JTextField(17);
        f2= new JTextField(16);
      
        f4= new JTextField(19);
        
        
         r= new JLabel("Etat Compte");
        
        
        r1= new JRadioButton("Actif", true);
        r2= new JRadioButton("Fermer");
        r3= new JRadioButton("Suspendu");
        ButtonGroup mode = new ButtonGroup();
        mode.add(r1);
        mode.add(r2);
        mode.add(r3);
      

        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Clients");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
           
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
              b.add(l3);  b.add(f3);
              b.add(e4);
              b.add(l4);  b.add(f4);
              b.add(e5);
              b.add(r);  b.add(r1);  b.add(r2);  b.add(r3);
              

      tp.add(scrollPane, BorderLayout.SOUTH); 
       scrollPane.setPreferredSize(new Dimension(100,200));
        
        b.setPreferredSize(new Dimension(350,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
    } 
    
    
     // *********************************************************  
    // *********************************************************    
    //Comptes Fournisseurs
    
      
            
    if( ob == i23) {   
    getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,e,e1,e2,e3,e4,e5,r; 
            JButton b1,b2,b3;
            JTextArea t;
            JRadioButton r1,r2,r3;
            JTextField f1,f2,f4;
             JTable table;
             
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());
          
          tp = new JPanel(new BorderLayout());
         
      
          
           
       int numColoumns=4;
      int numRows=25 ;
     
      String[] h = { "No Trs", "Type Trs", "Date Trs", "Montant Trs" };
      DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
      model.setColumnIdentifiers(h);
  
    table = new JTable(model);
     JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
     
      table.setEnabled(false);

        
       l3= new JLabel("Vile");
      
       JComboBox<String> f3 = new JComboBox<>();
       f3.addItem("                                                                      ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Fournisseurs");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                                  ");
        e1= new JLabel("                                                                                                  ");
        e2= new JLabel("                                                                                                 ");
        e3= new JLabel("                                                                                                                           ");
        e4= new JLabel("                                                                                                                                                      ");
        e5= new JLabel("                                                                                                 ");
        
        l1= new JLabel("No Fournisseur");
        l2= new JLabel("Nom Fournisseur");
     
        
        l4= new JLabel("Solde");
        
        f1= new JTextField(15);
        f2= new JTextField(14);
      
        f4= new JTextField(20);
        
        
         r= new JLabel("Etat Compte");
        
        
        r1= new JRadioButton("Actif", true);
        r2= new JRadioButton("Fermer");
        r3= new JRadioButton("Suspendu");
        ButtonGroup mode = new ButtonGroup();
        mode.add(r1);
        mode.add(r2);
        mode.add(r3);
      

        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Fournisseurs");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
           
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
              b.add(l3);  b.add(f3);
              b.add(e4);
              b.add(l4);  b.add(f4);
              b.add(e5);
              b.add(r);  b.add(r1);  b.add(r2);  b.add(r3);
              

      tp.add(scrollPane, BorderLayout.SOUTH); 
       scrollPane.setPreferredSize(new Dimension(100,200));
        
        b.setPreferredSize(new Dimension(350,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
    } 
      
            
    
    
     // *********************************************************  
    // *********************************************************    
    //Stock
    //INFO Articles
    
      
    
    
    
    
    
    if( ob == i31) {  
      getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,l3,l4,l5,l6,cl,e,e1,e2,e3,e4,e5; 
            JButton b1,b2,b3;
            JTextArea t;
            JTable table;
            JTextField f1,f2,f3,f4,f5,f6;
          
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());

          tp = new JPanel(new BorderLayout());
         
      
          
           
       int numColoumns=6;
      int numRows=25 ;
     
      String[] h = { "No Trs", "Type Trs", "Date Trs", "Quantite", "Prix/Cout", "Total" };
      DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
      model.setColumnIdentifiers(h);
  
      
      table = new JTable(model);
     JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
     
      table.setEnabled(false);

        JLabel l = new JLabel("Transactions Articles");
        
       cl= new JLabel("Choisir Categorie");
      
       JComboBox<String> c = new JComboBox<>();
       c.addItem("                                                 ");                                
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Articles");
        title1.setTitleJustification(TitledBorder.CENTER);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                      ");
        e1= new JLabel("                                                                                      ");
        e2= new JLabel("                                                                                      ");
        e3= new JLabel("                                                                                      ");
        e4= new JLabel("                                                                                      ");
        e5= new JLabel("                                                                                                              ");
        
        l1= new JLabel("Numero Article");
        l2= new JLabel("Nom Article  ");
        l3= new JLabel("Quantite Stock");
        l4= new JLabel("Prix Vente");
        l5= new JLabel("Cout Achat");
        l6= new JLabel (" Profit ");
        
        
        f1= new JTextField(17);
        f2= new JTextField(18);
        f3= new JTextField(17);
        f4= new JTextField(19);
        f5= new JTextField(19);
        f6= new JTextField(21);        
        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Infos Articles");
        title2.setTitleJustification(TitledBorder.CENTER);
        p.setBorder(title2);
        
      
  
            cc.add(cl);
            cc.add(c);
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
          
              b.add(e);
              b.add(l1);  b.add(f1);
              b.add(e1);
              b.add(l2);  b.add(f2);
              b.add(e2);
              b.add(l3);  b.add(f3);
              b.add(e3);
              b.add(l4);  b.add(f4);
              b.add(e4);
              b.add(l5);  b.add(f5);
              b.add(e5);
              b.add(l6);  b.add(f6);
              
        tp.add(l, BorderLayout.WEST);
        tp.add(scrollPane, BorderLayout.SOUTH); 
       scrollPane.setPreferredSize(new Dimension(100,200));
        
        b.setPreferredSize(new Dimension(300,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,570));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
        
            }
    
    
    
    
    
    // *********************************************************  
    // *********************************************************    
    //Stock
    //Categories
    
    
    

    
     if( ob == m32) {   
    getContentPane().removeAll();
                
            JPanel p,rp,cc,tx,b,tp;
            JLabel l1,l2,e,e1,e2,e3;
            JButton b1,b2,b3;
            JTextArea t;
            JTextField f1,f2;
             JTable table;
             
     p =new JPanel(new BorderLayout());
     setLayout(new FlowLayout());
          rp= new JPanel(new BorderLayout());
          b  = new JPanel();
          cc = new JPanel(new FlowLayout());
          tx = new JPanel(new FlowLayout());
          
          tp = new JPanel(new BorderLayout());
         
      
          
           
       int numColoumns=6;
      int numRows=25 ;
     
      String[] h = { "No Article", "Nom Article", "Qtte Stock", "Prix Vente","Cout Achat", "Profit" };
      DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
      model.setColumnIdentifiers(h);

    table = new JTable(model);
     JScrollPane scrollPane = new JScrollPane(table);
      table.setFillsViewportHeight(true);
     
      table.setEnabled(false);
       JLabel l= new JLabel("Articles");
        
                                                                         
   
         b1= new JButton("Creer");
         b2= new JButton("Enregistrer");
         b3= new JButton("Quitter");
      
        t = new JTextArea(15, 30);
        TitledBorder title1;
        title1= BorderFactory.createTitledBorder("Categories");
        title1.setTitleJustification(TitledBorder.LEFT);
        t.setBorder(title1);
        t.setEditable(false);
        
        e= new JLabel("                                                                                                  ");
        e1= new JLabel("                                                                                                  ");
        e2= new JLabel("                                                                                                 ");
        e3= new JLabel("                                                                                                                           ");
                                                                                        
        l1= new JLabel("No Categorie");
        l2= new JLabel("Nom Categorie");
     
        
       
        f1= new JTextField(17);
        f2= new JTextField(16);
      
  

        
       TitledBorder title2;
 
        title2= BorderFactory.createTitledBorder("Categorie Article");
        title2.setTitleJustification(TitledBorder.LEFT);
        p.setBorder(title2);
        
      
  
           
            
            tx.add(t);
            
            rp.add(cc, BorderLayout.NORTH);
            rp.add(tx, BorderLayout.CENTER);
          
     
            
              b.add(b1);
              b.add(b2);
              b.add(b3);
              
              b.add(e);
              b.add(e1);
              b.add(l1);  b.add(f1);
              b.add(e2);
              b.add(l2);  b.add(f2);
              b.add(e3);
       
      tp.add(l, BorderLayout.WEST);
      tp.add(scrollPane, BorderLayout.SOUTH); 
       scrollPane.setPreferredSize(new Dimension(100,200));
        
        b.setPreferredSize(new Dimension(350,300));
        
        p.add(b, BorderLayout.WEST);
        p.setOpaque(true);
        p.add(rp, BorderLayout.EAST);
       
        p.add(tp, BorderLayout.SOUTH);
         rp.setPreferredSize(new Dimension(350,300));
       
         p.setPreferredSize(new Dimension(750,550));
         
         
        
           getContentPane().add(p);

              setVisible(true);
              pack();
    } 
    
    
    
                }
        }
   }
