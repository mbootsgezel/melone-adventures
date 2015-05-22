package server;

import model.CurrentDate;

public class Server {
	
	private CurrentDate d = new CurrentDate();
	
	public Server() {
		System.out.println(d.now());
	}

}
