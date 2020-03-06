package com.leyou.goods.controller;

import com.leyou.goods.service.GoodsHtmlService;
import com.leyou.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Map;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/27
 * @version: 1.0
 */
@Controller
public class GoodsController {

    @Autowired
    private GoodsService goodsServicel;
    @Autowired
    private GoodsHtmlService goodsHtmlService;

    @GetMapping("item/{id}.html")
    public String toItemPage(@PathVariable("id")Long id, Model model){

        Map<String, Object> map = this.goodsServicel.loadData(id);
        model.addAllAttributes(map);

        this.goodsHtmlService.createHtml(id);

        return "item";
    }
}
