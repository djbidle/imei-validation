package com.my1026.IMEI_Validator;

import java.awt.Component;

import javax.swing.JFrame;

import com.my1026.IMEI_Validation.IMEI_Validator;

public class MainWindow extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainWindow(Component content){
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("IMEI Validator");
		
		this.add(content);
		
		this.setLocationRelativeTo(null);
		
		//this.pack();
		this.setSize(300, 175);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String validString ="Test";
		String invalidString = "Test2";
		new MainWindow(new IMEI_Validator(validString, invalidString));
		
		//used to test code
		//String imei = "353411066747546";
		//IMEI_Validator.validate(imei);
	}

}
