package com.sryzzz.admin.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 权限实体类
 *
 * @author sryzzz
 * @create 2022/9/11 17:34
 * @description 权限实体类
 */
@Data
@ToString
@Accessors(chain = true)
public class SysPermission {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Long menuId;

    private String urlPerm;

    /**
     * 有权限的角色编号集合
     */
    @TableField(exist = false)
    private List<String> roles;
}
