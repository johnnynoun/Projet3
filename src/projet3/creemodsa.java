
package projet3;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;


public class creemodsa extends Article{
    
   JPanel p, rp, cc, tx, b, tp;
   JLabel l1, l2, l3, l4, l5, l6, cl, e, e1, e2, e3, e4, e5;
   JButton b1, b2, b3;
   JList t;
   JTable table;
   JTextField f1, f2, f3, f4, f5, f6;   
    JFrame frame;
    
    public creemodsa(JFrame f,int ns, int na, String noma, int qus, Double pv, Double ca, Double tpf){
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

                String[] h = {"No Trs", "Type Trs", "Date Trs", "Quantite", "Prix/Cout", "Total"};
                DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
                model.setColumnIdentifiers(h);

                table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                table.setFillsViewportHeight(true);

                table.setEnabled(false);

                JLabel l = new JLabel("Transactions Articles");

                cl = new JLabel("Choisir Categorie");

                JComboBox<String> c = new JComboBox<>();
                c.addItem("                                                 ");
                b1 = new JButton("Creer");
                b2 = new JButton("Enregistrer");
                b3 = new JButton("Quitter");
            
            b1.addActionListener(new ButtonListener());    
            b2.addActionListener(new ButtonListener());
            b3.addActionListener(new ButtonListener());
                
                t = new JList();
                TitledBorder title1;
                title1 = BorderFactory.createTitledBorder("Articles");
                title1.setTitleJustification(TitledBorder.CENTER);
                t.setBorder(title1);
                t.setPreferredSize(new Dimension(330, 260));

                e = new JLabel("                                                                                      ");
                e1 = new JLabel("                                                                                      ");
                e2 = new JLabel("                                                                                      ");
                e3 = new JLabel("                                                                                      ");
                e4 = new JLabel("                                                                                      ");
                e5 = new JLabel("                                                                                                              ");

                l1 = new JLabel("  Numero Article  ");
                l2 = new JLabel("        Nom Article  ");
                l3 = new JLabel("  Quantite Stock  ");
                l4 = new JLabel("         Prix Vente  ");
                l5 = new JLabel("       Cout Achat   ");
                l6 = new JLabel("                  Profit  ");

                f1 = new JTextField(15);
                f2 = new JTextField(15);
                f3 = new JTextField(15);
                f4 = new JTextField(15);
                f5 = new JTextField(15);
                f6 = new JTextField(15);

                TitledBorder title2;

                title2 = BorderFactory.createTitledBorder("Infos Articles");
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
                b.add(l1);
                b.add(f1);
                b.add(e1);
                b.add(l2);
                b.add(f2);
                b.add(e2);
                b.add(l3);
                b.add(f3);
                b.add(e3);
                b.add(l4);
                b.add(f4);
                b.add(e4);
                b.add(l5);
                b.add(f5);
                b.add(e5);
                b.add(l6);
                b.add(f6);

                tp.add(l, BorderLayout.WEST);
                tp.add(scrollPane, BorderLayout.SOUTH);
                scrollPane.setPreferredSize(new Dimension(100, 200));

                b.setPreferredSize(new Dimension(300, 300));

                p.add(b, BorderLayout.WEST);
                p.setOpaque(true);
                p.add(rp, BorderLayout.EAST);

                p.add(tp, BorderLayout.SOUTH);
                rp.setPreferredSize(new Dimension(350, 300));

                p.setPreferredSize(new Dimension(750, 570)); 
        
                
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
