package com.sryzzz.admin.controller;

import com.sryzzz.common.base.result.R;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author sryzzz
 * @create 2022/9/12 12:08
 * @description
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping
    public R<String> test() {
        return R.ok("ok");
    }
}
