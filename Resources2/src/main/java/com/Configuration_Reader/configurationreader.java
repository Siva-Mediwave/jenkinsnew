package com.Configuration_Reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationreader {

	public static Properties p;

	public configurationreader() throws IOException {

		FileInputStream f = new FileInputStream(
				"C:\\Users\\Mediwave Digital\\Downloads\\Resources (1)\\Resources\\src\\main\\java\\com\\Configuration_properties\\config.properties");

		// FileInputStream fis = new FileInputStream(f);

		p = new Properties();
		p.load(f);
	}

	public String getemail() {

		String email = p.getProperty("Email");
		System.out.println(email);
		return email;
	}

	public String getpassword() {

		String pass = p.getProperty("Password");
		return pass;

	}

	public String getuserc() {

		String userc = p.getProperty("UserC");
		return userc;

	}

	public String getemail1() {

		String email1 = p.getProperty("Email1");
		return email1;

	}

	public String getusera() {

		String usera = p.getProperty("UserA");
		return usera;

	}

	public String getemail2() {

		String email2 = p.getProperty("Email2");
		return email2;

	}

	public String getsysemail() {

		String sysemail = p.getProperty("Sysemail");
		return sysemail;

	}

	public String getsyspass() {

		String syspass = p.getProperty("Syspass");
		return syspass;

	}

	public String getcemail() {

		String cemail = p.getProperty("Cemail");
		return cemail;

	}

	public String getcpass() {

		String cpass = p.getProperty("Cpass");
		return cpass;

	}

	public String gettags() {

		String tags = p.getProperty("Tags");
		return tags;

	}

	public String gettitle() {

		String title = p.getProperty("Title");
		return title;

	}

	public String getaemail() {

		String aemail = p.getProperty("Aemail");
		return aemail;

	}
	
	public String getapass() {

		String apass = p.getProperty("Apass");
		return apass;

	}
	
	public String getLink() {

		String Link = p.getProperty("link");
		return Link;

	
	
}
}