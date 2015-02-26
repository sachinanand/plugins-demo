package com.ig.demo

class DummyController {

    def mailService
    def index() {

        // send a mail basic functionality
        mailService.sendMail {
            to "sachin@intelligrape.com"
            subject "Hello Mithu"
            body 'How are you?'
        }
    }

    def sendMailFromTemplate(){
        mailService.sendMail {
            to "sachin@intelligrape.com"
            subject "Hello Mithu"
            html g.render(template:"myMailTemplate")
        }
    }

    // exercise....

    // send a mail which contains an image as attachment.
    // async mail

    /*sendMail {
        async true
        to "john@g2one.com"
        subject "Hello John"
        html g.render(template:"myMailTemplate")
    }*/
}
