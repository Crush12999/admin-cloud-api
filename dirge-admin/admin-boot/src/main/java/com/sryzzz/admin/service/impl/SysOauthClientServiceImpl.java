package com.sryzzz.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sryzzz.admin.mapper.SysOauthClientMapper;
import com.sryzzz.admin.pojo.entity.SysOauthClient;
import com.sryzzz.admin.service.ISysOauthClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * OAuth 客户端服务实现
 *
 * @author sryzzz
 * @create 2022/9/11 17:40
 * @description OAuth 客户端服务实现
 */
@Service
@RequiredArgsConstructor
public class SysOauthClientServiceImpl extends ServiceImpl<SysOauthClientMapper, SysOauthClient> implements ISysOauthClientService {
}
