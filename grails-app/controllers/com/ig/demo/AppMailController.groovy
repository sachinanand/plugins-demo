package com.ig.demo

class AppMailController {
    def mailService

    def sendFormalMail(params) {
        println("sendFormalMail..")
        mailService.sendMail {
            to "${params.email}"
            subject "${params.subject}"
            body "${params.body}"
        }
        flash.message="Mail Sent Successfully"
        redirect url:"/invitation/index"
    }

    def sendMailFromTemplate(){
        def emailId = params.email
        def subjectText = params.subject

        mailService.sendMail {
            to "${emailId}"
            subject "${subjectText}"
            html g.render(template:"myMailTemplate")
        }
    }


}
