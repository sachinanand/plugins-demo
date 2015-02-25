package com.ig.demo

import grails.transaction.Transactional

@Transactional
class CustomMailService {

    def mailService
    
    def sendMail() {
        mailService.sendMail {
            to "sachin@intelligrape.com"
            subject "Hello Sachin"
            body 'How are you?'
        }
    }
}
