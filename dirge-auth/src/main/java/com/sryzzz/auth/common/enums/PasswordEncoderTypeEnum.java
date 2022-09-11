package com.sryzzz.auth.common.enums;

import lombok.Getter;

/**
 * 加密模式枚举类
 *
 * @author sryzzz
 * @create 2022/9/11 12:13
 * @description 加密模式枚举类
 */
public enum PasswordEncoderTypeEnum {

    /**
     * 加密枚举
     */
    BCRYPT("{bcrypt}", "BCRYPT加密"),
    NOOP("{noop}", "无加密明文")
    ;

    @Getter
    private final String prefix;

    @Getter
    private final String desc;

    PasswordEncoderTypeEnum(String prefix, String desc) {
        this.prefix = prefix;
        this.desc = desc;
    }
}
