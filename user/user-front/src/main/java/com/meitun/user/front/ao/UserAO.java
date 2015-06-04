package com.meitun.user.front.ao;

import com.meitun.user.client.UserFacadeService;
import com.meitun.user.common.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ldrs on 2015/6/4.
 */
@Service
public class UserAO {

    @Autowired
    private UserFacadeService userFacadeService;

    public User getUserById(Long userId){
        if(userId == null){
            return null;
        }
        return userFacadeService.getUserById(userId);
    }


}
