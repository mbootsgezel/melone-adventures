package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;

import entities.User;
import model.CurrentDate;

public class Server implements Runnable{
	
	private static Server instance;
	
	private ArrayList <ClientConnection> clients = new ArrayList<ClientConnection>();
	private ArrayList <User> users = new ArrayList<User>();
	private CurrentDate d = new CurrentDate();
	
	private boolean running;
	
	private ServerSocket serverSocket;
	
	private int uniqueid;
	private int port = 1500;
	
	private Server() {
		this.clients = new ArrayList <ClientConnection>();
		this.users = new ArrayList <User>();
		this.running = true;
	}

	@Override
	public void run() {
		try {
			serverSocket = new ServerSocket(port);
		} catch (IOException e){
			displayError("Port is already in use.");
		}
		
		try {
			display("Waiting for connections on port " + port + ".");
			
			while(running) {
				clients.add(new ClientConnection(serverSocket.accept(), ++uniqueid));
				
				if(!running){
					break;
				}
			}
		} catch (IOException e) {
			displayError(e.getMessage());
		}
		
	}
	
	/*
	 * Adding a user to the userlist
	 */
	public void addUser(User user){
		//display("User added to server.userlist");
		users.add(user);
	}
	
	public void remove(int id, User user){
		for(int i = 0; i < clients.size(); i++){
			if(clients.get(i).getConnectionID() == id){
				clients.remove(i);
			}
		}
	}
	
	private void display(String s){
		System.out.println(d.now() + " Server - " + s);
	}

	private void displayError(String s){
		System.err.println(d.now() + " Server - " + s);
	}
	
	public static Server getInstance(){
		if(instance == null){
			instance = new Server();
		}
		return instance;
	}

}
