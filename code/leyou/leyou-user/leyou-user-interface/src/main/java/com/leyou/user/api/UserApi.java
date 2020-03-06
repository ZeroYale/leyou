package com.leyou.user.api;

import com.leyou.user.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/31
 * @version: 1.0
 */
public interface UserApi {

    @GetMapping("query")
    public User queryUser(@RequestParam("username")String username, @RequestParam("password")String password);
}
