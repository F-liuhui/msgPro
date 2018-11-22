package smschinese.test;
import smschinese.core.SMSSend;

/**  
 * @Title: http://www.smschinese.cn/api.shtml
 * @date 2011-3-22
 * @version V1.2  
 */
public class test {
	
	//用户名
	private static String Uid = "graman";
	
	//接口安全秘钥
	private static String Key = "E10ADC3949BA59ABBE56E057F20F883E";
	
	//手机号码，多个号码如13800000000,13800000001,13800000002
	private static String smsMob = "15501031199";
	
	//短信内容
	private static String smsText = "验证码：9999";
	public static void main(String[] args) {
		//UTF发送
		int result = SMSSend.SendMessage(Uid, Key, smsText,smsMob);//client.sendMsgUtf8(Uid, Key, smsText, smsMob);
		if(result>0){
			System.out.println("UTF8成功发送条数=="+result);
		}else{
			System.out.println(SMSSend.getErrorMsg(result));
		}
	}
}
