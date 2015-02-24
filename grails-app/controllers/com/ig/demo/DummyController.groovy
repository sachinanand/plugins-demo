package com.ig.demo

class DummyController {

    def mailService
    def index() {

        // send a mail basic functionality
        mailService.sendMail {
            to "sachin@intelligrape.com"
            subject "Hello Sachin"
            body 'How are you?'
        }
    }

    def sendMailFromTemplate(){
        mailService.sendMail {
            to "sachin@intelligrape.com"
            subject "Hello Sachin"
            html g.render(template:"myMailTemplate")
        }
    }
}
