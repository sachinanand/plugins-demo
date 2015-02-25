package com.ig.demo

class AppMailController {
    def asynchronousMailService

    def sendFormalMail(params) {
        println("sendFormalMail..")
        asynchronousMailService.sendMail {
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

        asynchronousMailService.sendMail {
            to "${emailId}"
            subject "${subjectText}"
            html g.render(template:"myMailTemplate")
        }
    }


}
