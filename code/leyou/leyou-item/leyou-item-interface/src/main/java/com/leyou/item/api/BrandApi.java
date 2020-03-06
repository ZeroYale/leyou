package com.leyou.item.api;


import com.leyou.item.pojo.Brand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/13
 * @version: 1.0
 */

@RequestMapping("brand")
public interface BrandApi {


    @GetMapping("{id}")
    public Brand queryBrandById(@PathVariable("id")Long id);


}
