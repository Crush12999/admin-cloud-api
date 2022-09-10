package com.sryzzz.common.base.result;

/**
 * 返回结果状态接口
 *
 * @author sryzzz
 * @create 2022/9/11 00:11
 * @description 返回结果状态接口
 */
public interface IResultCode {

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    String getCode();

    /**
     * 获取状态码对应信息
     *
     * @return 对应信息
     */
    String getMsg();
}
