import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class dockScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dockScreen frame = new dockScreen();
					frame.setVisible(true);
					frame.setSize(new Dimension (345, 514));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
public dockScreen() {
    	
        //construct preComponents
        String[] jcomp3Items = {"Sim 1", "Sim 2", "Sim 3"};

        JButton jcomp1 = new JButton(new ImageIcon("Button.jpg"));
        JList jcomp3 = new JList (jcomp3Items);
        JButton jcomp4 = new JButton(new ImageIcon("Button0.jpg"));

        //adjust size and set layout
        setPreferredSize (new Dimension (330, 475));
        getContentPane().setLayout (null);

        //add components
        getContentPane().add (jcomp1);
        getContentPane().add (jcomp3);
        getContentPane().add (jcomp4);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (109, 330, 110, 60);
        jcomp3.setBounds (110, 170, 105, 130);
        jcomp4.setBounds (109, 405, 110, 60);
        
        JLabel background;
    	ImageIcon img = new ImageIcon("Background.jpg");
    	background = new JLabel("", img, JLabel.CENTER);
    	background.setBounds(0,0,330,475);
    	getContentPane().add(background);
    	setVisible(true);
    	
    	jcomp1.addActionListener(new ActionListener()
    	{
    	  public void actionPerformed(ActionEvent e)
    	  {
    	    // display/center the jdialog when the button is pressed
    	    mainFrame.init();
    	    dispose();
    	    
    	  }
    	});
//    	Icon i=new ImageIcon("Button.jpg");
//    	
//    	jcomp1.setIcon(i);
    }

}
