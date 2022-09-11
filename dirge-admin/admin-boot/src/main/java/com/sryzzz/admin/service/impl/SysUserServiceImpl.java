package com.sryzzz.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sryzzz.admin.dto.UserAuthDTO;
import com.sryzzz.admin.mapper.SysUserMapper;
import com.sryzzz.admin.pojo.entity.SysUser;
import com.sryzzz.admin.service.ISysUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现
 *
 * @author sryzzz
 * @create 2022/9/11 17:41
 * @description 用户服务实现
 */
@Service
@RequiredArgsConstructor
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Override
    public UserAuthDTO getByUsername(String username) {
        UserAuthDTO userAuthInfo = this.baseMapper.getByUsername(username);
        return userAuthInfo;
    }
}
