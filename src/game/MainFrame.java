package game;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setUndecorated(true); 
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		Level l = new Level(); 
		add(l);
	}
}
