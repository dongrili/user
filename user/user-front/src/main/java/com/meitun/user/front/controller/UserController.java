package com.meitun.user.front.controller;

import com.meitun.user.common.model.User;
import com.meitun.user.front.ao.UserAO;
import org.apache.commons.lang.math.NumberUtils;
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

    @Autowired
    private UserAO userAO;

    @ResponseBody
    @RequestMapping("/getUserById.json")
    public User getUserById(HttpServletRequest request){
        String userId = request.getParameter("userId");
        if(NumberUtils.isNumber(userId)){
            return  userAO.getUserById(Long.parseLong(userId));
        }
        return null;
    }
}
