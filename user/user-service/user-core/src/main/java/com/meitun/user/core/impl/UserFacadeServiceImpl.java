package com.meitun.user.core.impl;

import com.meitun.user.client.UserFacadeService;
import com.meitun.user.common.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by ldrs on 2015/6/4.
 */
@Service("userFacadeService")
public class UserFacadeServiceImpl implements UserFacadeService {

    public User getUserById(Long userId) {
       if(userId==null){
           return null;
       }
        User user = new User();
        user.setUserId(userId);
        user.setUserName("007:code"+userId);
        return user;
    }
}
