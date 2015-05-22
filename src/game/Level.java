package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import model.Player;

public class Level extends JPanel{
	Player player1 = new Player();
	public Level() {
		setBackground(Color.RED);
		
//		try {
//			player1.setImg(ImageIO.read(new File("C:/image.jpg")));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		BufferedImage img = player1.getImg();
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(img, player1.getPosX(), player1.getPosY(), 20, 30, null);
		setBackground(Color.BLUE);
		
		
		

	}
}
