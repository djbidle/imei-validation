package com.my1026.IMEI_Validation;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IMEI_ValidatorAction extends AbstractAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField imei;
	private IMEI_Validator_Label result;
	
	public IMEI_ValidatorAction(JTextField imei, IMEI_Validator_Label result){
		super("Submit");
		this.imei = imei;
		this.result = result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		result.validate(this.imei.getText());
	}
}
