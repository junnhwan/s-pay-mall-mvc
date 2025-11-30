package cn.bugstack.domain.res;

import lombok.Data;

/**
 * 获取 Access token DTO 对象
 * @author zjh
 * @since 2025/11/30 14:54
 */
@Data
public class WeixinTokenRes {

    private String access_token;
    private int expires_in;
    private String errcode;
    private String errmsg;

}