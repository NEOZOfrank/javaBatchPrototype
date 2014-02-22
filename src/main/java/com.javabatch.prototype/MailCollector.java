package com.javabatch.prototype;

import org.springframework.batch.item.ItemProcessor;

/**
 * User: Frank Hinkel
 */
public class MailCollector implements ItemProcessor<Mail,Mail>{

    private int i=0;

    @Override
    public Mail process(Mail mail) throws Exception {
        //TODO: should check duplicates
        System.out.println(""+ ++i + " " + mail);
        return mail;
    }
}
