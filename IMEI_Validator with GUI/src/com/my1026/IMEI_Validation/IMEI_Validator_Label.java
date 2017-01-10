package com.my1026.IMEI_Validation;

import javax.swing.JLabel;

public class IMEI_Validator_Label extends JLabel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String validString;
	private String invalidString;
		
	public IMEI_Validator_Label(String validString, String invalidString) {
		super();
		this.validString = validString;
		this.invalidString = invalidString;
	}


	public void validate(String imei){
		
		boolean isValid = IMEI_Validation.validateIMEI(imei);
		this.setText(isValid ? validString : invalidString);

	}

}
