package com.javabatch.prototype;

/**
 * User: Frank Hinkel
 */
public class Mail {

    private String senderName;
    private String senderMail;
    private String recipientMail;
    private String subject;
    private String bod;

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderMail() {
        return senderMail;
    }

    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    public String getRecipientMail() {
        return recipientMail;
    }

    public void setRecipientMail(String recipientMail) {
        this.recipientMail = recipientMail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) {
        this.bod = bod;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "senderName='" + senderName + '\'' +
                ", senderMail='" + senderMail + '\'' +
                ", recipientMail='" + recipientMail + '\'' +
                ", subject='" + subject + '\'' +
                ", bod='" + bod + '\'' +
                '}';
    }
}
