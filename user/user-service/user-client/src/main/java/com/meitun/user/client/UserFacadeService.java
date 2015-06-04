package com.meitun.user.client;

import com.meitun.user.common.model.User;

/**
 * user facade service
 * Created by ldrs on 2015/6/4.
 */
public interface UserFacadeService {

    /**
     * get user by userID
     * @param userId
     * @return
     */
    public User getUserById(Long userId);
}
