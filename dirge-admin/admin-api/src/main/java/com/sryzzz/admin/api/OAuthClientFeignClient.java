package com.sryzzz.admin.api;

import com.sryzzz.admin.dto.OAuth2ClientDTO;
import com.sryzzz.common.base.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 获取客户端信息的 feign
 *
 * @author sryzzz
 * @create 2022/9/11 16:35
 * @description 获取客户端信息的 feign
 */
@SuppressWarnings("all")
@FeignClient(value = "dirge-admin", contextId = "oauth-client")
public interface OAuthClientFeignClient {

    /**
     * 根据客户端 ID 获取客户端信息
     *
     * @param clientId 客户端ID
     * @return 客户端信息
     */
    @GetMapping("/api/oauth-clients/getOAuth2ClientById")
    R<OAuth2ClientDTO> getOAuth2ClientById(@RequestParam String clientId);
}
