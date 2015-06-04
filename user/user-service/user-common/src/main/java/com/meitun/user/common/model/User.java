package com.meitun.user.common.model;

import com.meitun.user.common.ToString;

/**
 * Created by ldrs on 2015/6/4.
 */
public class User extends ToString {

    private Long userId;

    private String userName;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
