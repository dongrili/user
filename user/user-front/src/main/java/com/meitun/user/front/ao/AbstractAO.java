package com.meitun.user.front.ao;

import com.meitun.user.common.callback.CallBack;
import com.meitun.user.common.exception.CommonException;
import com.meitun.user.common.result.BaseResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * abstract ao
 * Created by ldr on 2015/6/29.
 */
public class AbstractAO {


    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * exec callback
     * @param result
     * @param callBack
     */
    public void execute(BaseResult result ,CallBack callBack){

        try {
            logger.info("processing request........");

            callBack.doProcess();

            logger.info("finished request........");
        }catch (CommonException ce){
            logger.error("请求错误 message:"+ce.getMessage()+" errorCode:"+ce.getErrorCode());
            result.setSuccess(false);
            result.setMessage(ce.getMessage());
            result.setCode(ce.getErrorCode());
        }catch (Exception e){
            logger.error("系统异常",e);
            result.setSuccess(false);
            result.setMessage(e.getMessage());
            result.setCode("SYSTEM-ERROR");
        }
    }
}
