
package projet3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class creemodv {
    
    public creemodv(JFrame f){
        JFrame frame= f;
        frame.getContentPane().removeAll();
        
        JPanel p, rp, cc, tx, b, tp;
                JLabel l1, l2, l3, l4, cl, e, e1, e2, e3, e4;
                JButton b1, b2, b3;
                JTextArea t;
                JTable table;
                JTextField f1, f2, f3, f4;

                p = new JPanel(new BorderLayout());
                frame.setLayout(new FlowLayout());
                rp = new JPanel(new BorderLayout());
                b = new JPanel();
                cc = new JPanel(new FlowLayout());
                tx = new JPanel(new FlowLayout());
                tp = new JPanel(new BorderLayout());

                int numColoumns = 4;
                int numRows = 25;
                String[] h = {"Article", "Quantite", "Prix Unit", "Prix Total"};
                DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
                model.setColumnIdentifiers(h);
                table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                table.setFillsViewportHeight(true);
                table.setEnabled(false);

                JLabel l = new JLabel("Détails Vente");
                cl = new JLabel("Choisir Client   ");
                JComboBox<String> c = new JComboBox<>();
                c.addItem("                                                 ");

                b1 = new JButton("Creer");
                b2 = new JButton("Enregistrer");
                b3 = new JButton("Quitter");

                t = new JTextArea(15, 30);
                TitledBorder title1;
                title1 = BorderFactory.createTitledBorder("Ventes");
                title1.setTitleJustification(TitledBorder.CENTER);
                t.setBorder(title1);
                t.setEditable(false);

                e = new JLabel("                                                                                      ");
                e1 = new JLabel("                                                                                      ");
                e2 = new JLabel("                                                                                      ");
                e3 = new JLabel("                                                                                      ");
                e4 = new JLabel("                                                                                      ");
                l1 = new JLabel("         No Vente  ");
                l2 = new JLabel("     Description  ");
                l3 = new JLabel("      Date Vente  ");
                l4 = new JLabel("Montant Vente  ");
                f1 = new JTextField(15);
                f2 = new JTextField(15);
                f3 = new JTextField(15);
                f4 = new JTextField(15);

                TitledBorder title2;

                title2 = BorderFactory.createTitledBorder("Infos Ventes");
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
}
