package com.javabatch.prototype.life;

import com.javabatch.prototype.common.Mail;

/**
 * Author: Frank Hinkel
 */
public class MailWorkflowResult {

    private boolean result;

    private Mail mail;

    public MailWorkflowResult(boolean result, Mail mail) {
        this.result = result;
        this.mail = mail;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "MailWorkflowResult{" +
                "result=" + result +
                ", mail=" + mail +
                '}';
    }
}
