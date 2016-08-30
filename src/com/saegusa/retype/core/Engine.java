package com.saegusa.retype.core;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Engine {
	
	private Session session;
	
	private List<String> filesLoaded;
	
	public Engine(Session session) {
		this.session = session;
	}
	
	public void rename() {
		
	}
	
	public void renameFile(String file, String name) {
		
		
		
	}
	
	public void loadFile(String file) {
		if (filesLoaded == null)
			filesLoaded = new ArrayList<String>();
		
		if(new File(file).exists())
			filesLoaded.add(file);
		else
			log("File does not exist!");
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