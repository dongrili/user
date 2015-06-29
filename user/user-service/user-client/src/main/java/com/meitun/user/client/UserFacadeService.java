package com.meitun.user.client;

import com.meitun.user.common.model.User;
import com.meitun.user.common.result.BaseResult;

/**
 * user facade service
 * Created by ldrs on 2015/6/4.
 */
public interface UserFacadeService {

    /**
     * get user by userId
     * @param userId
     * @return
     */
    public User getUserById(Long userId);


    /**
     * get with callback
     * @param userId
     * @return
     */
    public BaseResult<User> get(Long userId);
}
