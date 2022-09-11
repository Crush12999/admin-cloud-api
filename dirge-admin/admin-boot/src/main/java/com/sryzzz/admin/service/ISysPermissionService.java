package com.sryzzz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sryzzz.admin.pojo.entity.SysPermission;

import java.util.List;

/**
 * 系统权限服务
 *
 * @author sryzzz
 * @create 2022/9/11 17:37
 * @description 系统权限服务
 */
public interface ISysPermissionService extends IService<SysPermission> {

    /**
     * 刷新Redis缓存中角色菜单的权限规则，角色和菜单信息变更调用
     *
     * @return 刷新状态
     */
    boolean refreshPermRolesRules();

    /**
     * 获取权限列表
     *
     * @return 权限列表
     */
    List<SysPermission> listPermRoles();
}
