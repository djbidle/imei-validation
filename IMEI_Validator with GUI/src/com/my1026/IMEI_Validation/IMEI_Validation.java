package com.my1026.IMEI_Validation;

public class IMEI_Validation {
	
	public static int luhnTest(String imei){
		int sum = 0;
		boolean isEven = false;
		
		for(int i = imei.length(); i > 0; i--){
			int k = Integer.parseInt(imei.substring(i-1,i));
			if(isEven){
				k = k * 2;
				if(k/10 != 0)
					k = k/10 + k%10;
			}
			
			isEven = !isEven;
			sum += k;
		}
		return sum;
	}
	
	public static boolean validateIMEI(String imei){
		//return true if valid imei
		if(luhnTest(imei)%10 == 0)
			return true;
		return false;
		
	}
	
}
