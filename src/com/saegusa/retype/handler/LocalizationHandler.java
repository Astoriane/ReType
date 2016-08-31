package com.saegusa.retype.handler;

import java.io.File;

import com.saegusa.retype.Main;
import com.saegusa.retype.ref.Locale;

public class LocalizationHandler {

	public void init() {
		loadLocales();
	}
	
	private void loadLocales() {
		File locDir = new File("res" + File.separator + "locales" + File.separator);
		File loc;
		
		if (!locDir.exists())
			locDir.mkdirs();
		
		for(Locale locale : Locale.values()) {
			loc = new File(locDir.getPath() + locale.getTag() + ".xml");
			
			if(!loc.exists()) {
				Main.retype.log("Defined locale " + locale.getTag() + " was not found in the directory!");
				continue;
			}
		}
		
	}
	
}
