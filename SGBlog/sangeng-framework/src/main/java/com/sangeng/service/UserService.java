package com.sangeng.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.sangeng.domain.ResponseResult;
import com.sangeng.domain.entity.User;

/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2024-01-26 10:26:30
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();
}
