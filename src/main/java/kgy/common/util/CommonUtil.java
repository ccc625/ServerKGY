package kgy.common.util;

import java.util.UUID;

public class CommonUtil {
	
	public String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		
		return uuid;
	}

}
