package com.my1026.IMEI_Validation;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IMEI_Validator extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//set private variables
	private JLabel imeiLabel;
	private JTextField imei;
	private IMEI_Validator_Label result;
	private JButton submitButton;
	private JButton clearButton;
	
	public IMEI_Validator(String validString, String invalidString){
		//initialize private fields
		this.imeiLabel = new JLabel("Please enter a 15 digit number:"); 
		this.imei = new JTextField();
		this.result = new IMEI_Validator_Label(validString, invalidString);
		this.submitButton = new JButton(new IMEI_ValidatorAction(imei, result));
		this.clearButton = new JButton(new ClearAction(imei, result));
		
		//initialize layout
		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		//this.setLayout(new GroupLayout(this));
		
		//specify automatic gap insertion
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		//sets groups
		layout.setHorizontalGroup(layout
			    .createParallelGroup(GroupLayout.Alignment.LEADING)
			    	.addComponent(imeiLabel)
			    	.addComponent(imei)
			    .addGroup(layout.createSequentialGroup()
			        .addComponent(submitButton)
			        .addComponent(clearButton)
			        )
			    .addComponent(result)
			);

		layout.setVerticalGroup(layout.createSequentialGroup()
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		    	.addComponent(imeiLabel)
		        )
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
		    	.addComponent(imei)	
		    	)
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)    
		    	.addComponent(submitButton)
		    	.addComponent(clearButton)
		    	)
		    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
			   	)
			.addComponent(result)	
		    );
		
	}

}
