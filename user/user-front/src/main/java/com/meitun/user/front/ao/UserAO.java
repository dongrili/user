package com.meitun.user.front.ao;

import com.meitun.user.client.UserFacadeService;
import com.meitun.user.common.callback.CallBack;
import com.meitun.user.common.model.User;
import com.meitun.user.common.result.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * user ao
 * Created by ldrs on 2015/6/4.
 */
@Service
public class UserAO extends AbstractAO{

   private Logger logger = LoggerFactory.getLogger(this.getClass());
    /**user facade service*/
    @Autowired
    private UserFacadeService userFacadeService;

    /**
     * get by id
     * @param userId
     * @return
     */
    public User getUserById(Long userId){
        logger.info("userId:"+userId);
        if(userId == null){
            return null;
        }
        return userFacadeService.getUserById(userId);
    }

    /**
     * get with callback
     * @param userId
     * @return
     */
    public BaseResult<User> get(final Long userId){
        final BaseResult<User> result = new BaseResult<User>();
        this.execute(result, new CallBack() {
            public void doProcess() {
               BaseResult<User> userResult = userFacadeService.get(userId);
                result.setSuccess(userResult.isSuccess());
                result.setData(userResult.getData());
                result.setMessage(userResult.getMessage());
                result.setCode(userResult.getCode());
                result.setThrowable(userResult.getThrowable());
            }
        });
        return result;

    }


}
