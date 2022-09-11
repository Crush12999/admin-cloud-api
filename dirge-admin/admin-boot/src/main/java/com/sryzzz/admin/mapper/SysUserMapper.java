package com.sryzzz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sryzzz.admin.dto.UserAuthDTO;
import com.sryzzz.admin.pojo.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 用户 Mapper
 *
 * @author sryzzz
 * @create 2022/9/11 17:44
 * @description 用户 Mapper
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 获取用户信息
     *
     * @param userName 用户名
     * @return 用户信息
     */
    UserAuthDTO getByUsername(@Param("userName") String userName);
}