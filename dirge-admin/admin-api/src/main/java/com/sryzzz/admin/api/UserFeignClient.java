package com.sryzzz.admin.api;

import com.sryzzz.admin.dto.UserAuthDTO;
import com.sryzzz.common.base.result.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 根据用户名获取用户信息的feign
 *
 * @author sryzzz
 * @create 2022/9/11 16:37
 * @description 根据用户名获取用户信息的feign
 */
@FeignClient(value = "dirge-admin")
public interface UserFeignClient {

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     */
    @GetMapping("/api/v1/users/username/{username}")
    R<UserAuthDTO> getUserByUsername(@PathVariable String username);

}
