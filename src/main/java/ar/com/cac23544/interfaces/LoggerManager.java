package ar.com.cac23544.interfaces;

public class LoggerManager {

	public static ILogger getLogger(String target) {
		
		/*
		A > FSLogger
		B > EmailLogger
		C > SMSLogger
		*/
		//interface i = new ClaseQueImplementa();
		/*
		ILogger i = new SMSLogger();
		ILogger i2 = new FSLogger();
		ILogger i3 = new EmailLogger();
		*/
		
		ILogger logger;
			
		switch (target) {
		case "A":
			logger = new FSLogger();
			break;
		case "B":	
			logger = new EmailLogger();
			break;
		case "C":
			logger = new SMSLogger();
			break;
		default:
			logger = null;
		}
		return logger;
	}

}
