package com.java.seleniumframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileDemo {
	
	static Properties prop=new Properties();
	static String projectpath=System.getProperty("user.dir");;

	public static void main(String[] args) throws IOException {
		
		getproperties();
		setproperties();
		getproperties();
	}
	
	public static void getproperties() throws IOException {
	
			InputStream input=new FileInputStream(projectpath+"/configprop/config.properties");
			prop.load(input);
			String browser1=prop.getProperty("browser");
			System.out.println("browser1");
			TestNg_propertiesfile.browsername=browser1;
		}
	
	public static void setproperties() throws IOException {
		
			OutputStream output=new FileOutputStream(projectpath+"/configprop/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, "set browser");
			}
}
