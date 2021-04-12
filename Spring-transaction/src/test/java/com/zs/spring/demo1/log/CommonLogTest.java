package com.zs.spring.demo1.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class CommonLogTest {

    @Test
    public void getLog(){
        Log log = LogFactory.getLog(CommonLogTest.class);
        log.info("start...");
        if(log.isDebugEnabled()) {
            log.debug("debug...");
        }
        log.warn("warn.");
        log.error("error");
    }
}
