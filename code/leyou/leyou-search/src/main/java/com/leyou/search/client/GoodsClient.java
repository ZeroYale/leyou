package com.leyou.search.client;

import com.leyou.item.api.GoodsApi;
import com.leyou.item.pojo.SpuDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/22
 * @version: 1.0
 */

@FeignClient("item-service")
public interface GoodsClient extends GoodsApi{

}
