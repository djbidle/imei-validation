package com.my1026.IMEI_Validation;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JTextField;

public class ClearAction extends AbstractAction{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField imei;
	private IMEI_Validator_Label result;
	
	public ClearAction(JTextField imei, IMEI_Validator_Label result){
		super("Clear");
		this.imei = imei;
		this.result = result;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		imei.setText("");
		result.setText("");
	}
		
}
