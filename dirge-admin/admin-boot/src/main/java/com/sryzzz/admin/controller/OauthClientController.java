package com.sryzzz.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import com.sryzzz.admin.dto.OAuth2ClientDTO;
import com.sryzzz.admin.pojo.entity.SysOauthClient;
import com.sryzzz.admin.service.ISysOauthClientService;
import com.sryzzz.common.base.result.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * OAuth 客户端接口
 *
 * @author sryzzz
 * @create 2022/9/11 17:48
 * @description OAuth 客户端接口
 */
@RequestMapping("/api/oauth-clients")
@Slf4j
@RestController
@RequiredArgsConstructor
public class OauthClientController {

    private final ISysOauthClientService iSysOauthClientService;

    @GetMapping("/getOAuth2ClientById")
    public R<OAuth2ClientDTO> getOauth2ClientById(@RequestParam String clientId) {
        SysOauthClient client = iSysOauthClientService.getById(clientId);
        Assert.notNull(client, "OAuth2 客户端不存在");
        OAuth2ClientDTO oAuth2ClientDTO = new OAuth2ClientDTO();
        BeanUtil.copyProperties(client, oAuth2ClientDTO);
        return R.ok(oAuth2ClientDTO);
    }
}
