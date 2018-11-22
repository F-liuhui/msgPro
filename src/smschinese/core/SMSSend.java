package smschinese.core;

import smschinese.client.HttpClientUtil;

public class SMSSend {
	private static HttpClientUtil client = HttpClientUtil.getInstance();
	public static int SendMessage(String Uid,String Key,String smsText,String smsMob) {
        if(Uid!=null && !Uid.equals("") && Key!=null && !Key.equals("")
           && smsMob!=null && !smsMob.equals("")) {
        	int result = client.sendMsgUtf8(Uid, Key, smsText, smsMob);
    		return result;
        }else {
        	return -100;
        }
		//UTF发送
		
	}
	public static String getErrorMsg(int errorCode) {
		return client.getErrorMsg(errorCode);
	}
}
