package com.ig.demo

class InvitationController {
    def index() {
    }

    def sendMail() {
        if (!params.email) {
            redirect(action: "index")
            flash.message = "you didn't provide EmailId. How the hell i would know "

        } else {
            String subject = params.subject?:"hi"
            String body = params.body?:"Greetings!!!!"
            redirect controller: "appMail", action: "sendFormalMail", params: [email: params.email, subject: subject, body: body]

        }
    }


}
