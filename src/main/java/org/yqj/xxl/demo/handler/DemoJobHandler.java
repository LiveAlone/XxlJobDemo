package org.yqj.xxl.demo.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.JobHandler;
import com.xxl.job.core.log.XxlJobLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * @author yaoqijun
 * @date 2019/11/19
 * Email: yaoqijunmail@foxmail.com
 */
@JobHandler(value="demoJobHandler")
@Component
@Slf4j
public class DemoJobHandler extends IJobHandler {
    @Override
    public ReturnT<String> execute(String s) throws Exception {
        log.info("XXL-JOB, Hello World. Self logging");
        for (int i = 0; i < 10; i++) {
            log.info("beat at : " + i);
            TimeUnit.SECONDS.sleep(2);
        }
        return SUCCESS;
    }
}
