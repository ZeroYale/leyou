package com.leyou.item.api;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/16
 * @version: 1.0
 */

@RequestMapping("spec")
public interface SpecificationApi {


    /**
     * 根据gid查询规格参数
     * @param gid
     * @return
     */
    @GetMapping("params")
    public List<SpecParam> queryParams(
            @RequestParam(value= "gid",required = false)Long gid,
            @RequestParam(value = "cid",required = false)Long cid,
            @RequestParam(value = "generic",required = false)Boolean generic,
            @RequestParam(value = "searching",required = false)Boolean searching

            );

    @GetMapping("group/param/{cid}")
    public List<SpecGroup> queryGroupsWithParam(@PathVariable("cid")Long cid);
}
