package com.gspann.timeslice.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
public class PropertiesUtil {
	
	private static Properties prop = null;
	
	public static String EVENTS_TABLE;
	public static String EVENTS_METRICS_BY_MONTHS_TABLE;
	public static String EVENTS_METRICS_BY_TIMESTAMP_TABLE;
	public static String DATE_TABLE;
	
	
	static {
		prop = new Properties();
		InputStream is = PropertiesUtil.class.getResourceAsStream("application.properties");
		try {
			prop.load(is);
			EVENTS_TABLE = prop.getProperty("events_table");
			EVENTS_METRICS_BY_MONTHS_TABLE = prop.getProperty("events_metrics_by_months_table");
			EVENTS_METRICS_BY_TIMESTAMP_TABLE = prop.getProperty("events_metrics_by_timestamp_table");
			DATE_TABLE = prop.getProperty("date_table");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	

}
