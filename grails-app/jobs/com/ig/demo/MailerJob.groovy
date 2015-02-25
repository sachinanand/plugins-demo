package com.ig.demo

/**
 * Created by sachin on 25/02/15.
 */
class MailerJob {

    CustomMailService customMailService

    static triggers = {
//        cron name: 'myTrigger', cronExpression: "0 0/1 * 1/1 * ? *" // send email every 1 minute
        
    }

    def execute(){
       customMailService.sendMail()
    }
}
