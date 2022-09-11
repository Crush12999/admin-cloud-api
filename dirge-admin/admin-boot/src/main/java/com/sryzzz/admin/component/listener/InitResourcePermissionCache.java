package com.sryzzz.admin.component.listener;

import com.sryzzz.admin.service.ISysPermissionService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 启动监听器，初始化角色权限
 *
 * @author sryzzz
 * @create 2022/9/11 16:44
 * @description 启动监听器，初始化角色权限
 */
@Component
@AllArgsConstructor
public class InitResourcePermissionCache implements CommandLineRunner {

    private final ISysPermissionService iSysPermissionService;

    @Override
    public void run(String... args) throws Exception {
        iSysPermissionService.refreshPermRolesRules();
    }
}
