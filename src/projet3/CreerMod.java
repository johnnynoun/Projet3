
package projet3;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class CreerMod extends JFrame{
   
    
   private JFrame frame;
    private JPanel np;
private JLabel iv; 

    public CreerMod(){

        frame = new JFrame();
        np = new JPanel();
        iv= new JLabel("Infos Ventes");
        frame.add(np);
        np.add(iv);
        add(frame);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
         setSize(400, 300);
        setVisible(true);
        
    }

}

