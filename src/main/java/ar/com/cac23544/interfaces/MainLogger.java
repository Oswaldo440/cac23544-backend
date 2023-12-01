package ar.com.cac23544.interfaces;

import java.util.Iterator;

public class MainLogger {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String target = getTargetFromDB();
		//A/B/C
		
		//ILogger logger = LoggerManager.getLogger(target);
		
		ILogger [] loggers = new ILogger[3];
		loggers[0] = LoggerManager.getLogger("A");
		loggers[1] = LoggerManager.getLogger("B");
		loggers[2] = LoggerManager.getLogger("C");
		
	//	logger.log();
	
		for (ILogger iLogger : loggers) {
			iLogger.log();
			
		}
	}			
		
	}

	
	//public static String getTargetFromDB() { 
	//	return "C";

