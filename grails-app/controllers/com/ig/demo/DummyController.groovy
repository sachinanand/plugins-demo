package com.ig.demo

class DummyController {

    def mailService
    def index() {

        mailService.sendMail {
            to "sachin@intelligrape.com"
            subject "Hello Sachin"
            body 'How are you?'
        }

    }
}
