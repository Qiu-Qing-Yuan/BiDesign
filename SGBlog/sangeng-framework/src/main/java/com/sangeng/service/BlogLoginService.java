package com.sangeng.service;

import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.User;

/**
 * @author QiuQingyuan
 * @version 1.0
 * @Description: TODO
 * @date 2024-01-19  8:54
 */
public interface BlogLoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
