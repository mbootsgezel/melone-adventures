package server;

import client.Client;

public class Starter {

	public static void main(String[] args){
		
		new Thread(Server.getInstance()).start();
		new Thread(Client.getInstance()).start();
		
	}
	
}
