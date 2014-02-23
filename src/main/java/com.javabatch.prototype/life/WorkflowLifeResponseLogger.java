package com.javabatch.prototype.life;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.ResponseEntity;

/**
 * Author: Frank Hinkel
 */
public class WorkflowLifeResponseLogger {

    Log LOGGER = LogFactory.getLog(WorkflowLifeResponseLogger.class);

    public void log(ResponseEntity input){
        LOGGER.info(input);
    }
}
