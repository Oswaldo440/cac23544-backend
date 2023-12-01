package ar.com.cac23544.interfaces;

public class SMSLogger implements ILogger {
	//atributo
	private String number = "+541122...";
	
	/*
	public SMSLogger(String number) {
		// TODO Auto-generated constructor stub
		this.number = number;
		}
	*/
	@Override
	public void log() {
		// TODO Auto-generated method stub
		System.out.println("Enviando sms al:"+ " "+ getNumber());

	}
	public void setNumber(String number) {
		this.number = number;
	}

		public String getNumber() {
			return this.number;
	}
	
	
}
