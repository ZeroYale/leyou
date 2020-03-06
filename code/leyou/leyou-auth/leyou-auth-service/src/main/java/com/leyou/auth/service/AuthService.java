package com.leyou.auth.service;

import com.leyou.common.pojo.UserInfo;
import com.leyou.common.utils.JwtUtils;
import com.leyou.user.pojo.User;
import com.leyou.auth.client.UserClient;
import com.leyou.auth.config.JwtProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: 江毅东
 * @createDate: 2020/1/31
 * @version: 1.0
 */
@Service
public class AuthService {

    @Autowired
    private UserClient userClient;
    @Autowired
    private JwtProperties jwtProperties;

    public String accredit(String username, String password) {
        //1.根据用户名和密码去查询
        User user = this.userClient.queryUser(username, password);
        //2.判断user
        if (user == null){
            return null;
        }

        try {
            //3.jwtUtils生成jwt类型的token
            UserInfo userInfo = new UserInfo();
            userInfo.setId(user.getId());
            userInfo.setUsername(user.getUsername());
            return JwtUtils.generateToken(userInfo,this.jwtProperties.getPrivateKey(),this.jwtProperties.getExpire());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
