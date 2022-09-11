package com.sryzzz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sryzzz.admin.dto.UserAuthDTO;
import com.sryzzz.admin.pojo.entity.SysUser;

/**
 * 用户服务
 *
 * @author sryzzz
 * @create 2022/9/11 17:39
 * @description 用户服务
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 根据用户名获取认证用户信息，携带角色和密码
     *
     * @param username 用户名
     * @return 用户信息 DTO
     */
    UserAuthDTO getByUsername(String username);
}
