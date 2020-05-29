package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import groovy.util.logging.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author karl xie
 * Created on 2020-05-29 11:36
 */
@Slf4j
@Component
public class JobTest1 extends IJobHandler implements Serializable {


    @Override
    @XxlJob("test1")
    public ReturnT<String> execute(String s) throws Exception {
        try {
            System.out.println("测试~~~");
            /*测试数据*/
            return SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return FAIL;
        }
    }
}