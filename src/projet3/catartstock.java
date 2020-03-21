
package projet3;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class catartstock extends Article {
   
    JPanel p, rp, cc, tx, b, tp;
                JLabel l1, l2, e, e1, e2, e3;
                JButton b1, b2, b3;
                JList t;
                JTextField f1, f2;
                JTable table;
                JFrame frame;
                
                
    public catartstock(JFrame f, int ns, int na, String noma, int qus, Double pv, Double ca, Double tpf){
        super(ns, na, noma, qus, pv, ca, tpf);
        
        JFrame frame = f;
             frame.getContentPane().removeAll();

                

                p = new JPanel(new BorderLayout());
                frame.setLayout(new FlowLayout());
                rp = new JPanel(new BorderLayout());
                b = new JPanel();
                cc = new JPanel(new FlowLayout());
                tx = new JPanel(new FlowLayout());

                tp = new JPanel(new BorderLayout());

                int numColoumns = 6;
                int numRows = 25;

                String[] h = {"No Article", "Nom Article", "Qtte Stock", "Prix Vente", "Cout Achat", "Profit"};
                DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
                model.setColumnIdentifiers(h);

                table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                table.setFillsViewportHeight(true);

                table.setEnabled(false);
                JLabel l = new JLabel("Articles");

                b1 = new JButton("Creer");
                b2 = new JButton("Enregistrer");
                b3 = new JButton("Quitter");
                
                b1.addActionListener(new ButtonListener());
                b2.addActionListener(new ButtonListener());
                b3.addActionListener(new ButtonListener());

                t = new JList();
                TitledBorder title1;
                title1 = BorderFactory.createTitledBorder("Categories");
                title1.setTitleJustification(TitledBorder.LEFT);
                t.setBorder(title1);
                t.setPreferredSize(new Dimension(330, 260));

                e = new JLabel("                                                                                                  ");
                e1 = new JLabel("                                                                                                  ");
                e2 = new JLabel("                                                                                                 ");
                e3 = new JLabel("                                                                                                                           ");

                l1 = new JLabel("    No Categorie  ");
                l2 = new JLabel("Nom Categorie  ");

                f1 = new JTextField(15);
                f2 = new JTextField(15);

                TitledBorder title2;

                title2 = BorderFactory.createTitledBorder("Categorie Article");
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
                b.add(l1);
                b.add(f1);
                b.add(e2);
                b.add(l2);
                b.add(f2);
                b.add(e3);

                tp.add(l, BorderLayout.WEST);
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
              
               
            }
            
             if (ob == b2){
              
               
            }
            
         
            
            
            if (ob== b3){
              
              quitter q = new quitter(frame);  
            }
            
        }
    }
}
