package com.leyou.auth.client;

import com.leyou.user.api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/31
 * @version: 1.0
 */
@FeignClient("user-service")
public interface UserClient extends UserApi {
}
