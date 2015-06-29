package com.meitun.user.front.controller;

import com.meitun.user.common.result.BaseResult;
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
 * user controller
 * Created by ldrs on 2015/6/4.
 */
@Controller
public class UserController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserAO userAO;

    /**
     * get by id
     * @param request
     * @return
     */
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

    /**
     * get with callback
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/get.json")
    public BaseResult<User> get(HttpServletRequest request){
        String userId = request.getParameter("userId");
        Long id = null;
        if(NumberUtils.isNumber(userId)){
            id = NumberUtils.toLong(userId);
        }
        return userAO.get(id);
    }
}
