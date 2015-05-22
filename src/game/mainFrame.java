package game;

import javax.swing.JFrame;


public class mainFrame extends JFrame{
	public mainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setUndecorated(true); 
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		Level l = new Level(); 
		add(l);
	}
}
