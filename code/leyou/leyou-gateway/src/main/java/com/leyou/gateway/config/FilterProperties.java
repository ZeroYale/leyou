package com.leyou.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/31
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "leyou.filter")
public class FilterProperties {

    private List<String> allowPaths;

    public List<String> getAllowPaths() {
        return allowPaths;
    }

    public void setAllowPaths(List<String> allowPaths) {
        this.allowPaths = allowPaths;
    }
}
