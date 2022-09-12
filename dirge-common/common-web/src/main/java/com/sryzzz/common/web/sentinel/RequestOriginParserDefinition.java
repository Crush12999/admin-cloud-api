package com.sryzzz.common.web.sentinel;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.RequestOriginParser;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Sentinel 请求来源解析
 *
 * @author sryzzz
 * @create 2022/9/12 17:52
 * @description Sentinel 来源解析，这个主要是辅助sentinel 收取功能，
 * 如果配置了服务授权的话，则会回调这个配置，获取调用方来源。这里的处理逻辑是从请求头获取调用方名称
 */
@Component
public class RequestOriginParserDefinition  implements RequestOriginParser {

    /**
     * 获取调用方标识信息并返回
     */
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String serviceName = request.getHeader("serviceName");
        StringBuffer url = request.getRequestURL();
        String faviconIcon = "favicon.ico";
        if (url.toString().endsWith(faviconIcon)) {
            // 浏览器会向后台请求favicon.ico 图标
            return serviceName;
        }

        if (StringUtils.isEmpty(serviceName)) {
            throw new IllegalArgumentException("serviceName must not be null");
        }

        return serviceName;
    }
}
