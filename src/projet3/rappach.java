
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

public class rappach {
    
    JPanel p, up, sp, ce, np, tp;
                JLabel l1, l2, e, e1, e2, e3, e4, e5, cl;
                JButton b1, b2;
                JTextField f1, f2;
                JTable table;
                JFrame frame;
                
    public rappach(JFrame f){
        JFrame frame = f;
        
        
        frame.getContentPane().removeAll();

                

                p = new JPanel(new BorderLayout());
                frame.setLayout(new FlowLayout());
                up = new JPanel();
                ce = new JPanel(new BorderLayout());
                sp = new JPanel();
                np = new JPanel(new BorderLayout());
                tp = new JPanel();

                int numColoumns = 4;
                int numRows = 40;

                String[] h = {"No Achat", "Date Achat", "Fournisseur", "Montant Achat"};
                DefaultTableModel model = new DefaultTableModel(numRows, numColoumns);
                model.setColumnIdentifiers(h);

                table = new JTable(model);
                JScrollPane scrollPane = new JScrollPane(table);
                table.setFillsViewportHeight(true);

                table.setEnabled(false);

                cl = new JLabel("                         Fournisseur      ");

                JComboBox<String> c = new JComboBox<>();
                c.addItem("                                                 ");

                b1 = new JButton("Quitter");
                b2 = new JButton("OK");
                
                b1.addActionListener(new ButtonListener()); 

                l1 = new JLabel("        De date");
                l2 = new JLabel("                    A date");

                e = new JLabel("                                                                                      ");
                e1 = new JLabel("      ");
                e2 = new JLabel("      ");
                e3 = new JLabel("      ");
                e4 = new JLabel("      ");
                e5 = new JLabel("      ");

                f1 = new JTextField(6);
                f2 = new JTextField(6);

                TitledBorder title2;

                title2 = BorderFactory.createTitledBorder("Rapports Achats");
                title2.setTitleJustification(TitledBorder.CENTER);
                p.setBorder(title2);

                up.add(l1);
                up.add(l2);
                up.add(e1);
                up.add(cl);
                up.add(e);
                up.add(b1);

                sp.add(e2);
                sp.add(f1);
                sp.add(e3);
                sp.add(f2);
                sp.add(e4);
                sp.add(c);
                sp.add(e5);
                sp.add(b2);

                tp.add(scrollPane);
                scrollPane.setPreferredSize(new Dimension(740, 400));

                p.add(np, BorderLayout.NORTH);
                np.add(up, BorderLayout.WEST);

                p.add(ce, BorderLayout.CENTER);
                ce.add(sp, BorderLayout.WEST);

                p.add(tp, BorderLayout.SOUTH);

                p.setPreferredSize(new Dimension(750, 550));

        
           frame.getContentPane().add(p);

                frame.setVisible(true);
                frame.pack();  
                
                          
                
    }     public class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            Object ob = event.getSource();
            if (ob== b1){
              
              quitter q = new quitter(frame);  
            }
            
        }
    }
    
    
    
    
}
