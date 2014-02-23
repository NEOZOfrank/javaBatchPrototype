package com.javabatch.prototype.noduplicates;

import com.javabatch.prototype.common.Mail;
import org.springframework.batch.support.annotation.Classifier;

/**
 * User: Frank Hinkel
 */
public class MailDepartmentClassifier {

    @Classifier
    public String classify(Mail mail) throws Exception {
        String fileKey = Departments.UNKNOWN.getDepName();

        String recipient = mail.getRecipientMail();
        Departments department = EmployeeDB.employeeMap.get(recipient);

        if(department != null){
            fileKey = department.getDepName();
        }

        return fileKey;
    }
}
