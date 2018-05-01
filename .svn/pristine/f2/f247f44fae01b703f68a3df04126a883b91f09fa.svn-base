package cn.opt.utils;

public class IndustrySMS
{
	private static String operation = "/industrySMS/sendSMS";
	private static String accountSid = Config.ACCOUNT_SID;
	private static String smsContent = "【点通网】尊敬的用户，您的验证码为";

	/**
	 * 验证码通知短信
	 */
	
	public static void execute(String to,String code)
	{
		String url = Config.BASE_URL + operation;
		String body = "accountSid=" + accountSid + "&to=" + to + "&smsContent=" + smsContent+code
				+ HttpUtil.createCommonParam();
		// 提交请求
		String result = HttpUtil.post(url, body);
		System.out.println("result:" + System.lineSeparator() + result);
	}

}