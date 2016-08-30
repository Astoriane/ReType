package com.saegusa.retype;

import java.util.Scanner;

import com.saegusa.retype.core.Engine;
import com.saegusa.retype.core.Login;
import com.saegusa.retype.core.Session;

public class Main {
	
	private static boolean secure = true;
	
	public static Session session;
	public static Engine retype;

	public static void main(String[] args) {
		
		retype = new Engine(session);
		
		if (secure) {
			userCreds();
		}
			
		else
			return;
		
		retype.log("user = " + session.getId());
		retype.log("pass = " + session.getPass());
		
		retype.log("Logging in...");
		
		boolean userLogged = Login.logUser(session.getId(), session.getPass());
		
		if (userLogged) {
			retype.log("User successfully logged in as " + session.getId());
			session.logUser();
		} else {
			retype.log("Username or password was incorrect.");
			return;
		}
			
		
		
	}
	
	private static void userCreds() {
		
		if (retype != null) {
			String user, pass;
			Scanner input = new Scanner(System.in);
			
			retype.userInput("Username:");
			user = input.nextLine();
			retype.userInput("Password:");
			pass = input.nextLine();
			
			session = new Session(user, pass);
			
			input.close();
			
		} else
			return;
	}

}
