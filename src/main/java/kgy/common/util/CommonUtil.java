package kgy.common.util;

import java.util.UUID;

public class CommonUtil {
	
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		
		return uuid;
	}

}