package com.projectname.utils;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * This Class is to define all the constants
 * 
 * @author Optimus
 *
 */
public class Constants {
	
    public static final Map<String,String> GENERAL_PLACEHOLDERS;
    
    static{
        Hashtable<String,String> tmp = new Hashtable<String,String>();
        
        //TODO Instead of 'Field1' use actual names as present in your response
        tmp.put("Field1", "24845");
        tmp.put("Field2","user");
        tmp.put("Field3", "25168847");
                        
        GENERAL_PLACEHOLDERS = Collections.unmodifiableMap(tmp);
    }	
	
    // File Path Constants
    public static final String PATH_ROOT = System.getProperty("user.dir");
	public static final String CONFIG_FILE_PATH = "/src/test/resources/config.properties";		
	public static final String PATH_LOGGER = Paths.get(PATH_ROOT, "log4j.properties").toString();
	
	// API response Constants
	public static final String CONTENT_TYPE_APP_JSON = "application/json; charset=utf-8";
	public static final int STATUS_CODE_201 = 201;
	public static final String STATUS = "OK";
	public static final String STATUS_LINE = "HTTP/1.1 201 Created";
		
	
}