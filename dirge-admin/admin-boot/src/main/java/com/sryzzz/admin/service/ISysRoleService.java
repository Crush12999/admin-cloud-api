package com.sryzzz.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sryzzz.admin.pojo.entity.SysRole;
import com.sryzzz.admin.pojo.vo.SysRoleVO;

import java.util.List;

/**
 * 角色服务
 *
 * @author sryzzz
 * @create 2022/9/21 22:36
 * @description 角色服务
 */
public interface ISysRoleService extends IService<SysRole> {

    /**
     * 获取角色列表
     *
     * @return 角色列表
     */
    List<SysRoleVO> listRole();
}
