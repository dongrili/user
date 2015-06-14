package com.meitun.user.core.impl;

import com.meitun.user.client.UserFacadeService;
import com.meitun.user.common.model.User;
import com.meitun.user.dal.domain.UserDO;
import com.meitun.user.dal.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ldrs on 2015/6/4.
 */
@Service("userFacadeService")
public class UserFacadeServiceImpl implements UserFacadeService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(Long userId) {
       if(userId==null){
           return null;
       }
       UserDO userDO = userMapper.getUserById(userId);

        User user = new User();
        if(userDO!=null){
            user.setUserName(userDO.getName());
            user.setUserId(userDO.getId());
        }else {
            user.setUserId(-999L);
            user.setUserName("007:code" + "empty");
        }
        return user;
    }
}
