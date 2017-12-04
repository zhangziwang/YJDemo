package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016082700317472";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDMjakZJtxUbRQVIzwr5l5GP3XX8NXR2sFW5jS7GzJjCRN5KNfOEJFWRK5mShaGwvoKermPC94A1KsR9+YDc14DKETIAMiYkaPGeEOca7BsJ9prOMt7crXaO4TW+fhpAdtMVZSxxLj6wson7V4E/KpguPQgE69YjRM8XVtfmbdGgCoVdsFkiDY/LYU0xfwzIaOzDlODBoIHXVL6ZoTBcI9xAPr6d20XcvXZINfNcaCtlze4OK04fxrz85zS5SytBaDxhJfdP9Gj0/Np+RaW40mvjQiEbfatG2BYRm4Km+yB7sQPxDKZsOswMjsrdsjdsYWlYslyI4VabL1vQAeG9YZVAgMBAAECggEADZ4kssr2ghxc6OdWmymT/yM8airbYUQp+OoMeqRd31/8TuWcMFjEBDVAUwj9pO0YDliLP+2vUujVlrWlN3eXu6gTpCkBMb8IYy8geSpmLV0d2mOGkGpblvK9bj5n/j2kZtmPs6IAGpmbMbtIthZIFXZaskP9OWzy6eLhMWUfYW8KQqlrQlnpRq2prgsjWxtPvHz45z0fi3/X6Lx8Y370G7kijik16ilBsqTH+GvkIZ4EGDjkjvqFWE+V+pHoJnsUquBYfXHG7Ip3A/lApuRVz+YzdqObW+YglUyZuuW3EX9wjHoeLDIBpU18ZpPRxeB1gO6Bck4xsP/hzWQK6l23RQKBgQD7uJnUe+KKqBA/BkTaLZH8zx0nZWlM1C9rlMra79SLz5uH/5EhBRusUou2Q5/LNg0MpuVDL5Ic5m0LLedxE5o/GXwD6XKhF1f+KESqcMXFVmt2bLpwYlveGJYAFW/EKUDmCMzB8ofr5aOvuCzJenNjmKontlFZIJ9zSnOgupltUwKBgQDQB81/nD30UB70Z9c+pA/73SchbKXniTurKYBfPl+LEmP3RnytZFvfRU6+ToHTvExmbtrZd3cYSmA8rHMZg/1MfRYNPxDwGs63VBzx63/fwBr6TyUtuK1Kin1DVI1ibCEpT/pk9U4W3ExgYQc0Y6PLexa5ghsMLYFRHC6qIiogtwKBgQCdgvD3TiH+45Vu6oxQ/ez5BdzXVxTiF3Ao4G1jPGmCpwFKw3fb8qdTWD/GaGBoN0VJInIZbX3/iYy4Txwg3MRLMbYxeHXbKZFNH4OAJ5sJlb8e1oB/bHzR6A6MtN1AIRRUHTOLNSkqSoL3pMaZuH7V1qS6vtH+dHRyHydlbv4sswKBgQDJ1Mgr5wq03ocp2RWcUNCxK/+rDh5oZVze04UY4wsPgug6IMkV8Sixliyvtrt/ElGNkEAEfUOu7XoxY57IQqaebz3V3Doyuc+VTqZGkJWgIGIMOH15vpNinrqpeH8z3nTOACqPiPAafeIcIAc9bO6dnO6PTQuw5PVyHEWqCzuUQQKBgD8ALNNMEC7iSn/b8fPSc8823x10uC2WQPp8NsroGL5h4ky1A7/iWoVPhT8kWtNwsGY2sw87aTQq0/LU10EIwKa2UUaic575hzYs2q0tQgj/CnahknKNXKPyNPwMkGwvoY1MkznkLvpJMKOuI+nsLNjASon8XoVYXDijbSvPDvPf";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA9N2L1yqVmt8MTTbpas6XmrgPme0KrdqEacFgxthx1MbGc4kgd1RzoIFLsKB0d8EsmeUr9CuitbbZAHOyLVARE6sg7FHLHglHwXz9vNnJENQGpyMtYdn2Jk+eXpKa/cWUmZiJEMSppAdgRDaMaT7TKaPVbLT0ZmteMMFCVzoAdo0NHFtGCxtJq68efeyZ7GPGXLwqufUtdX/9hphujl0MQPpAaIYQgLOY3bXIzU4zqzuKWZJk8EudbdtelofD5vAR8i2scea9thR8gmn5Vn5LrS/rswjWY4f3IEZLftK4yQWfc4KaqHSr9XanupBj7V3wBtj7A7nNr+gsUNZ1jjUTiwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://7c5b0168.ngrok.io/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://7c5b0168.ngrok.io/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

