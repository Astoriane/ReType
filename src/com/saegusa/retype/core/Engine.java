package com.saegusa.retype.core;

public class Engine {
	
	private Session session;
	
	public Engine(Session session) {
		this.session = session;
	}
	
	public Session getSession() {
		return session;
	}
	
	public void userInput(String msg) {
		System.out.print(msg + " ");
	}
	
	public void log(String msg) {
		System.out.println(msg);
	}

}