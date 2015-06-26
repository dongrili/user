package com.meitun.user.front.controller;

import com.meitun.user.common.BaseResult;
import com.meitun.user.common.model.User;
import com.meitun.user.front.ao.UserAO;
import org.apache.commons.lang.math.NumberUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ldrs on 2015/6/4.
 */
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserAO userAO;

    @ResponseBody
    @RequestMapping("/getUserById.json")
    public BaseResult<User> getUserById(HttpServletRequest request){

        BaseResult<User> result = new BaseResult<User>();
        String userId = request.getParameter("userId");
        if(logger!=null){
            logger.info("收到请求"+userId+this.getClass());
        }

        if(NumberUtils.isNumber(userId)){
            User user =  userAO.getUserById(Long.parseLong(userId));
            result.setData(user);
            result.setSuccess(true);
            return result;
        }
        result.setMessage("param is null");
        return  result;
    }
}
