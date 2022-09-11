package com.sryzzz.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sryzzz.admin.pojo.entity.SysOauthClient;
import org.apache.ibatis.annotations.Mapper;

/**
 * OAuth客户端 Mapper
 *
 * @author sryzzz
 * @create 2022/9/11 17:42
 * @description OAuth客户端 Mapper
 */
@Mapper
public interface SysOauthClientMapper extends BaseMapper<SysOauthClient> {
}
