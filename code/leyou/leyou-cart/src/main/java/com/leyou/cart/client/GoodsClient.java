package com.leyou.cart.client;

import com.leyou.item.api.GoodsApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/2/1
 * @version: 1.0
 */
@FeignClient("item-service")
public interface GoodsClient extends GoodsApi {
}
