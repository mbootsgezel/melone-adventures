package model;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class Player {
	private int posX, posY;
	private BufferedImage img;
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public BufferedImage getImg() {
		return img;
	}

	public void setImg(BufferedImage bufferedImage) {
		this.img = bufferedImage;
	}
	
	
}
