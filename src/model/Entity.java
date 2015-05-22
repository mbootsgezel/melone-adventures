package model;

import java.io.Serializable;

import entities.User;

public class Entity implements Serializable {

	private static final long serialVersionUID = -8177605505200545692L;
	
	public static final int USER = 0;
	
	private Object o;
	
	private int type;
	
	public Entity(){
		
	}
	
	public Entity(int type, User user) {
		this.type = type;
		this.o = user;
	}
	
	public int getType(){
		return type;
	}
	
	public Object getObject(){
		return o;
	}

}
