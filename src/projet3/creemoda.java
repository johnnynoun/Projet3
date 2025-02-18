
package projet3;

import javax.swing.*;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


public class creemoda extends Achat{
   
    JPanel p, rp, cc, tx, b, tp;
                JLabel l1, l2, l3, l4, cl, e, e1, e2, e3, e4;
                JButton b1, b2, b3;
                JList t;
                JTable table;
                JTextField f1, f2, f3, f4;
                JComboBox c;
                JFrame frame;
                
                
    public creemoda(JFrame f, String dt, String frn){
        super(dt, frn);
        
    JFrame frame= f;
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

                String[] h = {"Article", "Quantite", "Cout Unit", "Cout Total"};
                DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
                model.setColumnIdentifiers(h);

                table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                table.setFillsViewportHeight(true);

                table.setEnabled(false);

                JLabel l = new JLabel("Détails Achats");

                cl = new JLabel("Choisir Fournisseur  ");

                c = new JComboBox<>();
                c.addItem("                                                 ");

                b1 = new JButton("Creer");
                b2 = new JButton("Enregistrer");
                b3 = new JButton("Quitter");
                
                b1.addActionListener(new ButtonListener());
                b2.addActionListener(new ButtonListener());
                b3.addActionListener(new ButtonListener());
                
                t = new JList();
                TitledBorder title1;
                title1 = BorderFactory.createTitledBorder("Achats");
                title1.setTitleJustification(TitledBorder.CENTER);
                t.setBorder(title1);
                t.setPreferredSize(new Dimension(330, 260));

                e = new JLabel("                                                                                      ");
                e1 = new JLabel("                                                                                      ");
                e2 = new JLabel("                                                                                      ");
                e3 = new JLabel("                                                                                      ");
                e4 = new JLabel("                                                                                      ");

                l1 = new JLabel("         No Achat  ");
                l2 = new JLabel("     Description  ");
                l3 = new JLabel("      Date Achat  ");
                l4 = new JLabel("Montant Achat  ");

                f1 = new JTextField(15);
                f2 = new JTextField(15);
                f3 = new JTextField(15);
                f3.setToolTipText("dd/mm/yyyy");
                f4 = new JTextField(15);

                TitledBorder title2;

                title2 = BorderFactory.createTitledBorder("Infos Achats");
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

                tp.add(l, BorderLayout.WEST);
                tp.add(scrollPane, BorderLayout.SOUTH);
                scrollPane.setPreferredSize(new Dimension(100, 200));

                b.setPreferredSize(new Dimension(300, 300));

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

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();
           
              if (ob == b1){  
                b1.setEnabled(false);
               f1.setEnabled(false);
               String dt = f3.getText();
               f2.setEnabled(false);
               f4.setEnabled(false);
               String frn =c.getSelectedItem().toString();
               
                 
               Achat a = new Achat(dt, frn) {
                   
                    public int compareTo(Object a) {
                            throw new UnsupportedOperationException("Not supported yet.");
                    }
            };
             a.toString(f1, f2, f4);
               
               
            }
            
             if (ob == b2){
         b1.setEnabled(true);
   
         ArrayList<String> vente= new ArrayList<String>();
               vente.add(f1.getText());
               vente.add(f2.getText());
               vente.add(c.getSelectedItem().toString());  
               vente.add(f3.getText());
               vente.add(f4.getText());
               
               
               ArrayList<ArrayList> ventes = new ArrayList<ArrayList>();
               ventes.add(vente);
               
               String liste= ventes.get(0).toString();
              try{
                   FileWriter writer = new FileWriter("creemodv.txt", true);
                   writer.write(System.getProperty("line.separator"));
                   writer.write(liste);
                   
                   writer.close();
                   
                   JOptionPane.showMessageDialog(frame, "Succes");
   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(frame, "Error");
               }
               
               f1.setText(null);
               f2.setText(null);
               f3.setText(null);
               c.setSelectedIndex(0);
               f4.setText(null);
               
            }
         
                
            
            if (ob== b3){
              
              quitter q = new quitter(frame);  
            }
            
        }
    }
   
}
