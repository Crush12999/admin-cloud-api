package com.sryzzz.admin.pojo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 角色 VO 对象
 *
 * @author sryzzz
 * @create 2022/9/21 22:32
 * @description 角色 VO 对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SysRoleVO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Long id;

    /**
     * 角色名称
     */
    private String name;

}