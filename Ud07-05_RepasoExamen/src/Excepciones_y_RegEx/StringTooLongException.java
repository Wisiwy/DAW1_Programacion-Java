package Excepciones_y_RegEx;

public class StringTooLongException extends Exception {
	
	private String str;
	
	public StringTooLongException(String str, String sms){
		super("La cadena " + str + "falla por" + sms );
	}//MENSAJE PERSONALIZADO
	
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	

}
