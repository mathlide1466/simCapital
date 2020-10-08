import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class mainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void init() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainFrame frame = new mainFrame();
					frame.setVisible(true);
					frame.setSize(new Dimension (944, 574));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
public mainFrame() throws IOException {
	
	TransparentImageButton btn1 = new TransparentImageButton(new File("Button2.png"));
	    btn1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Clicky!!");
	        }
	    });
	    
	    
	    TransparentImageButton btn2 = new TransparentImageButton(new File("Button2.png"));
	    btn2.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Clicky!!");
	        }
	    });
	    
	    TransparentImageButton btn3 = new TransparentImageButton(new File("Button2.png"));
	    btn3.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Clicky!!");
	        }
	    });
	    
	    TransparentImageButton btn4 = new TransparentImageButton(new File("Button2.png"));
	    btn4.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Clicky!!");
	        }
	    });
	    
	    TransparentImageButton btn5 = new TransparentImageButton(new File("Button2.png"));
	    btn5.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Clicky!!");
	        }
	    });
	    
	    
	    TransparentImageButton btn6 = new TransparentImageButton(new File("Button3.png"));
	    btn1.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            System.out.println("Clicky!!");
	        }
	    });
	    
	    btn1.addMouseListener(new java.awt.event.MouseAdapter() {
	        public void mouseEntered(java.awt.event.MouseEvent evt) {
	            btn1.setVisible(false);
	            btn6.setVisible(true);
	        }

	        public void mouseExited(java.awt.event.MouseEvent evt) {
	        	btn6.setVisible(false);
	            btn1.setVisible(true);
	        }
	    });
	    getContentPane().add(btn1);
	    getContentPane().add(btn2);
	    getContentPane().add(btn3);
	    getContentPane().add(btn4);
	    getContentPane().add(btn5);
	    
	    getContentPane().add(btn6);
	    
	    
	
	    btn1.setBounds(0, 30, 206, 85);
	    btn6.setBounds(0, 30, 206, 85);
	    
	    btn2.setBounds(0, 116, 206, 85);
	    btn3.setBounds(0, 202, 206, 85);
	    btn4.setBounds(0, 288, 206, 85);
	    btn5.setBounds(0, 374, 206, 85);
	
	
    	
        
        JLabel background;
    	ImageIcon img = new ImageIcon("gameBackground.jpg");
    	background = new JLabel("", img, JLabel.CENTER);
    	background.setBounds(0,0,928,535);
    	getContentPane().add(background);
    
    	setVisible(true);
    	
    	
    	    
    	
//    	Icon i=new ImageIcon("Button.jpg");
//    	
//    	jcomp1.setIcon(i);
    }

}
