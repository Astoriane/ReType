package com.saegusa.retype.core;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {
	
	public static boolean logUser(String username, String pass) {
		
		if (username != null && pass != null) {
			
			try {
				List<String> combos = readFile("retype_user.txt");
				
				String uid, password;
				
				for(String combo : combos) {
					
					uid = combo.split(":")[0];
					password = combo.split(":")[1];
					
					if(username.equals(uid)) {
						if (pass.equals(password)) {
							return true;
						} else
							continue;
					} else
						continue;
				}
				
				return false;
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		else
			return false;
		
		return false;
	}
	
	private static List<String> readFile(String filename) throws IOException{
		
		Scanner s = new Scanner(new File(filename));
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNext()){
		    list.add(s.next());
		}
		s.close();
		
		return list;
	    
	}

}
