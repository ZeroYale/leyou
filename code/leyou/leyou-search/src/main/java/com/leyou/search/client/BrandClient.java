package com.leyou.search.client;

import com.leyou.item.api.BrandApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/22
 * @version: 1.0
 */
@FeignClient("item-service")
public interface BrandClient extends BrandApi{
}