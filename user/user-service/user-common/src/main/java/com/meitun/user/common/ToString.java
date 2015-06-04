package com.meitun.user.common;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * Created by ldrs on 2015/6/4.
 */
public class ToString implements Serializable {

    private static final long serialVersionUID = -7073084674186151235L;

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
