package com.javabatch.prototype;

import org.springframework.batch.item.ItemProcessor;

/**
 * User: Frank Hinkel
 */
public class MailCollector implements ItemProcessor<String,String>{
    @Override
    public String process(String s) throws Exception {
        return null;
    }
}
