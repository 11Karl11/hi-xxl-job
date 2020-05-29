package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/**
 * @author karl xie
 * Created on 2020-05-29 16:32
 */
@Slf4j
@Component
public class JobTest2 extends IJobHandler implements Serializable {


    /**
     * 1、简单任务示例（Bean模式）
     */
    @Override
    @XxlJob("test2")
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("XXL-JOB, Hello World.");
        for (int i = 0; i < 5; i++) {

            System.out.println("beat at:" + i);
            TimeUnit.SECONDS.sleep(2);
        }
        return ReturnT.SUCCESS;
    }
}