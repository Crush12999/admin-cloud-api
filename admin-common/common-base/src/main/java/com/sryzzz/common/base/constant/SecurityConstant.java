package com.sryzzz.common.base.constant;

/**
 * 安全相关常量定义
 *
 * @author sryzzz
 * @create 2022/9/10 01:20
 * @description Security 相关常量
 */
public interface SecurityConstant {

    /**
     * 认证请求头 key
     */
    String AUTHORIZATION_KEY = "Authorization";

    /**
     * JWT 令牌前缀
     */
    String JWT_PREFIX = "Bearer ";

    /**
     * Basic 认证前缀
     */
    String BASIC_PREFIX = "Basic ";

    /**
     * JWT 载体 key
     */
    String JWT_PAYLOAD_KEY = "payload";

    /**
     * JWT ID 唯一标识
     */
    String JWT_JTI = "jti";

    /**
     * JWT ID 唯一标识
     */
    String JWT_EXP = "exp";

    /**
     * JWT 存储权限前缀
     */
    String AUTHORITY_PREFIX = "ROLE_";

    String APP_API_PATTERN = "/*/app-api/**";

    /**
     * 黑名单 token 前缀
     */
    String TOKEN_BLACKLIST_PREFIX = "auth:token:blacklist:";
}
