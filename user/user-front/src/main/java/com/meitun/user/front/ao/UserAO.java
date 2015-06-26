package com.meitun.user.front.ao;

import com.meitun.user.client.UserFacadeService;
import com.meitun.user.common.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ldrs on 2015/6/4.
 */
@Service
public class UserAO {

   private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserFacadeService userFacadeService;

    public User getUserById(Long userId){
        logger.info("userId:"+userId);
        if(userId == null){
            return null;
        }
        return userFacadeService.getUserById(userId);
    }


}
