package com.saegusa.retype.core;

public class Session {
	
	private String id, pass;
	
	public boolean logged;
	
	public Session(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void logUser() {
		logged = true;
	}

}
