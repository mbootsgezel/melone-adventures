package controller;

public class Player {
	public void move(String direction, model.Player player){
		
	}
	public void left(model.Player player){
		player.setPosX(-10);
	}
	
	public void right(model.Player player){
		player.setPosX(10);
	}
}
