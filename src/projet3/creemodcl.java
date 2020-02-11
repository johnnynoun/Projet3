
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
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class creemodcl {
    
    public creemodcl(JFrame f){
        JFrame frame = f;
        
         frame.getContentPane().removeAll();

                JPanel p, rp, cc, tx, b, tp;
                JLabel l1, l2, l3, l4, e, e1, e2, e3, e4, e5, r;
                JButton b1, b2, b3;
                JTextArea t;
                JRadioButton r1, r2, r3;
                JTextField f1, f2, f4;
                JTable table;

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

                JComboBox<String> f3 = new JComboBox<>();
                f3.addItem("                                               ");

                b1 = new JButton("Creer");
                b2 = new JButton("Enregistrer");
                b3 = new JButton("Quitter");

                t = new JTextArea(15, 30);
                TitledBorder title1;
                title1 = BorderFactory.createTitledBorder("Clients");
                title1.setTitleJustification(TitledBorder.CENTER);
                t.setBorder(title1);
                t.setEditable(false);

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
}
