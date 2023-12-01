package ar.com.cac23544.interfaces;

public class EmailLogger implements ILogger {


	@Override
	public void log() {
		System.out.println("Enviando mail a mail@mail.com");

	}

	
}
