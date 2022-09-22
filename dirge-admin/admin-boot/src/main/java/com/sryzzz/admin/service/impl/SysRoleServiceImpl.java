package com.sryzzz.admin.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sryzzz.admin.mapper.SysRoleMapper;
import com.sryzzz.admin.pojo.entity.SysRole;
import com.sryzzz.admin.pojo.vo.SysRoleVO;
import com.sryzzz.admin.service.ISysRoleService;
import com.sryzzz.common.base.constant.GlobalConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 角色服务实现类
 *
 * @author sryzzz
 * @create 2022/9/21 22:37
 * @description 角色服务实现类
 */
@Service
@RequiredArgsConstructor
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements ISysRoleService {

    @Override
    public List<SysRoleVO> listRole() {
        List<SysRole> sysRoles = lambdaQuery().eq(SysRole::getStatus, GlobalConstants.STATUS_ON)
                .select(SysRole::getId, SysRole::getName).list();
        if (CollectionUtil.isNotEmpty(sysRoles)) {
            return sysRoles.stream().map(sysRole -> {
                SysRoleVO sysRoleVO = new SysRoleVO();
                sysRoleVO.setId(sysRole.getId());
                sysRoleVO.setName(sysRole.getName());
                return sysRoleVO;
            }).collect(Collectors.toList());
        }
        return CollectionUtil.newArrayList();
    }
}
