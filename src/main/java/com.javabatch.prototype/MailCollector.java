package com.javabatch.prototype;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * User: Frank Hinkel
 */
public class MailCollector implements ItemProcessor<Mail,Mail>{

    private int i=0;

    private Set<String> mailHashCodes = new HashSet<String>();

    private MessageDigest hashGenerator;

    private Log LOGGER = LogFactory.getLog(MailCollector.class);

    public MailCollector() {

        try {
            hashGenerator = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error(e);
        }

    }

    @Override
    public Mail process(Mail mail) throws Exception {

        byte[] bytesOfMail = mail.toString().getBytes("UTF-8");
        String digest = Arrays.toString(hashGenerator.digest(bytesOfMail));

        System.out.println(mail.toString());

        if(mailHashCodes.add(digest)){
            return mail;
        }

        throw new DuplicateMailException();
    }
}
