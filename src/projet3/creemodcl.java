
package projet3;

import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class creemodcl extends Client{
    
   JPanel p, rp, cc, tx, b, tp;
                JLabel l1, l2, l3, l4, e, e1, e2, e3, e4, e5, r;
                JButton b1, b2, b3;
                JList t;
                JRadioButton r1, r2, r3;
                JTextField f1, f2, f4;
                JComboBox <String> f3;
                JTable table;
                JFrame frame;
                
                
                
    public creemodcl(JFrame f,String nmc, String v){
        super(nmc, v);
        
        JFrame frame = f;
             frame.getContentPane().removeAll();


                p = new JPanel(new BorderLayout());
                frame.setLayout(new FlowLayout());
                rp = new JPanel(new BorderLayout());
                b = new JPanel();
                cc = new JPanel(new FlowLayout());
                tx = new JPanel(new FlowLayout());

                tp = new JPanel(new BorderLayout());

                int numColoumns = 4;
                int numRows = 25;

                String[] h = {"No Trs", "Type Trs", "Date Trs", "Montant Trs"};
                DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
                model.setColumnIdentifiers(h);

                table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                table.setFillsViewportHeight(true);

                table.setEnabled(false);

               l3 = new JLabel("         Ville     ");

                
               f3 = new JComboBox <>();
              
                f3.addItem("                                               ");
                f3.addItem("Batroun");
                f3.addItem("Beyrouth");
                f3.addItem("Jbeil");
                f3.addItem("Jounieh");
                f3.addItem("Sayda");
                f3.addItem("Sour");
                f3.addItem("Tripoli");
            
                b1 = new JButton("Creer");
                b2 = new JButton("Enregistrer");
                b3 = new JButton("Quitter");
                
                b1.addActionListener(new ButtonListener()); 
                b2.addActionListener(new ButtonListener()); 
                b3.addActionListener(new ButtonListener());

                t = new JList();
                TitledBorder title1;
                title1 = BorderFactory.createTitledBorder("Clients");
                title1.setTitleJustification(TitledBorder.CENTER);
                t.setBorder(title1);
                t.setPreferredSize(new Dimension(330, 260));

                e = new JLabel("                                                                                                  ");
                e1 = new JLabel("                                                                                                  ");
                e2 = new JLabel("                                                                                                 ");
                e3 = new JLabel("                                                                                                                           ");
                e4 = new JLabel("                                                                                                                                                      ");
                e5 = new JLabel("                                                                                                 ");

                l1 = new JLabel("  No Client   ");
                l2 = new JLabel("Nom Client  ");

                l4 = new JLabel("        Solde   ");

                f1 = new JTextField(15);
                f2 = new JTextField(15);

                f4 = new JTextField(15);

               
                r = new JLabel("Etat Compte   ");

                r1 = new JRadioButton("Actif", true);
                r2 = new JRadioButton("Fermer");
                r3 = new JRadioButton("Suspendu");
                ButtonGroup mode = new ButtonGroup();
                mode.add(r1);
                mode.add(r2);
                mode.add(r3);

               
                TitledBorder title2;

                title2 = BorderFactory.createTitledBorder("Infos Clients");
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
                b.add(l1);
                b.add(f1);
                b.add(e2);
                b.add(l2);
                b.add(f2);
                b.add(e3);
                b.add(l3);
                b.add(f3);
                b.add(e4);
                b.add(l4);
                b.add(f4);
                b.add(e5);
                b.add(r);
                b.add(r1);
                b.add(r2);
                b.add(r3);

                tp.add(scrollPane, BorderLayout.SOUTH);
                scrollPane.setPreferredSize(new Dimension(100, 200));

                b.setPreferredSize(new Dimension(350, 300));

                p.add(b, BorderLayout.WEST);
                p.setOpaque(true);
                p.add(rp, BorderLayout.EAST);

                p.add(tp, BorderLayout.SOUTH);
                rp.setPreferredSize(new Dimension(350, 300));

                p.setPreferredSize(new Dimension(750, 550));
                
                frame.getContentPane().add(p);

                frame.setVisible(true);
                frame.pack();
       

    }

       public class ButtonListener implements ActionListener {
      

        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();
           
            if (ob == b1){
               
               b1.setEnabled(false);
               f1.setEnabled(false);
               String nomc= f2.getText();
               String v =f3.getSelectedItem().toString();
               f4.setEnabled(false);
  
               Compte c = new Compte(nomc, v) {
                   
                    public int compareTo(Object t) {
                            throw new UnsupportedOperationException("Not supported yet.");
                    }
            };
             c.toString(f1, f2, f4);
               
            }  
           if (ob== b2){
            
               b1.setEnabled(true);
               ArrayList<String> clients= new ArrayList<String>();
               clients.add(f1.getText());
               clients.add(f2.getText());
               clients.add(f3.getSelectedItem().toString());  
               clients.add(f4.getText());
               
               if(r1.isSelected() ){
                   clients.add("Actif");
                   
               }else if(r2.isSelected() ){
                   clients.add("Fermer");
                   
               }else if (r3.isSelected()){
                   clients.add("Suspendu");
               }
               
           
               ArrayList<ArrayList> clientss = new ArrayList<ArrayList>();
               clientss.add(clients);
               
               String liste= clientss.get(0).toString();
              try{
                   FileWriter writer = new FileWriter("creemodcl.txt", true);
                   writer.write(System.getProperty("line.separator"));
                   writer.write(liste);
                   
                   writer.close();
                   
                   JOptionPane.showMessageDialog(frame, "Succes");
   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(frame, "Error");
               }
               
               f1.setText(null);
               f2.setText(null);
               f3.setSelectedIndex(0);
               f4.setText(null);
         
               
           }
           
            if (ob== b3){
              
              quitter q = new quitter(frame);  
            }
           
            
          
    
        }
       }
      
       
}