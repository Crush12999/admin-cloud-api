package com.sryzzz.admin.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * 角色权限 DTO
 *
 * @author sryzzz
 * @create 2022/9/11 16:34
 * @description 角色权限 DTO
 */
@Data
@ToString
@Accessors(chain = true)
public class RolePermissionDTO {

    private Long roleId;

    private List<Long> permissionIds;

    private Long menuId;

}
