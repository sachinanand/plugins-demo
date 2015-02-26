import com.ig.demo.User

class BootStrap {

    def init = { servletContext ->
        new User(firstName:'john',lastName:'doe',email:'john@doe.com',age: 23).save()
        new User(firstName:'sara',lastName:'johns',email:'sara@johns.com',age: 25).save()
        new User(firstName:'kelly',lastName:'treyon',email:'kellly@treyon.com',age: 27).save()
    }
    def destroy = {
    }
}
