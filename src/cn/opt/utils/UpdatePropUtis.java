package cn.opt.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class UpdatePropUtis{
	private static  Properties prop = new Properties();
	
	private final static String file = "F:\\apache-tomcat-9.0.2\\webapps\\Opoint\\WEB-INF\\classes\\cnt.properties";
	static{
		try {
			prop.load(new FileInputStream(file));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public static void setProper(String key,String value) throws Exception{
		prop.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos, null);
		fos.close();
	}
}