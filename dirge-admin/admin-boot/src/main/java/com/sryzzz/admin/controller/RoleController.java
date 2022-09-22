package com.sryzzz.admin.controller;

import com.sryzzz.admin.pojo.vo.SysRoleVO;
import com.sryzzz.admin.service.ISysRoleService;
import com.sryzzz.common.base.result.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 角色相关接口
 *
 * @author sryzzz
 * @create 2022/9/21 22:42
 * @description 角色相关接口
 */
@RequestMapping("/role")
@Slf4j
@RestController
@RequiredArgsConstructor
public class RoleController {

    private final ISysRoleService roleService;

    @GetMapping("/listRole")
    public R<List<SysRoleVO>> listRole() {
        List<SysRoleVO> roleVOList = roleService.listRole();
        return R.ok(roleVOList);
    }
}
