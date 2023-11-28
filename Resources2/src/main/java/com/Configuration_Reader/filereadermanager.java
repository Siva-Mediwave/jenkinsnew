package com.Configuration_Reader;

import java.io.IOException;

public class filereadermanager {

	private filereadermanager() {

	}

	public static filereadermanager getInstanceFRM() {

		filereadermanager FRM = new filereadermanager();

		return FRM;
	}

	public configurationreader getInstanceCR() throws IOException {

		configurationreader reader = new configurationreader();

		return reader;

	}

}
	
	
	
	
	
	
	
	
	
	
	
	

