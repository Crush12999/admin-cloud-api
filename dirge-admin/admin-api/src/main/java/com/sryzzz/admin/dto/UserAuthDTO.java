package com.sryzzz.admin.dto;

import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * 用户信息 DTO
 *
 * @author sryzzz
 * @create 2022/9/11 16:34
 * @description 用户信息 DTO
 */
@Data
@ToString
public class UserAuthDTO {

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户状态：1-有效；0-禁用
     */
    private Integer status;

    /**
     * 用户角色编码集合 ["ROOT","ADMIN"]
     */
    private List<String> roles;

}
