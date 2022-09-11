package com.sryzzz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sryzzz.admin.pojo.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 权限相关 Mapper
 *
 * @author sryzzz
 * @create 2022/9/11 17:43
 * @description 权限相关 Mapper
 */
@Mapper
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    /**
     * 获取权限列表
     *
     * @return 权限列表
     */
    List<SysPermission> listPermRoles();
}
