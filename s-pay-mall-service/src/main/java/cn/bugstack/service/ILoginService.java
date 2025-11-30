package cn.bugstack.service;

import java.io.IOException;

/**
 * 微信服务
 * @author zjh
 * @since 2025/11/30 14:59
 */
public interface ILoginService {

    String createQrCodeTicket() throws Exception;

    String checkLogin(String ticket);

    void saveLoginState(String ticket, String openid) throws IOException;

}