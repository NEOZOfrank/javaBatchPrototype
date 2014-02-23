package com.javabatch.prototype.life;

import com.javabatch.prototype.common.Mail;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.integration.Message;

/**
 * Author: Frank Hinkel
 */
public class LifeProcessor implements ItemProcessor<Mail, MailWorkflowResult>{

    @Autowired
    private MessageChannel workflowLifeChannelRequest;

    @Override
    public MailWorkflowResult process(Mail item) throws Exception {

        String mailAsString = item.toString();

        Message<String> message = MessageBuilder.withPayload(mailAsString).build();
        boolean result= workflowLifeChannelRequest.send(message);

        return new MailWorkflowResult(result, item);

    }
}
