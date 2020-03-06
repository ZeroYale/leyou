package com.leyou.item.api;


import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/13
 * @version: 1.0
 */

@RequestMapping("category")
public interface CategoryApi {

    @GetMapping
    public List<String> queryNamesByIds(@RequestParam("ids")List<Long> ids);

}
