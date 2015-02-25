<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<p>Hello!!!! Do you want to send any mail? Why don't you try here??</p>
<p>${flash.message}</p>
<g:form method="post" controller="invitation" action="sendMail">
    <span>Email:<g:textField name="email" id="email"></g:textField></span>
    <span>Subject:<g:textField name="subject" id="subject"></g:textField></span>
    <span>Text:<g:textField name="body" id="body"></g:textField></span>
    <span><g:submitButton name="Send Mail"></g:submitButton></span>
</g:form>

</body>
</html>